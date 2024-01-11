package br.com.abs.upapp.exceptions;

import br.com.abs.upapp.asserts.exceptions.AssertNotFoundException;
import br.com.abs.upapp.portfolio.exceptions.PortfolioNotFoundException;
import br.com.abs.upapp.user.exceptions.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
@RestController
public class CustomizeResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionResponse> handleAllExceptions(Exception ex, WebRequest webRequest){

        ExceptionResponse exceptionResponse =
                new ExceptionResponse(new Date(), ex.getMessage(),webRequest.getDescription(false));

        return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(UserNotFoundException.class)
    public final ResponseEntity<ExceptionResponse> handleUserNotFoundException(Exception ex, WebRequest webRequest){

        ExceptionResponse exceptionResponse =
                new ExceptionResponse(new Date(), ex.getMessage(),webRequest.getDescription(false));

        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DuplicateException.class)
    public final ResponseEntity<ExceptionResponse> handleDuplicateEmailException(Exception ex, WebRequest webRequest){

        ExceptionResponse exceptionResponse =
                new ExceptionResponse(new Date(), ex.getMessage(),webRequest.getDescription(false));

        return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(AssertNotFoundException.class)
    public final ResponseEntity<ExceptionResponse> handleAssertNotFoundException(Exception ex, WebRequest webRequest){

        ExceptionResponse exceptionResponse =
                new ExceptionResponse(new Date(), ex.getMessage(),webRequest.getDescription(false));

        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(PortfolioNotFoundException.class)
    public final ResponseEntity<ExceptionResponse> handlePortfolioNotFoundException(Exception ex, WebRequest webRequest){

        ExceptionResponse exceptionResponse =
                new ExceptionResponse(new Date(), ex.getMessage(),webRequest.getDescription(false));

        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
    }


}

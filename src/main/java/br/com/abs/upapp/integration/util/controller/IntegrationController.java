package br.com.abs.upapp.integration.util.controller;


import br.com.abs.upapp.integration.brapi.model.IntegrationSupplier;
import br.com.abs.upapp.integration.util.service.IntegrationFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/integration")
public class IntegrationController {

    @GetMapping("/brapi")
    @ResponseStatus(HttpStatus.OK)
    public void initBrapi(){
        IntegrationFactory.getIntegration(IntegrationSupplier.BRAPI).init();
    }

}

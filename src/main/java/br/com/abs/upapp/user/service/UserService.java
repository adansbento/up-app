package br.com.abs.upapp.user.service;

import br.com.abs.upapp.exceptions.UserNotFoundException;
import br.com.abs.upapp.user.dto.UserDto;
import java.util.List;


public interface UserService {

    void create(UserDto userDto);
    UserDto findById(Long idUser) throws UserNotFoundException;
    List<UserDto> findAll();

}

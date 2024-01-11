package br.com.abs.upapp.user.service;

import br.com.abs.upapp.user.dto.UserDto;
import br.com.abs.upapp.user.exceptions.UserNotFoundException;

import java.util.List;


public interface UserService {

    void create(UserDto userDto);
    UserDto findById(Long idUser) throws UserNotFoundException;
    List<UserDto> findAll();

    void delete(Long idUser) throws UserNotFoundException;
}

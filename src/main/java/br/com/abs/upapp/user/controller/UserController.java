package br.com.abs.upapp.user.controller;


import br.com.abs.upapp.user.dto.UserDto;
import br.com.abs.upapp.user.exceptions.UserNotFoundException;
import br.com.abs.upapp.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody UserDto userDto){
        userService.create(userDto);
    }
    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody UserDto userDto){
        userService.update(userDto);
    }
    @GetMapping(path = "{idUser}")
    public UserDto findById(@PathVariable Long idUser) throws UserNotFoundException {
        return userService.findById(idUser);
    }

    @DeleteMapping(path = "{idUser}")
    public void delete(@PathVariable  Long idUser) throws UserNotFoundException {
        userService.delete(idUser);
    }
    @GetMapping()
    public List<UserDto> findAll(){
        return  userService.findAll();
    }
}

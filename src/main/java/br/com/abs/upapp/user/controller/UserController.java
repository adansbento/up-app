package br.com.abs.upapp.user.controller;


import br.com.abs.upapp.exceptions.UserNotFoundException;
import br.com.abs.upapp.user.service.UserService;
import br.com.abs.upapp.user.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody UserDto userDto){
        userService.create(userDto);
    }
    @RequestMapping(method = RequestMethod.GET,path = "{idUser}")
    public UserDto findById(@PathVariable  Long idUser) throws UserNotFoundException {
        return userService.findById(idUser);
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<UserDto> findAll(){
        return  userService.findAll();
    }
}

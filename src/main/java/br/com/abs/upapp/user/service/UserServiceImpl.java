package br.com.abs.upapp.user.service;

import br.com.abs.upapp.exceptions.UserNotFoundException;
import br.com.abs.upapp.user.entity.User;
import br.com.abs.upapp.user.repository.UserRepository;
import br.com.abs.upapp.user.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void create(UserDto userDto){
        userRepository.save(new User(userDto));
    }
    public UserDto findById(Long idUser) throws UserNotFoundException {
        User user = userRepository.findById(idUser).orElseThrow(() -> new UserNotFoundException("User id:" + idUser + " not found"));
        return new UserDto(user);
    }

    public List<UserDto> findAll() {
        return userRepository.findAll().stream().map(UserDto::new).collect(Collectors.toList());
    }

}

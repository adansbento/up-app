package br.com.abs.upapp.user.service;

import br.com.abs.upapp.exceptions.DuplicateException;
import br.com.abs.upapp.user.dto.UserDto;
import br.com.abs.upapp.user.entity.User;
import br.com.abs.upapp.user.exceptions.UserNotFoundException;
import br.com.abs.upapp.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void create(UserDto userDto){

        boolean existsEmail = userRepository.existsByEmail(userDto.getEmail());

        if(existsEmail){
            throw new DuplicateException("Email já cadastrado");
        }
        userRepository.save(new User(userDto));
    }
    public UserDto findById(Long idUser) throws UserNotFoundException {
        User user = userRepository.findById(idUser).orElseThrow(() -> new UserNotFoundException("User id: " + idUser + " not found"));
        return new UserDto(user);
    }

    public List<UserDto> findAll() {
        return userRepository.findAll().stream().map(UserDto::new).toList();
    }

    @Override
    public void delete(Long idUser) throws UserNotFoundException {
        Long userId = findById(idUser).getId();
        userRepository.deleteById(userId);
    }

}

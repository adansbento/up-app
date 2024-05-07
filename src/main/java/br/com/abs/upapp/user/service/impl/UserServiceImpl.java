package br.com.abs.upapp.user.service.impl;

import br.com.abs.upapp.exceptions.DuplicateException;
import br.com.abs.upapp.user.dto.UserDto;
import br.com.abs.upapp.user.entity.User;
import br.com.abs.upapp.user.exceptions.UserNotFoundException;
import br.com.abs.upapp.user.mapper.UserMapper;
import br.com.abs.upapp.user.repository.UserRepository;
import br.com.abs.upapp.user.service.UserService;
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

        boolean existsEmail = userRepository.existsByEmail(userDto.email());

        if(existsEmail){
            throw new DuplicateException("Email já cadastrado.");
        }

        userRepository.save(UserMapper.INSTANCE.userDtoToUser(userDto));
    }
    public UserDto findById(Long idUser) throws UserNotFoundException {
        User user = userRepository.findById(idUser).orElseThrow(() -> new UserNotFoundException("Usuario com id: " + idUser + " não encontrado."));
        return UserMapper.INSTANCE.userToUserDto(user);
    }

    public List<UserDto> findAll() {
       return UserMapper.INSTANCE.userToUserDtos(userRepository.findAll());
    }

    @Override
    public void delete(Long idUser) throws UserNotFoundException {
        Long userId = findById(idUser).id();
        userRepository.deleteById(userId);
    }

    @Override
    public void update(UserDto userDto) {

        boolean existsEmail = userRepository.existsByEmail(userDto.email());
        UserDto userDtoFromDB = findById(userDto.id());

        if(!userDtoFromDB.email().equals(userDto.email()) && existsEmail){
            throw new DuplicateException("Email já cadastrado.");
        }
        userRepository.save(UserMapper.INSTANCE.userDtoToUser(userDto));
    }

}

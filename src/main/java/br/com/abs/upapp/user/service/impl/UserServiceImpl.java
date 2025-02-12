package br.com.abs.upapp.user.service.impl;

import br.com.abs.upapp.exceptions.DuplicateException;
import br.com.abs.upapp.user.dto.UserDto;
import br.com.abs.upapp.user.entity.User;
import br.com.abs.upapp.user.exceptions.UserNotFoundException;
import br.com.abs.upapp.user.mapper.UserMapper;
import br.com.abs.upapp.user.repository.UserRepository;
import br.com.abs.upapp.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final MessageSource messageSource;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, MessageSource messageSource) {
        this.userRepository = userRepository;
        this.messageSource = messageSource;
    }

    public void create(UserDto userDto) {
        boolean existsEmail = userRepository.existsByEmail(userDto.email());
        if (existsEmail) {
            String message = messageSource.getMessage("error.email.duplicate", null, Locale.getDefault());
            throw new DuplicateException(message);
        }
        userRepository.save(UserMapper.INSTANCE.userDtoToUser(userDto));
    }

    public UserDto findById(Long idUser) throws UserNotFoundException {
        User user = userRepository
                .findById(idUser)
                .orElseThrow(() -> {
                    String message = messageSource.getMessage("error.user.notfound", new Object[]{idUser}, Locale.getDefault());
                    return new UserNotFoundException(message);
                });
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

        if (!userDtoFromDB.email().equals(userDto.email()) && existsEmail) {
            String message = messageSource.getMessage("error.email.duplicate", null, Locale.getDefault());
            throw new DuplicateException(message);
        }
        userRepository.save(UserMapper.INSTANCE.userDtoToUser(userDto));
    }
}
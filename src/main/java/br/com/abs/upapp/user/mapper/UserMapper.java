package br.com.abs.upapp.user.mapper;

import br.com.abs.upapp.user.dto.UserDto;
import br.com.abs.upapp.user.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );

    UserDto userToUserDto(User user);
    User userDtoToUser(UserDto user);
    List<UserDto> userToUserDtos(List<User> users);
    List<User> userDtoToUsers(List<UserDto> userDtos);
}

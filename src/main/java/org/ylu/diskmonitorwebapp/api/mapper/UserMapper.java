package org.ylu.diskmonitorwebapp.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.ylu.diskmonitorwebapp.api.model.UserDTO;
import org.ylu.diskmonitorwebapp.domain.User;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    User userDTOToUser(UserDTO userDTO);
    UserDTO userToUserDTO(User user);
}

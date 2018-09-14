package org.ylu.diskmonitorwebapp.services;

import org.ylu.diskmonitorwebapp.api.model.UserDTO;

import java.util.List;

public interface UserService {
    List<String> listAllUserIds();
    List<UserDTO> saveUsers(List<UserDTO> userDTOs);
}

package org.ylu.diskmonitorwebapp.services;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.ylu.diskmonitorwebapp.api.mapper.UserMapper;
import org.ylu.diskmonitorwebapp.api.model.UserDTO;
import org.ylu.diskmonitorwebapp.domain.User;
import org.ylu.diskmonitorwebapp.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    UserRepository userRepository;
    UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public List<String> listAllUserIds() {
        return userRepository.findAllUserIds();
    }

    @Override
    public List<UserDTO> saveUsers(List<UserDTO> userDTOs) {
        List<User> users = userDTOs.stream()
                .map(userDTO -> userMapper.userDTOToUser(userDTO))
                .collect(Collectors.toList());
        // save into repository
        Iterable<User> returnUsers = userRepository.saveAll(users);

        // prepare return data
        List<UserDTO> ret = new ArrayList<>();
        for(User u : returnUsers) {
            ret.add(userMapper.userToUserDTO(u));
        }
        return ret;
    }
}

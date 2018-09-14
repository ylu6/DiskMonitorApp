package org.ylu.diskmonitorwebapp;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.ylu.diskmonitorwebapp.api.mapper.UserMapper;
import org.ylu.diskmonitorwebapp.api.model.UserDTO;
import org.ylu.diskmonitorwebapp.domain.User;

@SpringBootTest
public class UserMapperTest {
    UserMapper userMapper = UserMapper.INSTANCE;

    @Test
    public void userDTOToUser(){
        UserDTO userDTO = new UserDTO();
        userDTO.setId("yeqing");
        userDTO.setEmail("yeqing@synopsys.com");
        userDTO.setFirstName("yeqing");
        userDTO.setLastName("lu");
        User user = userMapper.userDTOToUser(userDTO);
        System.out.println(user.getId());
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getEmail());
    }

}

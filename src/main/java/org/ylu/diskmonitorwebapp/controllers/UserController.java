package org.ylu.diskmonitorwebapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.ylu.diskmonitorwebapp.api.model.DiskAvailableDTO;
import org.ylu.diskmonitorwebapp.api.model.UserDTO;
import org.ylu.diskmonitorwebapp.services.UserService;

import java.util.List;

@RestController
@RequestMapping(UserController.BASE_URL)
public class UserController {
    public static final String BASE_URL = "/api/users";
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<String> listUserIds() {
        return userService.listAllUserIds();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<UserDTO> addUsers(@RequestBody List<UserDTO> userDTOs) {
        return userService.saveUsers(userDTOs);
    }
}

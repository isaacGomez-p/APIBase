package com.api.BaseAPI.Controllers;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/getUsers")
    public ApiResponse getUsers(){
        return this.userService.read();
    }

}
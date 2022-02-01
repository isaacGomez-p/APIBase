package com.api.BaseAPI.Controllers;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Domains.UserEntity;
import com.api.BaseAPI.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/list")
    public ApiResponse getUsers(){
        return this.userService.read();
    }

    @GetMapping(value = "/getById")
    public ApiResponse getUserById(@RequestParam Integer userId){
        return this.userService.readById(userId);
    }

    @PostMapping(value = "/save")
    public ApiResponse saveUser(@RequestBody UserEntity user){
        return this.userService.create(user);
    }

}
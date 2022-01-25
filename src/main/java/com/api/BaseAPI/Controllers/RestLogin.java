package com.api.BaseAPI.Controllers;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Domains.UserEntity;
import com.api.BaseAPI.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class RestLogin {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/validation")
    public ApiResponse saveUser(@RequestBody UserEntity user){
        return this.userService.login(user.getDocument(), user.getPassword());
    }

}

package com.api.BaseAPI.Controllers;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Domains.LandEntity;
import com.api.BaseAPI.Domains.UserEntity;
import com.api.BaseAPI.Services.LandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.PathParam;

@RestController
@RequestMapping("/land")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class LandController {

    @Autowired
    private LandService landService;

    @GetMapping(value = "/getLands")
    public ApiResponse getLands(@RequestParam Long idUsuario){
        return this.landService.read(idUsuario);
    }

    @PostMapping(value = "/saveLand")
    public ApiResponse saveUser(@RequestBody LandEntity land){
        return this.landService.create(land);
    }

}

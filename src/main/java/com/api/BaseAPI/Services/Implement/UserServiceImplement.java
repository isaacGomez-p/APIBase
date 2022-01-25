package com.api.BaseAPI.Services.Implement;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Domains.UserEntity;
import com.api.BaseAPI.Repositories.IUserRepo;
import com.api.BaseAPI.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplement implements UserService {

    @Autowired
    private IUserRepo userRepo;

    @Override
    public ApiResponse readById(Integer id) {
        return null;
    }

    @Override
    public ApiResponse create(UserEntity user) {
        System.out.println(" user: "+ user.toString());
        this.userRepo.save(user);
        return new ApiResponse(HttpStatus.OK, "Usuario registrado", user);
    }

    @Override
    public ApiResponse update(UserEntity userDTO) {
        return null;
    }

    @Override
    public ApiResponse read() {
        return new ApiResponse(HttpStatus.OK, "Usuarios registrados", this.userRepo.findAll());
    }

    @Override
    public ApiResponse delete(Integer id) {
        return null;
    }

    @Override
    public ApiResponse login(String document, String password) {
        List<UserEntity> users = this.userRepo.findAll();
        for(int i = 0; i < users.size(); i ++){
            if(users.get(i).getDocument().equals(document) && users.get(i).getPassword().equals(password)){
                return new ApiResponse(HttpStatus.OK, "Usuarios registrados", users.get(i));
            }
        }
        return new ApiResponse(HttpStatus.NOT_FOUND, "Usuarios registrados", null);
    }
}

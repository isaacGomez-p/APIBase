package com.api.BaseAPI.Services.Implement;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Domains.UserEntity;
import com.api.BaseAPI.Repositories.IUserRepo;
import com.api.BaseAPI.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

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
        return null;
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
}

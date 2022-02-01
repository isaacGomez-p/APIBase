package com.api.BaseAPI.Services.Implement;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Domains.UserEntity;
import com.api.BaseAPI.Repositories.IUserRepo;
import com.api.BaseAPI.Services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserImplement implements UserService {

    @Autowired
    private IUserRepo userRepo;

    @Override
    public ApiResponse readById(Integer id) {
        Optional<UserEntity> optionalUserEntity = userRepo.findById(id);
        return optionalUserEntity.map(userEntity ->
                new ApiResponse(HttpStatus.OK, "Usuario encontrado", userEntity)).orElseGet(() ->
                new ApiResponse(HttpStatus.NOT_FOUND, "No se encontró el usuario", null));
    }

    @Override
    public ApiResponse create(UserEntity user) {
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
    public ApiResponse login(UserEntity userEntity) {
        Optional<UserEntity> optionalUserEntity = userRepo.findByDocumentAndPassword(userEntity.getDocument(), userEntity.getPassword());

        return optionalUserEntity.map(entity ->
                new ApiResponse(HttpStatus.OK, "Usuario encontrado.", entity)).orElseGet(() ->
                new ApiResponse(HttpStatus.NOT_FOUND, "No se encontró el usuario", null));

    }
}

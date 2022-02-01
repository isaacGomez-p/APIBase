package com.api.BaseAPI.Services.Implement;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Domains.LandEntity;
import com.api.BaseAPI.Domains.UserEntity;
import com.api.BaseAPI.Repositories.ILandRepo;
import com.api.BaseAPI.Repositories.IUserRepo;
import com.api.BaseAPI.Services.LandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LandImplement implements LandService {

    @Autowired
    private ILandRepo landRepo;

    @Autowired
    private IUserRepo userRepo;

    @Override
    public ApiResponse readById(Integer id) {
        return null;
    }

    @Override
    public ApiResponse create(LandEntity land) {
        this.landRepo.save(land);
        return new ApiResponse(HttpStatus.OK, "Usuario registrado", land);
    }

    @Override
    public ApiResponse update(LandEntity userDTO) {
        return null;
    }

    @Override
    public ApiResponse read() {
        return new ApiResponse(HttpStatus.OK, "Usuario registrado", this.landRepo.findAll());
    }

    @Override
    public ApiResponse read(Integer userId) {
        Optional<UserEntity> optionalUserEntity = userRepo.findById(userId);
        if(!optionalUserEntity.isPresent()){
            return new ApiResponse(HttpStatus.NOT_FOUND, "No se ecnontró el usuario");
        }
        UserEntity userEntity = optionalUserEntity.get();
        Optional<LandEntity> optional = landRepo.findByUser(userEntity);
        return optional.map(
                landEntity -> new ApiResponse(HttpStatus.OK, "Fincas registradas por el usuario", landEntity))
                .orElseGet(() -> new ApiResponse(HttpStatus.CONFLICT, "Finca no encontrada"));
    }

    @Override
    public ApiResponse delete(Integer id) {
        return null;
    }
}

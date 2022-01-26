package com.api.BaseAPI.Services.Implement;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Domains.LandEntity;
import com.api.BaseAPI.Repositories.ILandRepo;
import com.api.BaseAPI.Services.LandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LandServiceImplement implements LandService {

    @Autowired
    private ILandRepo landRepo;

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
    public ApiResponse read(Long idUsuario) {
        List<LandEntity> search = this.landRepo.findAll();

        List<LandEntity> lands = new ArrayList<>();
        for (LandEntity landEntity : search) {
            if (landEntity.getUser().getId().equals(idUsuario)) {
                lands.add(landEntity);
            }
        }
        return new ApiResponse(HttpStatus.OK, "Fincas registradas por el usuario", lands);
    }

    @Override
    public ApiResponse delete(Integer id) {
        return null;
    }
}

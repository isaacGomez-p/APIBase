package com.api.BaseAPI.Services.Implement;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Domains.LandEntity;
import com.api.BaseAPI.Domains.PlantingMapEntity;
import com.api.BaseAPI.Domains.UserEntity;
import com.api.BaseAPI.Repositories.ILandRepo;
import com.api.BaseAPI.Repositories.IPlantingMapRepo;
import com.api.BaseAPI.Repositories.IUserRepo;
import com.api.BaseAPI.Services.PlantingMapService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlantingMapImplement implements PlantingMapService {

    @Autowired
    private IPlantingMapRepo plantingMapRepo;

    @Autowired
    private ILandRepo landRepo;

    @Autowired
    private IUserRepo userRepo;

    @Override
    public ApiResponse create(PlantingMapEntity classs) {
        return new ApiResponse(HttpStatus.OK, "Plano de siembra insertado correctamente", plantingMapRepo.save(classs));
    }

    @Override
    public ApiResponse readById(Long id) {
        return null;
    }

    @Override
    public ApiResponse update(PlantingMapEntity classDTO) {
        return null;
    }

    @Override
    public ApiResponse read(Integer userId) {
        Optional<UserEntity> optionalUserEntity = userRepo.findById(userId.longValue());
        if(!optionalUserEntity.isPresent()){
            return new ApiResponse(HttpStatus.NOT_FOUND, "Usuario no encontrado");
        }

        List<LandEntity> landEntities = optionalUserEntity.get().getLands();

        List<PlantingMapEntity> plantingMapEntities = new ArrayList<>();
        for(LandEntity landEntity: landEntities){
            plantingMapEntities.addAll(plantingMapRepo.findByLand(landEntity));
        }
        return new ApiResponse(HttpStatus.OK, "Siembras encontradas", plantingMapEntities);
    }

    @Override
    public ApiResponse read() {
        return null;
    }

    @Override
    public ApiResponse delete(Long id) {
        return null;
    }
}

package com.api.BaseAPI.Services;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Domains.LandEntity;
import com.api.BaseAPI.Domains.PlantingMapEntity;
import com.api.BaseAPI.Domains.UserEntity;

import java.util.List;

public interface PlantingMapService extends AbstractServiceCRUD<PlantingMapEntity, Long> {

    @Override
    ApiResponse create(PlantingMapEntity classs);

    @Override
    ApiResponse readById(Long id);

    @Override
    ApiResponse update(PlantingMapEntity classDTO);

    ApiResponse read(Integer userId);

    @Override
    ApiResponse delete(Long id);
}

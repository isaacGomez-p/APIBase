package com.api.BaseAPI.Services;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Domains.LandEntity;
import com.api.BaseAPI.Domains.UserEntity;

public interface LandService extends AbstractServiceCRUD<LandEntity, Integer>{

    public ApiResponse readById(Integer id);

    public ApiResponse create(LandEntity land);

    public ApiResponse update(LandEntity landDTO);

    public ApiResponse read(Integer userId);

    public ApiResponse delete(Integer id);


}

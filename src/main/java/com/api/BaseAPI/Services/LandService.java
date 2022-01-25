package com.api.BaseAPI.Services;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Domains.LandEntity;

public interface LandService extends AbstractServiceCRUD<LandEntity, Integer>{

    public ApiResponse readById(Integer id);

    public ApiResponse create(LandEntity land);

    public ApiResponse update(LandEntity landDTO);

    public ApiResponse read();

    public ApiResponse delete(Integer id);


}

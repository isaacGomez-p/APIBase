package com.api.BaseAPI.Services;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Domains.UserEntity;
import org.springframework.stereotype.Service;

public interface UserService extends AbstractServiceCRUD<UserEntity, Integer>{

    public ApiResponse readById(Integer id);

    public ApiResponse create(UserEntity user);

    public ApiResponse update(UserEntity userDTO);

    public ApiResponse read();

    public ApiResponse delete(Integer id);
}

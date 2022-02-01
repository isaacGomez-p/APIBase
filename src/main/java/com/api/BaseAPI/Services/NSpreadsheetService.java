package com.api.BaseAPI.Services;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Domains.NSpreadsheetEntity;
import com.api.BaseAPI.Domains.UserEntity;

public interface NSpreadsheetService extends AbstractServiceCRUD<NSpreadsheetEntity, Integer>{

    @Override
    ApiResponse create(NSpreadsheetEntity classs);

    @Override
    ApiResponse readById(Integer id);

    @Override
    ApiResponse update(NSpreadsheetEntity classDTO);

    ApiResponse read(UserEntity userEntity);

    @Override
    ApiResponse delete(Integer id);
}

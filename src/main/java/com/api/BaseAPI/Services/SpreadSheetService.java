package com.api.BaseAPI.Services;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Domains.SpreadsheetEntity;

public interface SpreadSheetService extends AbstractServiceCRUD<SpreadsheetEntity, Integer> {

    @Override
    ApiResponse create(SpreadsheetEntity classs);

    @Override
    ApiResponse readById(Integer id);

    @Override
    ApiResponse update(SpreadsheetEntity classDTO);

    @Override
    ApiResponse read();

    @Override
    ApiResponse delete(Integer id);
}

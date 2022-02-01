package com.api.BaseAPI.Services.Implement;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Domains.SpreadsheetEntity;
import com.api.BaseAPI.Services.SpreadSheetService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SpreadsheetImplement implements SpreadSheetService {

    @Override
    public ApiResponse create(SpreadsheetEntity classs) {
        //Optional<>
        return null;
    }

    @Override
    public ApiResponse readById(Integer id) {
        return null;
    }

    @Override
    public ApiResponse update(SpreadsheetEntity classDTO) {
        return null;
    }

    @Override
    public ApiResponse read() {
        return null;
    }

    @Override
    public ApiResponse delete(Integer id) {
        return null;
    }
}

package com.api.BaseAPI.Services.Implement;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Domains.NSpreadsheetEntity;
import com.api.BaseAPI.Domains.UserEntity;
import com.api.BaseAPI.Repositories.INSpreadsheetRepo;
import com.api.BaseAPI.Services.NSpreadsheetService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NSpreadsheetImplement implements NSpreadsheetService {

    @Autowired
    private INSpreadsheetRepo spreadsheetRepo;

    @Override
    public ApiResponse create(NSpreadsheetEntity classs) {
        spreadsheetRepo.save(classs);
        return new ApiResponse(HttpStatus.OK, "N Planilla insertada correctamente");
    }

    @Override
    public ApiResponse readById(Integer id) {
        return null;
    }

    @Override
    public ApiResponse update(NSpreadsheetEntity classDTO) {
        return null;
    }

    @Override
    public ApiResponse read() {
        return null;
    }

    @Override
    public ApiResponse read(UserEntity userEntity) {
        List<NSpreadsheetEntity> spreadsheetEntities = spreadsheetRepo.findByUser(userEntity);

        if(spreadsheetEntities.isEmpty()){
            return new ApiResponse(HttpStatus.NOT_FOUND, "No se encontraron registros", null);
        }else{
            return new ApiResponse(HttpStatus.OK, "Planillas del usuario encontradas", spreadsheetEntities);
        }
    }

    @Override
    public ApiResponse delete(Integer id) {
        return null;
    }
}

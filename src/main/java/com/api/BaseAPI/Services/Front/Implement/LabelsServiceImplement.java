package com.api.BaseAPI.Services.Front.Implement;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Repositories.Front.ILabelsRepo;
import com.api.BaseAPI.Services.Front.LabelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class LabelsServiceImplement implements LabelsService {

     @Autowired
     private ILabelsRepo labelsRepo;

    @Override
    public ApiResponse getLabels() {
        return new ApiResponse(HttpStatus.OK, "Labels", labelsRepo.findAll());
    }
}

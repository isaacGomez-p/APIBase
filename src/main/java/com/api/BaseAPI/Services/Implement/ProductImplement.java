package com.api.BaseAPI.Services.Implement;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Domains.ProductEntity;
import com.api.BaseAPI.Repositories.IProductRepo;
import com.api.BaseAPI.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ProductImplement implements ProductService {

    @Autowired
    private IProductRepo iProductRepo;

    @Override
    public ApiResponse create(ProductEntity classs) {
        return new ApiResponse(HttpStatus.OK, "Producto insertado correctamente", iProductRepo.save(classs));
    }

    @Override
    public ApiResponse readById(Long id) {
        return null;
    }

    @Override
    public ApiResponse update(ProductEntity classDTO) {
        return null;
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

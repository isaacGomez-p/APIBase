package com.api.BaseAPI.Services;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Domains.ProductEntity;

public interface ProductService extends AbstractServiceCRUD<ProductEntity, Long> {

    @Override
    ApiResponse create(ProductEntity classs);

    @Override
    ApiResponse readById(Long id);

    @Override
    ApiResponse update(ProductEntity classDTO);

    @Override
    ApiResponse read();

    @Override
    ApiResponse delete(Long id);
}

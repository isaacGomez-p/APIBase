package com.api.BaseAPI.Services;

import com.api.BaseAPI.Domains.ApiResponse;

//C -> Class
//I -> Integer
public abstract interface AbstractServiceCRUD<C, I> {

    public ApiResponse create(C classs);

    public ApiResponse readById(I id);

    public ApiResponse update(C classDTO);

    public ApiResponse read();

    public ApiResponse delete(I id);

}

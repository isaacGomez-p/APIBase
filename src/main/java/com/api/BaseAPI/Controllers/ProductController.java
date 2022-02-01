package com.api.BaseAPI.Controllers;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Domains.ProductEntity;
import com.api.BaseAPI.Domains.UserEntity;
import com.api.BaseAPI.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(value = "/save")
    public ApiResponse saveProduct(@RequestBody ProductEntity productEntity){
        return productService.create(productEntity);
    }

}

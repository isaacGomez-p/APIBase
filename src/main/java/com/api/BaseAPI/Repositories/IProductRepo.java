package com.api.BaseAPI.Repositories;

import com.api.BaseAPI.Domains.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepo extends JpaRepository<ProductEntity, Long> {



}

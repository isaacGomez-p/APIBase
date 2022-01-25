package com.api.BaseAPI.Repositories;

import com.api.BaseAPI.Domains.LandEntity;
import com.api.BaseAPI.Domains.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILandRepo extends JpaRepository<LandEntity, Long> {

}

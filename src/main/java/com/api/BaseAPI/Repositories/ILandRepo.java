package com.api.BaseAPI.Repositories;

import com.api.BaseAPI.Domains.LandEntity;
import com.api.BaseAPI.Domains.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ILandRepo extends JpaRepository<LandEntity, Long> {

    Optional<LandEntity> findByUser(UserEntity userEntity);

}

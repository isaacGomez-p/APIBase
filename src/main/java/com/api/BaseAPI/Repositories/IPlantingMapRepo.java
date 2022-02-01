package com.api.BaseAPI.Repositories;

import com.api.BaseAPI.Domains.LandEntity;
import com.api.BaseAPI.Domains.PlantingMapEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPlantingMapRepo extends JpaRepository<PlantingMapEntity, Long> {

    List<PlantingMapEntity> findByLand(LandEntity landEntity);

}

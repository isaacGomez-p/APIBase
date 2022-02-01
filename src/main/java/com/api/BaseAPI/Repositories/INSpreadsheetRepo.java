package com.api.BaseAPI.Repositories;

import com.api.BaseAPI.Domains.NSpreadsheetEntity;
import com.api.BaseAPI.Domains.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface INSpreadsheetRepo extends JpaRepository<NSpreadsheetEntity, Long> {

    List<NSpreadsheetEntity> findByUser(UserEntity userEntity);

}

package com.api.BaseAPI.Repositories;

import com.api.BaseAPI.Domains.SpreadsheetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISpreadsheetRepo extends JpaRepository<SpreadsheetEntity, Long> {

}

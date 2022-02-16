package com.api.BaseAPI.Repositories.Front;

import com.api.BaseAPI.Domains.Front.LabelsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILabelsRepo extends JpaRepository<LabelsEntity, Long> {
}

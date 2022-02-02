package com.api.BaseAPI.Repositories;

import com.api.BaseAPI.Domains.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepo extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByDocumentAndPassword(String username, String password);

}

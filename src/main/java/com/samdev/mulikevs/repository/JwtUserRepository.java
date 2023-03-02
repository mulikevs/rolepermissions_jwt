package com.samdev.mulikevs.repository;

import com.samdev.mulikevs.entity.JwtUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JwtUserRepository extends JpaRepository<JwtUser, Long> {

    JwtUser findJwtUserByUsername(String username);
   JwtUser findJwtUserByEmail(String email);



}

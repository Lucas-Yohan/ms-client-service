package com.ms_microservices.hr_user.repositories;

import com.ms_microservices.hr_user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

package com.example.Login.Management.System.repository;

import com.example.Login.Management.System.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}

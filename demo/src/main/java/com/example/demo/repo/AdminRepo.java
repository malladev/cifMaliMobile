package com.example.demo.repo;

import com.example.demo.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Long> {
    public Admin findByLoginAndPassword(String login, String password);
}

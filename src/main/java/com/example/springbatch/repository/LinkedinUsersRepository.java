package com.example.springbatch.repository;

import com.example.springbatch.data.LinkedinUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkedinUsersRepository extends JpaRepository<LinkedinUsers, Long> {
}

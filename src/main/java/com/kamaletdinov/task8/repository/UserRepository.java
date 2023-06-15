package com.kamaletdinov.task8.repository;

import com.kamaletdinov.task8.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {


}

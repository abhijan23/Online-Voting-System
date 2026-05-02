package com.voting.online_voting_system.repository;

import com.voting.online_voting_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

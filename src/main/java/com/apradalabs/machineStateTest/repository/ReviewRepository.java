package com.apradalabs.machineStateTest.repository;

import com.apradalabs.machineStateTest.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}

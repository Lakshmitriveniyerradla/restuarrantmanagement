package com.example.restaurant.repository;

import com.example.restaurant.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayementRepository extends JpaRepository<Payment,Long> {

}

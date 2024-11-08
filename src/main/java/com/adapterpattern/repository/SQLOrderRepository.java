package com.adapterpattern.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adapterpattern.entity.Order;

@Repository
public interface SQLOrderRepository extends JpaRepository<Order, Long> {

}

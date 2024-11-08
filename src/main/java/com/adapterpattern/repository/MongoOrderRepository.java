package com.adapterpattern.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.adapterpattern.entity.MongoOrder;

@Repository
public interface MongoOrderRepository extends MongoRepository<MongoOrder, String>{

}

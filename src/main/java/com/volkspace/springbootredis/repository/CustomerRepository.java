package com.volkspace.springbootredis.repository;

import java.util.List;

import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.repository.CrudRepository;

import com.volkspace.springbootredis.model.Customer;

@EnableRedisRepositories
public interface CustomerRepository extends CrudRepository<Customer, String> {

	List<Customer> findByFirstName(String firstName);
	
}

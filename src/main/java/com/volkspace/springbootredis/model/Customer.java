package com.volkspace.springbootredis.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Data;

@Data
@RedisHash("customer")
public class Customer {

	@Id
	private String id;
	@NotNull
	private String firstName;
	@NotNull
	private String lastName;
	@NotNull
	private Integer age;
	@Email
	private String email;

}

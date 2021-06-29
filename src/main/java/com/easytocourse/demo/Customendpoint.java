package com.easytocourse.demo;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="myendpoint")
public class Customendpoint {

	@ReadOperation
	public String myendpointmethod()
	{
		return "this is from custom endpoint";
	}
	
	@WriteOperation
	public String helloNameBody(@Selector String name)
	{
	  return "Hello " + name;
	}
}

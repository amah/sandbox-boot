package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Component
@Path("/")
public class HelloController {

	@GET
	@Path("hello")
	@Produces(MediaType.APPLICATION_JSON)
	public String hello(){
		return "{msg='Hello'}";
	}
}

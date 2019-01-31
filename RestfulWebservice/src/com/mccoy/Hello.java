package com.mccoy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

@Path("/helloworld")
public class Hello {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{name}")
	public String gethello(@Context HttpHeaders httpheaders ,@PathParam("name") String name )
	{
		return "Hello World ,My name is: "+name;
	}
}

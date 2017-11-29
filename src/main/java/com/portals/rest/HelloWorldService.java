package com.portals.rest;
 
import com.google.appengine.repackaged.com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class HelloWorldService {
 
	@GET
	@Path("/getJerseySay")
	public Response getMsg(@QueryParam("name") String msg) {
		Person person = new Person(msg);

		Gson gson = new Gson();
 
		return Response.status(200).entity(gson.toJson(person)).build();
 
	}
 
}
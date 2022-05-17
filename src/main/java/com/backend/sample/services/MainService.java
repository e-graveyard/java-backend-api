package com.backend.sample.services;

import com.backend.sample.logging.Logged;

import java.io.IOException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Path("/v1")
public class MainService
{
    @GET
    @Path("/hello")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    @Logged
	public Response hello() throws JsonParseException, JsonMappingException, IOException
    {
		return Response.status(200).entity("hello").build();
    }
}

package com.sebastian.micro.thorn;

import javax.json.Json;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * 
 * @author Sebastian Avila A.
 *
 */
@Path("/")
public class Recursos {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response get() {
    return Response.ok(Json.createObjectBuilder().add("micro", "profile")
        .add("java", System.getProperty("java.version")).build()).build();
  }
}

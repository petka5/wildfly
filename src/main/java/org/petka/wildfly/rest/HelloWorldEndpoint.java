package org.petka.wildfly.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.jboss.logging.Logger;

@Path("/hello")
public class HelloWorldEndpoint {

    private static final Logger log = Logger.getLogger(HelloWorldEndpoint.class);

    @GET
    @Produces("text/plain")
    public Response doGet() {
        log.debug("This is DEBUG message");

        return Response.ok("Hello from WildFly Swarm!").build();
    }
}
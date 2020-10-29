package io.xstefank;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ping")
public class PingResource {

    @Inject
    GreetingConfiguration greetingConfiguration;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return greetingConfiguration.message() + " " + greetingConfiguration.getName().orElse("world") + greetingConfiguration.getSuffix();
    }
}

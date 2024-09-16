package org.matrix.delegator;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path(".well-known/matrix")
@Produces(MediaType.APPLICATION_JSON)
public class WellKnownResource {

    @ConfigProperty(name = "server.url", defaultValue = "matrix.org:443")
    String serverUrl;

    @GET
    @Path("server")
    public ServerConfig getServerConfig() {
        return new ServerConfig(serverUrl);
    }

} 
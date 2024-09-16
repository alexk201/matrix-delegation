package org.matrix.delegator;

import java.util.Optional;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path(".well-known/matrix")
@Produces(MediaType.APPLICATION_JSON)
public class WellKnownResource {

    @ConfigProperty(name = "idp.url")
    Optional<String> idpUrl;

    @ConfigProperty(name = "client.url")
    String clientUrl;

    @ConfigProperty(name = "server.url")
    String serverUrl;

    @GET
    @Path("client")
    public ClientConfig getClientConfig() {
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.setHomeUrl(new BaseUrl(clientUrl));
        idpUrl.ifPresent(e -> clientConfig.setIdpUrl(new BaseUrl(e)));
        return clientConfig;
    }

    @GET
    @Path("server")
    public ServerConfig getServerConfig() {
        return new ServerConfig(serverUrl);
    }

}
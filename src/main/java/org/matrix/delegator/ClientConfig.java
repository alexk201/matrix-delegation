package org.matrix.delegator;

import jakarta.json.bind.annotation.JsonbProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientConfig {

    @JsonbProperty("m.homeserver")
    private BaseUrl homeUrl;

    @JsonbProperty("m.identity_server")
    private BaseUrl idpUrl;

}
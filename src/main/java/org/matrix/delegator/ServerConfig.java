package org.matrix.delegator;

import jakarta.json.bind.annotation.JsonbProperty;

import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor
public class ServerConfig {

    @JsonbProperty("m.server")
    private String url;

}
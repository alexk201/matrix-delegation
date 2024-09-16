package org.matrix.delegator;

import jakarta.json.bind.annotation.JsonbProperty;

import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor
public class BaseUrl {

    @JsonbProperty("base_url")
    private String url;

}


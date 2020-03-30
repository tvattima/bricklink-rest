package com.bricklink.api.rest.client;

import com.bricklink.api.rest.exception.BricklinkServerException;
import org.junit.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static org.assertj.core.api.Assertions.assertThatCode;

public class ErrorHandlingTest extends BricklistRestClientTest {
    @Test
    public void invalidUri_returns() {
        stubFor(get(urlEqualTo("/orders/x"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody(getTestResponse("/__rest/bricklink/errors/invalid-endpoint-uri_200.json"))));
        assertThatCode(() -> {
            Object o = bricklinkRestClient.getOrder("x").getData();
        }).isInstanceOf(BricklinkServerException.class)
          .hasMessageContaining("INTERNAL_SERVER_ERROR")
          .hasMessageContaining("500");
    }
}

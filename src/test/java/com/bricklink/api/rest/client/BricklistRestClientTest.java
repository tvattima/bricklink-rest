package com.bricklink.api.rest.client;

import com.bricklink.api.rest.configuration.BricklinkRestConfiguration;
import com.bricklink.api.rest.configuration.BricklinkRestProperties;
import com.bricklink.api.rest.model.v1.BricklinkMeta;
import com.bricklink.api.rest.model.v1.BricklinkResource;
import com.bricklink.api.rest.model.v1.Color;
import com.bricklink.api.rest.service.ColorService;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import lombok.extern.slf4j.Slf4j;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doReturn;

@RunWith(SpringRunner.class)
@EnableConfigurationProperties(value = BricklinkRestProperties.class)
@ContextConfiguration(classes = {BricklinkRestConfiguration.class})
@TestPropertySource("classpath:bricklink-rest.properties")
@Slf4j
public abstract class BricklistRestClientTest {
    @Rule
    public WireMockRule wireMockRule = new WireMockRule();

    @Autowired
    BricklinkRestClient bricklinkRestClient;

    protected byte[] getTestResponse(String resourcePath) {
        try {
            log.info("Loading classpath resource [{}]", resourcePath);
            return Files.readAllBytes(Paths.get(new ClassPathResource(resourcePath).getURI()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

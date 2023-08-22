package com.bricklink.api.rest.client;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
@SpringBootTest
@ExtendWith(SpringExtension.class)
class BricklinkWebClientTest {
    @Autowired
    BricklinkRestClient bricklinkRestClient;

    @Test
    void test() {

    }

    @EnableConfigurationProperties
    @TestPropertySource("classpath:bricklink-rest.properties")
    @TestConfiguration
    public static class BricklinkWebClientTestConfiguration {

    }
}

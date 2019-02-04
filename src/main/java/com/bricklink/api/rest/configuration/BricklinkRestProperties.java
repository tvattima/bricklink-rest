package com.bricklink.api.rest.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "bricklink")
public class BricklinkRestProperties {
    private Consumer consumer = new Consumer();
    private Token token = new Token();

    @Setter
    @Getter
    public static class Consumer {
        private String key;
        private String secret;
    }

    @Setter
    @Getter
    public static class Token {
        private String value;
        private String secret;
    }
}

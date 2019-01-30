package com.bricklink.api.rest.configuration;

import com.bricklink.api.rest.client.BricklinkRestClient;
import com.bricklink.api.rest.support.BricklinkTarget;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BricklinkRestConfiguration {
    @Bean
    public BricklinkRestClient bricklinkClient(BricklinkRestProperties bricklinkRestProperties) {
        return Feign
                .builder()
                .client(new OkHttpClient())
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .logger(new Slf4jLogger(BricklinkRestClient.class))
                .logLevel(feign.Logger.Level.FULL)
                .target(new BricklinkTarget<>(
                        bricklinkRestProperties.getConsumer().getKey(),
                        bricklinkRestProperties.getConsumer().getSecret(),
                        bricklinkRestProperties.getToken().getValue(),
                        bricklinkRestProperties.getToken().getSecret()));
    }
}

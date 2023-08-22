package com.bricklink.api.rest.configuration;

import com.bricklink.api.rest.exception.BricklinkClientException;
import com.bricklink.api.rest.exception.BricklinkServerException;
import com.bricklink.api.rest.model.v1.BricklinkMeta;
import com.bricklink.api.rest.model.v1.BricklinkResource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import feign.FeignException;
import feign.Response;
import feign.codec.Decoder;
import feign.codec.ErrorDecoder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.io.IOException;
import java.lang.reflect.Type;

@Configuration
@EnableFeignClients
public class BricklinkRestConfiguration {

    @Bean
    @Primary
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return mapper;
    }

//    @Bean
//    public WebClient bricklinkWebClient() {
//        return WebClient.builder()
//                .build();
//    }

//    @Bean
//    @Primary
//    public BricklinkRestClient bricklinkRestClient(final WebClient bricklinkWebClient) {
//        return new BricklinkWebClient(bricklinkWebClient);
//    }

//    @Bean
//    public BricklinkRestClient bricklinkClient(ObjectMapper mapper, BricklinkRestProperties bricklinkRestProperties) {
//        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
//        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
//        okhttp3.OkHttpClient okHttpClientDelegate = new okhttp3.OkHttpClient.Builder().addInterceptor(logging).build();
//        return Feign
//                .builder()
//                .decoder(new BricklinkDecoder(mapper))
//                .errorDecoder(new BricklinkErrorDecoder())
//                .logger(new Slf4jLogger(BricklinkRestClient.class))
//                .logLevel(feign.Logger.Level.FULL)
//                .target(new BricklinkTarget<>(
//                        bricklinkRestProperties.getBricklink().getConsumer().getKey(),
//                        bricklinkRestProperties.getBricklink().getConsumer().getSecret(),
//                        bricklinkRestProperties.getBricklink().getToken().getValue(),
//                        bricklinkRestProperties.getBricklink()
//                                               .getToken()
//                                               .getSecret(),
//                        bricklinkRestProperties.getUri()));
//    }

//    private class BricklinkErrorDecoder implements ErrorDecoder {
//        private final ErrorDecoder _default = new Default();
//
//        @Override
//        public Exception decode(String methodKey, Response response) {
//            if (response.status() >= 400 && response.status() <= 499) {
//                throw new BricklinkClientException(response.status(), methodKey, "");
//            }
//            if (response.status() >= 500 && response.status() <= 599) {
//                throw new BricklinkServerException(response.status(), methodKey);
//            }
//            return _default.decode(methodKey, response);
//        }
//    }
//
//    private class BricklinkDecoder implements Decoder {
//        private final ObjectMapper mapper;
//        private final Decoder delegate;
//
//        private BricklinkDecoder(ObjectMapper mapper) {
//            this.mapper = mapper;
//            delegate = new SpringDecoder();
//        }
//
//        @Override
//        public Object decode(Response response, Type type) throws IOException, FeignException {
//            Object object = delegate.decode(response, type);
//            if (object instanceof BricklinkResource bricklinkResource) {
//                BricklinkMeta meta = bricklinkResource.getMeta();
//                if (meta.getCode() >= 400 && meta.getCode() <= 499) {
//                    throw new BricklinkClientException(meta.getCode(), meta.getMessage(), meta.getDescription());
//                }
//                if (meta.getCode() >= 500 && meta.getCode() <= 599) {
//                    throw new BricklinkServerException(meta.getCode(),
//                            String.format("Bricklink server error description: [%s] message: [%s] code: [%s]",
//                                    meta.getDescription(),
//                                    meta.getMessage(),
//                                    meta.getCode()));
//                }
//            }
//            return object;
//        }
//    }
}

package com.bricklink.api.rest.support;

import com.bricklink.api.rest.client.BricklinkRestClient;
import feign.Request;
import feign.RequestTemplate;
import feign.Target;

import java.text.MessageFormat;
import java.util.Collection;
import java.util.Map;

public class BricklinkTarget<T> implements Target<T> {

    private String consumerKey;
    private String consumerSecret;
    private String tokenValue;
    private String tokenSecret;
    private String authorizationHeader = "OAuth realm=\"\",oauth_consumer_key=\"{0}\",oauth_token=\"{1}\",oauth_signature_method=\"HMAC-SHA1\",oauth_signature=\"{2}\",oauth_timestamp=\"{3}\",oauth_nonce=\"{4}\",oauth_version=\"1.0\"";

    public BricklinkTarget(String consumerKey, String consumerSecret, String tokenValue, String tokenSecret) {
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
        this.tokenValue = tokenValue;
        this.tokenSecret = tokenSecret;
    }

    @Override
    public Request apply(RequestTemplate input) {
        if (input.url().indexOf("http") != 0) {
            input.insert(0, url());
        }

        BLAuthSigner signer = new BLAuthSigner(consumerKey, consumerSecret);
        signer.setToken(tokenValue, tokenSecret);
        signer.setVerb(input.method());
        signer.setURL(input.url());

        for (String key : input.queries().keySet()) {
            signer.addParameter(key, getFirstValue(input.queries().get(key)));
        }
        try {
            input.header("Authorization", getAuthorizationHeader(signer.getFinalOAuthParams()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return input.request();
    }

    @Override
    public Class type() {
        return BricklinkRestClient.class;
    }

    @Override
    public String name() {
        return "Bricklink REST API";
    }

    @Override
    public String url() {
        return "https://api.bricklink.com/api/store/v1";
    }

    private String getFirstValue(Collection<String> strings) {
        String value = null;
        for (String string : strings) {
            value = string;
            break;
        }
        return value;
    }

    private String getAuthorizationHeader(Map<String, String> oauthParameters) {
        return MessageFormat.format(authorizationHeader,
                oauthParameters.get("oauth_consumer_key"),
                oauthParameters.get("oauth_token"),
                oauthParameters.get("oauth_signature"),
                oauthParameters.get("oauth_timestamp"),
                oauthParameters.get("oauth_nonce"));
    }
}

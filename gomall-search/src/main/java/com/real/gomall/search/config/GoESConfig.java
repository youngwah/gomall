package com.real.gomall.search.config;

import org.elasticsearch.client.RequestOptions;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GoESConfig {

    public static final RequestOptions COMMON_OPTIONS;

    static {
        RequestOptions.Builder builder = RequestOptions.DEFAULT.toBuilder();
        COMMON_OPTIONS = builder.build();
    }
}

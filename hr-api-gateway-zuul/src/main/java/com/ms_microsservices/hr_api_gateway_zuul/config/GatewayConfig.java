package com.ms_microsservices.hr_api_gateway_zuul.config;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

@Configuration
public class GatewayConfig {

    @Bean
    public GlobalFilter logFilter() {
        return (exchange, chain) -> {
            System.out.println("Request URI: " + exchange.getRequest().getURI());
            return chain.filter(exchange).then(Mono.fromRunnable(() ->
                    System.out.println("Response Code: " + exchange.getResponse().getStatusCode())));
        };
    }
}
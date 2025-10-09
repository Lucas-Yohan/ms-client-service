package com.ms_microsservices.hr_api_gateway_zuul.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("worker_route", r -> r.path("/workers/**")
                        .uri("lb://hr-worker"))
                .route("payroll_route", r -> r.path("/payments/**")
                        .uri("lb://hr-payroll"))
                .build();
    }
}

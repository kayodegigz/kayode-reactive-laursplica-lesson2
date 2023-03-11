package com.example.kayodereactivelaursplicalesson2.config;

import com.example.kayodereactivelaursplicalesson2.handlers.ProductHandler;
import com.example.kayodereactivelaursplicalesson2.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import com.example.kayodereactivelaursplicalesson2.service.ProductService;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

/**
 * Created by Kayode.Ogunrinde on 3/11/2023.
 */

// the routes config is for the internal application
// sort of like a controller to handle incoming requests
@Configuration
public class RouterConfig {

    @Bean
    public RouterFunction<ServerResponse> router(ProductHandler productHandler) {
        return route().
                GET(
                        "/product",
                        productHandler::getAll
                ).
                build();
    }
}

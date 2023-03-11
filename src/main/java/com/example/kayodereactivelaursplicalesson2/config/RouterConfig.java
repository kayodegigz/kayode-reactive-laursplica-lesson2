package com.example.kayodereactivelaursplicalesson2.config;

import com.example.kayodereactivelaursplicalesson2.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import com.example.kayodereactivelaursplicalesson2.service.ProductService;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

/**
 * Created by Kayode.Ogunrinde on 3/11/2023.
 */

@Configuration
public class RouterConfig {
    private final ProductService productService;

    public RouterConfig(ProductService productService) {
        this.productService = productService;
    }

    @Bean
    public RouterFunction<ServerResponse> router() {
        return route().
                GET("/product", req -> ok().body(productService.getAll(), Product.class)).
                build();
    }
}

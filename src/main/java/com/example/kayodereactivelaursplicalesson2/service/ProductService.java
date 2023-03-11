package com.example.kayodereactivelaursplicalesson2.service;

import com.example.kayodereactivelaursplicalesson2.model.Product;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.stream.Stream;

/**
 * Created by Kayode.Ogunrinde on 3/11/2023.
 */

@Service
public class ProductService {

    public Flux<Product> getAll() {
        Product p1 = new Product("Beer");
        Product p2 = new Product("Condoms");
        Product p3 = new Product("Chocolates");
        Product p4 = new Product("Wine");

        return Flux.
                fromStream(Stream.of(p1, p2, p3, p4)).
                delayElements(Duration.ofSeconds(5));
    }
}

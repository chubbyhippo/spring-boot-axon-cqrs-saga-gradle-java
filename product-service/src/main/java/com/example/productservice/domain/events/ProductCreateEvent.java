package com.example.productservice.domain.events;

import java.math.BigDecimal;

public record ProductCreateEvent(
        String productId,
        String title,
        BigDecimal price,
        Integer quantity) {
}

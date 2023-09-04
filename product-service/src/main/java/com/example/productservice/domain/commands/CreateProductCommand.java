package com.example.productservice.domain.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.math.BigDecimal;

public record CreateProductCommand(
        @TargetAggregateIdentifier String productId,
        String title,
        BigDecimal price,
        Integer quantity
) {
}

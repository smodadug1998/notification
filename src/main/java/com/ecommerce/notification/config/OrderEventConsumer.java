package com.ecommerce.notification.config;

import com.ecommerce.notification.payload.OrderCreatedEventDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Slf4j
@Service
public class OrderEventConsumer {
    @Bean
    public Consumer<OrderCreatedEventDTO> orderCreated() {
        return event -> {
            log.info("Received Order Created Event for order: {}", event.getOrderId());
            log.info("Received Order Created Event for user: {}", event.getUserId());
        };
    }
}

package com.ecommerce.notification.config;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OrderEventConsumer {
    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void handleOrderEvent(Map<String, Object> orderEvent) {
        System.out.println("Received order event: " + orderEvent);

        long orderId = Long.parseLong(orderEvent.get("orderId").toString());
        String status = orderEvent.get("status").toString();
        System.out.println("Received order event with orderId: " + orderId + ", status: " + status);
    }
}

package de.buildpath.salesetargets.service.subscription.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.buildpath.salesetargets.service.subscription.domain.Subscription;

@RestController
public class SubscriptionController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/subscription")
    public Subscription greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Subscription(counter.incrementAndGet(), String.format(template, name));
    }

    // TODO : von Subscription Search aufrufen
}

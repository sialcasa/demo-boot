package de.buildpath.salesetargets.service.search.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.buildpath.salesetargets.service.search.domain.Company;

@RestController
public class CompanyController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/company")
    public Company greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Company(counter.incrementAndGet(), String.format(template, name));
    }
}

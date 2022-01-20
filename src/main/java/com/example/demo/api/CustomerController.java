package com.example.demo.api;

import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class CustomerController {

    private final CustomerRepo customerRepo;

    @GetMapping
    public String addCustomer() {
        Customer saved = customerRepo.save(new Customer());
        log.info("user added");
        return saved.toString();
    }
}

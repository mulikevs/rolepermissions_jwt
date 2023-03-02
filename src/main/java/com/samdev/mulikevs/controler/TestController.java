package com.samdev.mulikevs.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/user")
    public TestMessage userEndpoint() {
        return new TestMessage("Hello user!");
    }

    @GetMapping("/admin")
    public TestMessage adminEndpoint() {
        return new TestMessage("Hello admin!");
    }

    @GetMapping("/api")
    public TestMessage apiEndpoint() {
        return new TestMessage("Hello Api!");
    }
}

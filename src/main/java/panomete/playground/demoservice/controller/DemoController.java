package panomete.playground.demoservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello(
            @RequestParam(value = "name", defaultValue = "World") String name
    ) {
        String message = String.format("Hello %s!", name);
        return ResponseEntity.ok(message);
    }
}

package nau.pavliuk.kitchen.controller.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSerhii
{
    @GetMapping(value = "/hither", produces = MediaType.TEXT_PLAIN_VALUE)
    public String hiSerhii() {
        return "Hi Sergio!";
    }
}

package com.example.makemytrip;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class bus {
    @GetMapping("/bus")
    public String getData()
    {
        return "Please book your bus from Indigo. kindly book tickets for NEW DELHI to Anywhere at 10% discount";

    }
}

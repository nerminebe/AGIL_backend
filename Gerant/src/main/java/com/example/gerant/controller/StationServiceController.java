package com.example.gerant.controller;

import com.example.gerant.service.StationServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stations")
public class StationServiceController {
    @Autowired
    private StationServiceService stationServiceService;
}
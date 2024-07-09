package com.example.gerant.service;

import com.example.gerant.repository.StationServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StationServiceService {
    @Autowired
    private StationServiceRepository stationServiceRepository;
}
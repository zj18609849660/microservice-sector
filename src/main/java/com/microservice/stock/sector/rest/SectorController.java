package com.microservice.stock.sector.rest;

import com.microservice.stock.sector.model.Sector;
import com.microservice.stock.sector.service.SectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sector")
public class SectorController {

    @Autowired
    SectorService sectorService;

    @GetMapping("/all")
    public List<Sector> getAllSectors() {
        return sectorService.retrieveAllSectors();
    }
}

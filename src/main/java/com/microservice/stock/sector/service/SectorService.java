package com.microservice.stock.sector.service;

import com.microservice.stock.sector.entity.SectorEntity;
import com.microservice.stock.sector.model.Sector;
import com.microservice.stock.sector.repository.SectorRepository;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class SectorService {
    @Autowired
    SectorRepository sectorRepository;

    @Transactional
    public List<Sector> retrieveAllSectors() {
        List<Sector> sectorList = new ArrayList<>();
        List<SectorEntity> sectors = sectorRepository.findAll();
        if (CollectionUtils.isNotEmpty(sectors)) {
            sectors.forEach(exchangeItem -> {
                Sector se = new Sector();
                BeanUtils.copyProperties(exchangeItem, se);
                sectorList.add(se);
            });
        }
        return sectorList;
    }


}

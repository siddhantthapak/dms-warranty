package com.technova.dms.warranty.service;

import com.technova.dms.warranty.model.OEM;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.EnumMap;

@Component
@RequiredArgsConstructor
public class WarrantyServiceManagementFactory implements AbstractFactory<OEM, WarrantyServiceManagement> {

    private final FordWarranyService fordWarranyService;
    private final GMWarrantyService gmWarrantyService;
    private final EnumMap<OEM, WarrantyServiceManagement> warrantyServiceManagementMap = new EnumMap<>(OEM.class);

    @PostConstruct
    public void init() {
        warrantyServiceManagementMap.put(OEM.FORD, fordWarranyService);
        warrantyServiceManagementMap.put(OEM.GM, gmWarrantyService);
    }

    @Override
    public WarrantyServiceManagement create(OEM type) {
        return warrantyServiceManagementMap.get(type);
    }
}

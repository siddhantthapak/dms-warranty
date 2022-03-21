package com.technova.dms.warranty.service;

import com.technova.dms.warranty.model.OEM;
import com.technova.dms.warranty.model.WarrantyDetails;
import org.springframework.stereotype.Component;

@Component
public class GMWarrantyService implements WarrantyServiceManagement{

    @Override
    public OEM getOEM() {
        return OEM.GM;
    }

    @Override
    public WarrantyDetails getWarrantyDetails() {
        return WarrantyDetails.builder().temporaryMessage("Temporary Message to from GM").build();
    }
}

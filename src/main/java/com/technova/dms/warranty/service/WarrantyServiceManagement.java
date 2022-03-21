package com.technova.dms.warranty.service;

import com.technova.dms.warranty.model.OEM;
import com.technova.dms.warranty.model.WarrantyDetails;

public interface WarrantyServiceManagement {
    OEM getOEM();
    WarrantyDetails getWarrantyDetails();
}

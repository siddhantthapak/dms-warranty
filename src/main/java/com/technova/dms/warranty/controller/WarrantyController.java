package com.technova.dms.warranty.controller;

import com.technova.dms.warranty.model.OEM;
import com.technova.dms.warranty.service.WarrantyServiceManagementFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WarrantyController {
    private final WarrantyServiceManagementFactory factory;


    @GetMapping("{oem}/get-warranty/{vin}")
    public ResponseEntity<?> getWarranty(@PathVariable("oem") OEM oem,
                                         @PathVariable String vin) {
        return ResponseEntity.ok(factory.create(oem).getWarrantyDetails());
    }

}

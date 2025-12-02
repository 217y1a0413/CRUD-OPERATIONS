package com.codegnan.dao;

import java.util.List;

import com.codegnan.exceptions.PharmacyNotFoundException;
import com.codegnan.model.Pharmacy;

public interface PharmacyDao {
    
    // Create or save pharmacy
    void save(Pharmacy pharmacy);
    
    // Show all pharmacies
    List<Pharmacy> findAll();
    
    // Search pharmacy by ID
    Pharmacy findById(int id) throws PharmacyNotFoundException;
    
    // Update pharmacy
    Pharmacy update(Pharmacy pharmacy) throws PharmacyNotFoundException;
    
    // Delete pharmacy using ID
    void deleteById(int id) throws PharmacyNotFoundException;
}

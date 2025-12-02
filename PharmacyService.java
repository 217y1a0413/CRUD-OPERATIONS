package com.codegnan.services;

import java.util.List;

import com.codegnan.exceptions.PharmacyNotFoundException;
import com.codegnan.model.Pharmacy;

public interface PharmacyService {

    void addPharmacy(Pharmacy pharmacy);

    List<Pharmacy> getAllPharmacies();

    Pharmacy getPharmacyById(int id) throws PharmacyNotFoundException;

    Pharmacy updatePharmacy(Pharmacy pharmacy) throws PharmacyNotFoundException;

    void deletePharmacy(int id) throws PharmacyNotFoundException;

}

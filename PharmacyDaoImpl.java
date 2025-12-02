package com.codegnan.dao;


import java.util.ArrayList;
import java.util.List;

import com.codegnan.exceptions.PharmacyNotFoundException;
import com.codegnan.model.Pharmacy;

public class PharmacyDaoImpl implements PharmacyDao {
    
    List<Pharmacy> pharmacyList = new ArrayList<>();

    @Override
    public void save(Pharmacy pharmacy) {
        pharmacyList.add(pharmacy);  // Add pharmacy to the list
        System.out.println(pharmacy);
    }

    @Override
    public List<Pharmacy> findAll() {
        return pharmacyList;
    }

    @Override
    public Pharmacy findById(int id) throws PharmacyNotFoundException {
        for (Pharmacy p : pharmacyList) {
            if (p.getId() == id) {
                return p;
            }
        }
        throw new PharmacyNotFoundException("Pharmacy with id: " + id + " not found");
    }

    @Override
    public Pharmacy update(Pharmacy pharmacy) throws PharmacyNotFoundException {
        for (int i = 0; i < pharmacyList.size(); i++) {
            if (pharmacyList.get(i).getId() == pharmacy.getId()) {
                pharmacyList.set(i, pharmacy);
                return pharmacy;
            }
        }
        throw new PharmacyNotFoundException("Pharmacy with id: " + pharmacy.getId() + " not found, cannot update");
    }

    @Override
    public void deleteById(int id) throws PharmacyNotFoundException {
        boolean found = false;
        for (int i = 0; i < pharmacyList.size(); i++) {
            if (pharmacyList.get(i).getId() == id) {
                pharmacyList.remove(i);
                found = true;
                break;
            }
        }
        
        if (!found) {
            throw new PharmacyNotFoundException("Pharmacy with id: " + id + " not found, cannot delete");
        }
    }
}
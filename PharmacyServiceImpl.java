package com.codegnan.services;


import java.util.List;

import com.codegnan.dao.PharmacyDao;
import com.codegnan.dao.PharmacyDaoImpl;
import com.codegnan.exceptions.PharmacyNotFoundException;
import com.codegnan.model.Pharmacy;

public class PharmacyServiceImpl implements PharmacyService {
    
    PharmacyDao dao = new PharmacyDaoImpl();

    @Override
    public void addPharmacy(Pharmacy pharmacy) {
        dao.save(pharmacy);
    }

    @Override
    public List<Pharmacy> getAllPharmacies() {
        return dao.findAll();
    }

    @Override
    public Pharmacy getPharmacyById(int id) throws PharmacyNotFoundException {
        return dao.findById(id);
    }

    @Override
    public Pharmacy updatePharmacy(Pharmacy pharmacy) throws PharmacyNotFoundException {
        return dao.update(pharmacy);
    }

    @Override
    public void deletePharmacy(int id) throws PharmacyNotFoundException {
        dao.deleteById(id);
    }
}

package com.codegnan.controller;



import java.util.List;

import com.codegnan.exceptions.PharmacyNotFoundException;
import com.codegnan.model.Pharmacy;
import com.codegnan.services.PharmacyService;
import com.codegnan.services.PharmacyServiceImpl;

public class PharmacyController {

    public static void main(String[] args) {

        PharmacyService service = new PharmacyServiceImpl();

        // Add pharmacies
        service.addPharmacy(new Pharmacy(1, "Paracetamol", "12-12-2025", 50.0, 20));
        service.addPharmacy(new Pharmacy(2, "Dolo 650", "10-10-2026", 30.0, 50));
        service.addPharmacy(new Pharmacy(3, "Amoxicillin", "15-05-2027", 120.0, 10));
        service.addPharmacy(new Pharmacy(4, "Cetrizine", "20-11-2024", 25.0, 100));
        service.addPharmacy(new Pharmacy(5, "Ibuprofen", "09-09-2026", 90.0, 40));

        System.out.println("Pharmacies added successfully.");

        System.out.println("\nAll Pharmacies");
        System.out.println("--------------------------------");
        List<Pharmacy> pharmacies = service.getAllPharmacies();
        for (Pharmacy p : pharmacies) {
            System.out.println(p);
        }

        // Get pharmacy by id 2
        System.out.println("\nFetching pharmacy with id: 2");
        try {
            Pharmacy fetched = service.getPharmacyById(2);
            System.out.println(fetched);
        } catch (PharmacyNotFoundException e) {
            e.printStackTrace();
        }

        // Update pharmacy id = 3
        System.out.println("\nUpdating pharmacy with id: 3");
        try {
            Pharmacy updated = service.updatePharmacy(
                new Pharmacy(3, "Amoxicillin-Updated", "18-06-2028", 150.0, 15)
            );
            System.out.println("Updated Pharmacy: " + updated);
        } catch (PharmacyNotFoundException e) {
            e.printStackTrace();
        }

        // Delete pharmacy with id 1
        System.out.println("\nDeleting pharmacy with id: 1");
        try {
            service.deletePharmacy(1);
            System.out.println("Pharmacy deleted successfully.");
        } catch (PharmacyNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\nAfter modifications, pharmacy list:");
        System.out.println("--------------------------------");
        List<Pharmacy> updatedList = service.getAllPharmacies();
        for (Pharmacy p : updatedList) {
            System.out.println(p);
        }
    }
}



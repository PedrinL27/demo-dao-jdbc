package com.application;

import java.util.Date;
import java.util.List;

import com.model.dao.DaoFactory;
import com.model.dao.SellerDao;
import com.model.entities.Department;
import com.model.entities.Seller;

public class Main {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== findByDepartment ===");
        Department dp = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(dp);
        for(Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== findAll ===");
        list = sellerDao.findAll();
        for(Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== Insert ===");
        Seller newSeller = new Seller(null, "Greg Jones", "greg@email.com", new Date(), 4000.50, dp);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n=== Update ===");
        seller = sellerDao.findById(1);
        seller.setName("Jose Carlos");
        sellerDao.update(seller);
        System.out.println("Updated!!!!");

        System.out.println("\n=== Delete ===");
        sellerDao.deleteById(10);
        sellerDao.deleteById(9);
        System.out.println("Deleted!!!!");
    }
}
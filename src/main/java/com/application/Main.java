package com.application;

import java.util.List;

import com.model.dao.DaoFactory;
import com.model.dao.SellerDao;
import com.model.entities.Department;
import com.model.entities.Seller;

public class Main {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        Department dp = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(dp);

        for(Seller obj : list) {
            System.out.println(obj);
        }

        
    }
}
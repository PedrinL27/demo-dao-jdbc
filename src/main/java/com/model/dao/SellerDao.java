package com.model.dao;

import java.util.List;

import com.model.entities.Department;
import com.model.entities.Seller;

public interface SellerDao {

    void insert(Seller obj);
    void update(Seller obj);
    void delete(Seller obj);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}

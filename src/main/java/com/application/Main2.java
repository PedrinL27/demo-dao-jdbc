package com.application;

import java.util.ArrayList;
import java.util.List;

import com.model.dao.DaoFactory;
import com.model.dao.DepartmentDao;
import com.model.entities.Department;

public class Main2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== Insert ===");
        Department newDepartment = new Department(null, "Grocery");
        // departmentDao.insert(newDepartment);
        System.out.println("Inserted new department");

        System.out.println("=== findById ===");
        newDepartment = departmentDao.findById(2);
        System.out.println(newDepartment);

        System.out.println("=== Delete ===");
        departmentDao.deleteById(6);
        System.out.println("Deleted");

        System.out.println("=== Update ===");
        newDepartment = departmentDao.findById(5);
        newDepartment.setName("Test");
        departmentDao.update(newDepartment);
        System.out.println("Updated!!");

        System.out.println("=== findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }
    }

}

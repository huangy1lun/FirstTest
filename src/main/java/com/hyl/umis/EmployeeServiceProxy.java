package com.hyl.umis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeServiceProxy {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @Autowired
    private Transaction transaction;

    public void save(Employee employee) {
        transaction.begin();
        try {
            employeeService.save(employee);
            transaction.sava();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        transaction.end();
    }

}

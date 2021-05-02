package com.company.Abstract;

import com.company.Entities.Customer;

public abstract class BaseCustomerManager implements InterfaceCustomerService {
    public void save(Customer customer) {
        System.out.println("Saved to db : "+customer.getFirstName());
    }
}


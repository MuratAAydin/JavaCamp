package com.company.Concrete;

import com.company.Abstract.InterfaceCustomerCheckService;
import com.company.Entities.Customer;

public class CustomerCheckManager implements InterfaceCustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }

}

package com.company.Concrete;

import com.company.Abstract.BaseCustomerManager;
import com.company.Abstract.InterfaceCustomerCheckService;
import com.company.Entities.Customer;

import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private InterfaceCustomerCheckService customerCheckService;

    public StarbucksCustomerManager(InterfaceCustomerCheckService customerCheckService) {
        super();
        this.customerCheckService = customerCheckService;
    }

    public void Save(Customer customer) throws RemoteException {
        if (customerCheckService.checkIfRealPerson(customer)) {
            super.save(customer);
        } else {
            System.out.println("Not a valid person : " + customer.getFirstName() + " " + customer.getLastName());
        }

    }

}

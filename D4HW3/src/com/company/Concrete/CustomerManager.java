package com.company.Concrete;

import com.company.Abstract.InterfaceCustomerCheckService;
import com.company.Abstract.InterfaceCustomerService;
import com.company.Entities.Customer;

public class CustomerManager implements InterfaceCustomerService {
    private InterfaceCustomerCheckService customerCheckService;

    public CustomerManager(InterfaceCustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void add(Customer customer) {
        if (customerCheckService.checkIfRealPerson(customer)) {
            System.out.println("Customer added : " + customer.getFirstName());
        } else {
            System.out.println("Customer is not valid");
        }
    }

    @Override
    public void update(Customer customer) {
        System.out.println("Customer updated");

    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Customer deleted");
    }
}

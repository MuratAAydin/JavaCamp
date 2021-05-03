package com.company.Abstract;

import com.company.Entities.Customer;

import java.rmi.RemoteException;

public interface InterfaceCustomerCheckService {
    public boolean checkIfRealPerson(Customer customer) throws RemoteException;

}

package com.company.Adapter;

import com.company.Abstract.InterfaceCustomerCheckService;
import com.company.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

import java.rmi.RemoteException;


public class MernisServiceAdapter implements InterfaceCustomerCheckService{

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        KPSPublicSoap client = new KPSPublicSoapProxy();
        try {
            return client.TCKimlikNoDogrula(customer.getNationalityId() , customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return false;
    }
}

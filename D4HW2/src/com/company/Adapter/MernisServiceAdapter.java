package com.company.Adapter;

import com.company.Abstract.InterfaceCustomerCheckService;
import com.company.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

import java.rmi.RemoteException;
import java.util.Locale;


public class MernisServiceAdapter implements InterfaceCustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws RemoteException {
        KPSPublicSoapProxy client = new KPSPublicSoapProxy();
        boolean result = false;
        try {
            result = client.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName().toUpperCase(Locale.ROOT), customer.getLastName().toUpperCase(Locale.ROOT), customer.getDateOfBirth().getYear());
        } catch (RemoteException e) {
            result = false;
        }
    }
}


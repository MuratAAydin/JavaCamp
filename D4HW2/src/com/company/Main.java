
package com.company;

import com.company.Abstract.BaseCustomerManager;
import com.company.Adapter.MernisServiceAdapter;
import com.company.Concrete.NeroCustomerManager;
import com.company.Concrete.StarbucksCustomerManager;
import com.company.Entities.Customer;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                1,
                "Ahmet",
                "Mehmet",
                new Date(2000, Calendar.JUNE, 1),
                12_345_678_912L
        );

       BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());


        NeroCustomerManager customerManager = new NeroCustomerManager();
        customerManager.save(customer);

    }


}

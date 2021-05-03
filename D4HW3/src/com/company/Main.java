package com.company;

import com.company.Adapter.MernisServiceAdapter;
import com.company.Concrete.CustomerManager;
import com.company.Concrete.GameManager;
import com.company.Entities.Campaign;
import com.company.Entities.Customer;
import com.company.Entities.Game;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setFirstName("Ahmet");
        customer.setLastName("Mehmet");
        customer.setNationalityId(12345678912L);
        customer.setDateOfBirth(new Date(2000, Calendar.MAY, 5));

        Campaign campaign = new Campaign(1, 50);

        Game game = new Game();
        game.setId(1);
        game.setName("Fatih");
        game.setPrice(12);

        CustomerManager manager = new CustomerManager(new MernisServiceAdapter());
        GameManager gameManager = new GameManager();

        manager.add(customer);
        gameManager.sell(game, customer, campaign);
    }

}

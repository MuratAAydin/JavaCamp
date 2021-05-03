package com.company.Concrete;

import com.company.Abstract.InterfaceGameService;
import com.company.Entities.Campaign;
import com.company.Entities.Customer;
import com.company.Entities.Game;

public class GameManager implements InterfaceGameService {
    @Override
    public void add(Game game) {
        System.out.println("Game added. Game name : " + game.getName());
    }

    @Override
    public void update(Game game) {
        System.out.println("Game updated. Game name : " + game.getName());
    }

    @Override
    public void delete(Game game) {
        System.out.println("Game deleted. Game name : " + game.getName());
    }

    @Override
    public void sell(Game game, Customer customer) {
        System.out.println("Game was sold without a campaign. Game name : " + game.getName());
    }

    @Override
    public void sell(Game game, Customer customer, Campaign campaign) {
        int priceAfterDiscount = game.getPrice() * campaign.getDiscountRate() / 100;
        System.out.println("Game was sold with a campaign. Price before the campaign " + game.getPrice() + "$. Price after the campaign : " + priceAfterDiscount + "$.");
    }
}

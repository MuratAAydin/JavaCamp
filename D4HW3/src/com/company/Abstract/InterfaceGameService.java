package com.company.Abstract;

import com.company.Entities.Campaign;
import com.company.Entities.Customer;
import com.company.Entities.Game;

public interface InterfaceGameService {
    public void add(Game game);
    public void update(Game game);
    public void delete(Game game);

    public void sell(Game game, Customer customer);
    public void sell(Game game, Customer customer, Campaign campaign);
}

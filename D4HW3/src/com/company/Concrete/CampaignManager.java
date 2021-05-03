package com.company.Concrete;

import com.company.Abstract.InterfaceCampaignService;
import com.company.Entities.Campaign;

public class CampaignManager implements InterfaceCampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println("Campaign added campaign detail discount rate : %"+ campaign.getDiscountRate());
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("Campaign update campaign detail discount rate : %"+ campaign.getDiscountRate());
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("Campaign delete campaign detail discount rate : %"+ campaign.getDiscountRate());
    }
}

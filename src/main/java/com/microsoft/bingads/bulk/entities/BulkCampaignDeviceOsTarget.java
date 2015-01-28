package com.microsoft.bingads.bulk.entities;

/**
 * Represents a device OS target that is associated with a campaign.
 */
public class BulkCampaignDeviceOsTarget extends BulkDeviceOsTarget<BulkCampaignDeviceOsTargetBid> {
       
    public BulkCampaignDeviceOsTarget() {
        super(BulkCampaignDeviceOsTargetBid.class);
    }

    public Long getCampaignId() {
        return getEntityId();
    }
    
    public void setCampaignId(Long campaignId) {
        setEntityId(campaignId);
    }
    
    public String getCampaignName() {
        return getEntityName();
    }
    
    public void setCampaignName(String campaignName) {
        setEntityName(campaignName);
    }
    
    @Override
    BulkCampaignDeviceOsTargetBid createBid() {
        return new BulkCampaignDeviceOsTargetBid();
    }    
}
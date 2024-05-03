package br.com.abs.upapp.integration.brapi.model;

import java.util.Date;
public class Subscription{
    private String assetIssued;
    private Integer percentage;
    private Integer priceUnit;
    private String tradingPeriod;
    private Date subscriptionDate;
    private Date approvedOn;
    private String isinCode;
    private String label;
    private Date lastDatePrior;
    private String remarks;

    public Subscription(String assetIssued, Integer percentage, Integer priceUnit, String tradingPeriod, Date subscriptionDate, Date approvedOn, String isinCode, String label, Date lastDatePrior, String remarks) {
        this.assetIssued = assetIssued;
        this.percentage = percentage;
        this.priceUnit = priceUnit;
        this.tradingPeriod = tradingPeriod;
        this.subscriptionDate = subscriptionDate;
        this.approvedOn = approvedOn;
        this.isinCode = isinCode;
        this.label = label;
        this.lastDatePrior = lastDatePrior;
        this.remarks = remarks;
    }

    public Subscription() {
    }

    public String getAssetIssued() {
        return assetIssued;
    }

    public void setAssetIssued(String assetIssued) {
        this.assetIssued = assetIssued;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    public Integer getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(Integer priceUnit) {
        this.priceUnit = priceUnit;
    }

    public String getTradingPeriod() {
        return tradingPeriod;
    }

    public void setTradingPeriod(String tradingPeriod) {
        this.tradingPeriod = tradingPeriod;
    }

    public Date getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(Date subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    public Date getApprovedOn() {
        return approvedOn;
    }

    public void setApprovedOn(Date approvedOn) {
        this.approvedOn = approvedOn;
    }

    public String getIsinCode() {
        return isinCode;
    }

    public void setIsinCode(String isinCode) {
        this.isinCode = isinCode;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Date getLastDatePrior() {
        return lastDatePrior;
    }

    public void setLastDatePrior(Date lastDatePrior) {
        this.lastDatePrior = lastDatePrior;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}

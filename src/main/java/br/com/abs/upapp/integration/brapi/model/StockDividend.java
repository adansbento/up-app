package br.com.abs.upapp.integration.brapi.model;

import java.util.Date;

public class StockDividend{


    private String assetIssued;
    private Double factor;
    private Date approvedOn;
    private String isinCode;
    private String label;
    private Date lastDatePrior;
    private String remarks;



    public StockDividend() {
    }

    public StockDividend(String assetIssued, Double factor, Date approvedOn, String isinCode, String label, Date lastDatePrior, String remarks) {
        this.assetIssued = assetIssued;
        this.factor = factor;
        this.approvedOn = approvedOn;
        this.isinCode = isinCode;
        this.label = label;
        this.lastDatePrior = lastDatePrior;
        this.remarks = remarks;
    }

    public String getAssetIssued() {
        return assetIssued;
    }

    public void setAssetIssued(String assetIssued) {
        this.assetIssued = assetIssued;
    }

    public Double getFactor() {
        return factor;
    }

    public void setFactor(Double factor) {
        this.factor = factor;
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

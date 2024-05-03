package br.com.abs.upapp.integration.brapi.model;


import java.util.List;

public class SummaryProfile {

    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String fax;
    private String country;
    private String phone;
    private String website;
    private String industry;
    private String industryKey;
    private String industryDisp;
    private String sector;
    private String sectorKey;
    private String sectorDisp;
    private String longBusinessSummary;
    private Integer fullTimeEmployees;
    private List<Object> companyOfficers;

    public SummaryProfile() {
    }

    public SummaryProfile(String address1, String address2, String city, String state, String zip, String fax, String country, String phone, String website, String industry, String industryKey, String industryDisp, String sector, String sectorKey, String sectorDisp, String longBusinessSummary, Integer fullTimeEmployees, List<Object> companyOfficers) {
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.fax = fax;
        this.country = country;
        this.phone = phone;
        this.website = website;
        this.industry = industry;
        this.industryKey = industryKey;
        this.industryDisp = industryDisp;
        this.sector = sector;
        this.sectorKey = sectorKey;
        this.sectorDisp = sectorDisp;
        this.longBusinessSummary = longBusinessSummary;
        this.fullTimeEmployees = fullTimeEmployees;
        this.companyOfficers = companyOfficers;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getIndustryKey() {
        return industryKey;
    }

    public void setIndustryKey(String industryKey) {
        this.industryKey = industryKey;
    }

    public String getIndustryDisp() {
        return industryDisp;
    }

    public void setIndustryDisp(String industryDisp) {
        this.industryDisp = industryDisp;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getSectorKey() {
        return sectorKey;
    }

    public void setSectorKey(String sectorKey) {
        this.sectorKey = sectorKey;
    }

    public String getSectorDisp() {
        return sectorDisp;
    }

    public void setSectorDisp(String sectorDisp) {
        this.sectorDisp = sectorDisp;
    }

    public String getLongBusinessSummary() {
        return longBusinessSummary;
    }

    public void setLongBusinessSummary(String longBusinessSummary) {
        this.longBusinessSummary = longBusinessSummary;
    }

    public Integer getFullTimeEmployees() {
        return fullTimeEmployees;
    }

    public void setFullTimeEmployees(Integer fullTimeEmployees) {
        this.fullTimeEmployees = fullTimeEmployees;
    }

    public List<Object> getCompanyOfficers() {
        return companyOfficers;
    }

    public void setCompanyOfficers(List<Object> companyOfficers) {
        this.companyOfficers = companyOfficers;
    }
}

package br.com.abs.upapp.assets.entity;

import br.com.abs.upapp.portfolio.entity.TypeAsset;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true,nullable = false)
    private String assetCode;
    @Column(length = 50)
    private String document;
    @Column(length = 100)
    private String shortName;
    @Column(length = 255)
    private String longName;
    @Column
    private Integer averageDailyVolume3Month;
    @Column
    private Integer averageDailyVolume10Day;
    @Column(nullable = false)
    private BigDecimal lastValue;
    @Column(nullable = false)
    private Long marketCap;
    @Column(nullable = false,length = 50)
    @Enumerated(EnumType.STRING)
    private TypeAsset typeAsset;
    @Column(length = 255)
    private String address1;
    @Column(length = 255)
    private String address2;
    @Column(length = 255)
    private String city;
    @Column(length = 100)
    private String state;
    @Column(length = 20)
    private String zip;
    @Column(length = 40)
    private String country;
    @Column(length = 30)
    private String phone;
    @Column(length = 100)
    private String website;
    @Column(length = 100)
    private String industry;
    @Column(length = 100)
    private String industryKey;
    @Column(length = 100)
    private String industryDisp;
    @Column(length = 100)
    private String sector;
    @Column(length = 100)
    private String sectorKey;
    @Column(length = 100)
    private String sectorDisp;

    @Column(length = 255)
    private String longBusinessSummary;
    private Integer fullTimeEmployees;
    private List<String> companyOfficers;

    public Asset() {
    }

    public Asset(Long id, String assetCode,
                 String document, String shortName,
                 String longName, Integer averageDailyVolume3Month,
                 Integer averageDailyVolume10Day, BigDecimal lastValue,
                 Long marketCap, TypeAsset typeAsset, String address1,
                 String address2, String city, String state, String zip,
                 String country, String phone, String website, String industry,
                 String industryKey, String industryDisp, String sector,
                 String sectorKey, String sectorDisp, String longBusinessSummary,
                 Integer fullTimeEmployees, List<String> companyOfficers) {
        this.id = id;
        this.assetCode = assetCode;
        this.document = document;
        this.shortName = shortName;
        this.longName = longName;
        this.averageDailyVolume3Month = averageDailyVolume3Month;
        this.averageDailyVolume10Day = averageDailyVolume10Day;
        this.lastValue = lastValue;
        this.marketCap = marketCap;
        this.typeAsset = typeAsset;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public Integer getAverageDailyVolume3Month() {
        return averageDailyVolume3Month;
    }

    public void setAverageDailyVolume3Month(Integer averageDailyVolume3Month) {
        this.averageDailyVolume3Month = averageDailyVolume3Month;
    }

    public Integer getAverageDailyVolume10Day() {
        return averageDailyVolume10Day;
    }

    public void setAverageDailyVolume10Day(Integer averageDailyVolume10Day) {
        this.averageDailyVolume10Day = averageDailyVolume10Day;
    }

    public BigDecimal getLastValue() {
        return lastValue;
    }

    public void setLastValue(BigDecimal lastValue) {
        this.lastValue = lastValue;
    }

    public Long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(Long marketCap) {
        this.marketCap = marketCap;
    }

    public TypeAsset getTypeAsset() {
        return typeAsset;
    }

    public void setTypeAsset(TypeAsset typeAsset) {
        this.typeAsset = typeAsset;
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

    public List<String> getCompanyOfficers() {
        return companyOfficers;
    }

    public void setCompanyOfficers(List<String> companyOfficers) {
        this.companyOfficers = companyOfficers;
    }
}

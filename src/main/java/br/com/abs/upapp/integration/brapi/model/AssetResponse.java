package br.com.abs.upapp.integration.brapi.model;

import java.util.Date;
import java.util.List;

public class AssetResponse {
    private String symbol;
    private String currency;
    private Double twoHundredDayAverage;
    private Double twoHundredDayAverageChange;
    private Double twoHundredDayAverageChangePercent;
    private Long marketCap;
    private String shortName;
    private String longName;
    private Double regularMarketChange;
    private Double regularMarketChangePercent;
    private Date regularMarketTime;
    private Double regularMarketPrice;
    private Double regularMarketDayHigh;
    private String regularMarketDayRange;
    private Double regularMarketDayLow;
    private Integer regularMarketVolume;
    private Double regularMarketPreviousClose;
    private Double regularMarketOpen;
    private Integer averageDailyVolume3Month;
    private Integer averageDailyVolume10Day;
    private Double fiftyTwoWeekLowChange;
    private String fiftyTwoWeekRange;
    private Double fiftyTwoWeekHighChange;
    private Double fiftyTwoWeekHighChangePercent;
    private Double fiftyTwoWeekLow;
    private Double fiftyTwoWeekHigh;
    private Double fiftyTwoWeekLowChangePercent;
    private Double priceEarnings;
    private Double earningsPerShare;
    private String logourl;
    private String usedInterval;
    private String usedRange;
    private List<HistoricalDataPrice> historicalDataPrice;
    private List<String> validRanges;
    private List<String> validIntervals;
    private BalanceSheetHistory balanceSheetHistory;
    private DividendsData dividendsData;
    private SummaryProfile summaryProfile;

    public AssetResponse() {
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getTwoHundredDayAverage() {
        return twoHundredDayAverage;
    }

    public void setTwoHundredDayAverage(Double twoHundredDayAverage) {
        this.twoHundredDayAverage = twoHundredDayAverage;
    }

    public Double getTwoHundredDayAverageChange() {
        return twoHundredDayAverageChange;
    }

    public void setTwoHundredDayAverageChange(Double twoHundredDayAverageChange) {
        this.twoHundredDayAverageChange = twoHundredDayAverageChange;
    }

    public Double getTwoHundredDayAverageChangePercent() {
        return twoHundredDayAverageChangePercent;
    }

    public void setTwoHundredDayAverageChangePercent(Double twoHundredDayAverageChangePercent) {
        this.twoHundredDayAverageChangePercent = twoHundredDayAverageChangePercent;
    }

    public Long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(Long marketCap) {
        this.marketCap = marketCap;
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

    public Double getRegularMarketChange() {
        return regularMarketChange;
    }

    public void setRegularMarketChange(Double regularMarketChange) {
        this.regularMarketChange = regularMarketChange;
    }

    public Double getRegularMarketChangePercent() {
        return regularMarketChangePercent;
    }

    public void setRegularMarketChangePercent(Double regularMarketChangePercent) {
        this.regularMarketChangePercent = regularMarketChangePercent;
    }

    public Date getRegularMarketTime() {
        return regularMarketTime;
    }

    public void setRegularMarketTime(Date regularMarketTime) {
        this.regularMarketTime = regularMarketTime;
    }

    public Double getRegularMarketPrice() {
        return regularMarketPrice;
    }

    public void setRegularMarketPrice(Double regularMarketPrice) {
        this.regularMarketPrice = regularMarketPrice;
    }

    public Double getRegularMarketDayHigh() {
        return regularMarketDayHigh;
    }

    public void setRegularMarketDayHigh(Double regularMarketDayHigh) {
        this.regularMarketDayHigh = regularMarketDayHigh;
    }

    public String getRegularMarketDayRange() {
        return regularMarketDayRange;
    }

    public void setRegularMarketDayRange(String regularMarketDayRange) {
        this.regularMarketDayRange = regularMarketDayRange;
    }

    public Double getRegularMarketDayLow() {
        return regularMarketDayLow;
    }

    public void setRegularMarketDayLow(Double regularMarketDayLow) {
        this.regularMarketDayLow = regularMarketDayLow;
    }

    public Integer getRegularMarketVolume() {
        return regularMarketVolume;
    }

    public void setRegularMarketVolume(Integer regularMarketVolume) {
        this.regularMarketVolume = regularMarketVolume;
    }

    public Double getRegularMarketPreviousClose() {
        return regularMarketPreviousClose;
    }

    public void setRegularMarketPreviousClose(Double regularMarketPreviousClose) {
        this.regularMarketPreviousClose = regularMarketPreviousClose;
    }

    public Double getRegularMarketOpen() {
        return regularMarketOpen;
    }

    public void setRegularMarketOpen(Double regularMarketOpen) {
        this.regularMarketOpen = regularMarketOpen;
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

    public Double getFiftyTwoWeekLowChange() {
        return fiftyTwoWeekLowChange;
    }

    public void setFiftyTwoWeekLowChange(Double fiftyTwoWeekLowChange) {
        this.fiftyTwoWeekLowChange = fiftyTwoWeekLowChange;
    }

    public String getFiftyTwoWeekRange() {
        return fiftyTwoWeekRange;
    }

    public void setFiftyTwoWeekRange(String fiftyTwoWeekRange) {
        this.fiftyTwoWeekRange = fiftyTwoWeekRange;
    }

    public Double getFiftyTwoWeekHighChange() {
        return fiftyTwoWeekHighChange;
    }

    public void setFiftyTwoWeekHighChange(Double fiftyTwoWeekHighChange) {
        this.fiftyTwoWeekHighChange = fiftyTwoWeekHighChange;
    }

    public Double getFiftyTwoWeekHighChangePercent() {
        return fiftyTwoWeekHighChangePercent;
    }

    public void setFiftyTwoWeekHighChangePercent(Double fiftyTwoWeekHighChangePercent) {
        this.fiftyTwoWeekHighChangePercent = fiftyTwoWeekHighChangePercent;
    }

    public Double getFiftyTwoWeekLow() {
        return fiftyTwoWeekLow;
    }

    public void setFiftyTwoWeekLow(Double fiftyTwoWeekLow) {
        this.fiftyTwoWeekLow = fiftyTwoWeekLow;
    }

    public Double getFiftyTwoWeekHigh() {
        return fiftyTwoWeekHigh;
    }

    public void setFiftyTwoWeekHigh(Double fiftyTwoWeekHigh) {
        this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
    }

    public Double getFiftyTwoWeekLowChangePercent() {
        return fiftyTwoWeekLowChangePercent;
    }

    public void setFiftyTwoWeekLowChangePercent(Double fiftyTwoWeekLowChangePercent) {
        this.fiftyTwoWeekLowChangePercent = fiftyTwoWeekLowChangePercent;
    }

    public Double getPriceEarnings() {
        return priceEarnings;
    }

    public void setPriceEarnings(Double priceEarnings) {
        this.priceEarnings = priceEarnings;
    }

    public Double getEarningsPerShare() {
        return earningsPerShare;
    }

    public void setEarningsPerShare(Double earningsPerShare) {
        this.earningsPerShare = earningsPerShare;
    }

    public String getLogourl() {
        return logourl;
    }

    public void setLogourl(String logourl) {
        this.logourl = logourl;
    }

    public String getUsedInterval() {
        return usedInterval;
    }

    public void setUsedInterval(String usedInterval) {
        this.usedInterval = usedInterval;
    }

    public String getUsedRange() {
        return usedRange;
    }

    public void setUsedRange(String usedRange) {
        this.usedRange = usedRange;
    }

    public List<HistoricalDataPrice> getHistoricalDataPrice() {
        return historicalDataPrice;
    }

    public void setHistoricalDataPrice(List<HistoricalDataPrice> historicalDataPrice) {
        this.historicalDataPrice = historicalDataPrice;
    }

    public List<String> getValidRanges() {
        return validRanges;
    }

    public void setValidRanges(List<String> validRanges) {
        this.validRanges = validRanges;
    }

    public List<String> getValidIntervals() {
        return validIntervals;
    }

    public void setValidIntervals(List<String> validIntervals) {
        this.validIntervals = validIntervals;
    }

    public BalanceSheetHistory getBalanceSheetHistory() {
        return balanceSheetHistory;
    }

    public void setBalanceSheetHistory(BalanceSheetHistory balanceSheetHistory) {
        this.balanceSheetHistory = balanceSheetHistory;
    }

    public DividendsData getDividendsData() {
        return dividendsData;
    }

    public void setDividendsData(DividendsData dividendsData) {
        this.dividendsData = dividendsData;
    }

    public SummaryProfile getSummaryProfile() {
        return summaryProfile;
    }

    public void setSummaryProfile(SummaryProfile summaryProfile) {
        this.summaryProfile = summaryProfile;
    }
}

package br.com.abs.upapp.integration.brapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HistoricalDataPrice{
    private int date;
    @JsonProperty("open")
    private Double myopen;
    private Double high;
    private Double low;
    private Double close;
    private Integer volume;
    private Double adjustedClose;

    public HistoricalDataPrice() {
    }

    public HistoricalDataPrice(int date, Double myopen, Double high, Double low, Double close, Integer volume, Double adjustedClose) {
        this.date = date;
        this.myopen = myopen;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
        this.adjustedClose = adjustedClose;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Double getMyopen() {
        return myopen;
    }

    public void setMyopen(Double myopen) {
        this.myopen = myopen;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getClose() {
        return close;
    }

    public void setClose(Double close) {
        this.close = close;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Double getAdjustedClose() {
        return adjustedClose;
    }

    public void setAdjustedClose(Double adjustedClose) {
        this.adjustedClose = adjustedClose;
    }
}

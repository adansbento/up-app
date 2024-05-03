package br.com.abs.upapp.integration.brapi.model;

import java.util.List;
public class DividendsData{
    private List<CashDividend> cashDividends;
    private List<StockDividend> stockDividends;
    private List<Subscription> subscriptions;


    public DividendsData(List<CashDividend> cashDividends, List<StockDividend> stockDividends, List<Subscription> subscriptions) {
        this.cashDividends = cashDividends;
        this.stockDividends = stockDividends;
        this.subscriptions = subscriptions;
    }

    public DividendsData() {
    }

    public List<CashDividend> getCashDividends() {
        return cashDividends;
    }

    public void setCashDividends(List<CashDividend> cashDividends) {
        this.cashDividends = cashDividends;
    }

    public List<StockDividend> getStockDividends() {
        return stockDividends;
    }

    public void setStockDividends(List<StockDividend> stockDividends) {
        this.stockDividends = stockDividends;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }
}

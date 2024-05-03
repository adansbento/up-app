package br.com.abs.upapp.integration.brapi.model;

import java.util.ArrayList;
import java.util.List;

public class ResponseSymbols {
    private List<String> stocks = new ArrayList<>();
    private List<String> indexes = new ArrayList<>();

    public ResponseSymbols() {
    }

    public ResponseSymbols(List<String> stocks, List<String> indexes) {
        this.stocks = stocks;
        this.indexes = indexes;
    }

    public List<String> getStocks() {
        return stocks;
    }

    public void setStocks(List<String> stocks) {
        this.stocks = stocks;
    }

    public List<String> getIndexes() {
        return indexes;
    }

    public void setIndexes(List<String> indexes) {
        this.indexes = indexes;
    }
}



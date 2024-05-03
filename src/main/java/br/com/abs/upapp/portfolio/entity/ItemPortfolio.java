package br.com.abs.upapp.portfolio.entity;

import br.com.abs.upapp.assets.entity.Asset;
import jakarta.persistence.*;

@Entity
public class ItemPortfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer amount;

    @ManyToOne
    @JoinColumn(name = "id_portfolio")
    private Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name = "asset_code",nullable = false)
    private Asset asset;

    public ItemPortfolio(Long id, Integer amount, Portfolio portfolio, Asset asset) {
        this.id = id;
        this.amount = amount;
        this.portfolio = portfolio;
        this.asset = asset;
    }

    public ItemPortfolio() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }
}

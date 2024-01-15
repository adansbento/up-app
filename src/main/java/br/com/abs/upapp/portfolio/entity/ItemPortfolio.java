package br.com.abs.upapp.portfolio.entity;

import br.com.abs.upapp.assets.entity.Asset;
import br.com.abs.upapp.portfolio.dto.ItemPortfolioDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

    public ItemPortfolio(ItemPortfolioDto itemPortfolioDto) {
        this.id = itemPortfolioDto.getId();
        this.amount = itemPortfolioDto.getAmount();
       // this.portfolio = new Portfolio(itemPortfolioDto.getPortfolio());
        this.asset = new Asset(itemPortfolioDto.getAsset());
    }
}

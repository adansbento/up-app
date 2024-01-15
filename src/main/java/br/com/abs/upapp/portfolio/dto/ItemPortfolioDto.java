package br.com.abs.upapp.portfolio.dto;

import br.com.abs.upapp.assets.dto.AssetDto;
import br.com.abs.upapp.portfolio.entity.ItemPortfolio;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemPortfolioDto {

    private Long id;
    private Integer amount;
    private PortfolioDto portfolio;
    private AssetDto asset;


    public ItemPortfolioDto(ItemPortfolio itemPortfolio) {
        this.id = itemPortfolio.getId();
        this.amount = itemPortfolio.getAmount();
        //this.portfolio = new PortfolioDto(itemPortfolio.getPortfolio());
        this.asset = new AssetDto(itemPortfolio.getAsset());
    }
}

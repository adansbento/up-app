package br.com.abs.upapp.portfolio.dto;

import br.com.abs.upapp.asserts.dto.AssertDto;
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
    private AssertDto anAssert;


    public ItemPortfolioDto(ItemPortfolio itemPortfolio) {
        this.id = itemPortfolio.getId();
        this.amount = itemPortfolio.getAmount();
        this.portfolio = new PortfolioDto(itemPortfolio.getPortfolio());
        this.anAssert = new AssertDto(itemPortfolio.getAnAssert());
    }
}

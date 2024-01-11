package br.com.abs.upapp.portfolio.entity;

import br.com.abs.upapp.asserts.entity.Assert;
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

    @JoinColumn(name = "id_portfolio", nullable = false)
    @ManyToOne
    private Portfolio portfolio;

    @JoinColumn(name = "id_assert",nullable = false)
    @ManyToOne
    private Assert anAssert;

    public ItemPortfolio(ItemPortfolioDto itemPortfolioDto) {
        this.id = itemPortfolioDto.getId();
        this.amount = itemPortfolioDto.getAmount();
        this.portfolio = new Portfolio(itemPortfolioDto.getPortfolio());
        this.anAssert = new Assert(itemPortfolioDto.getAnAssert());
    }
}

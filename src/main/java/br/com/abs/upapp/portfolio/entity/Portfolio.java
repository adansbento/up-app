package br.com.abs.upapp.portfolio.entity;

import br.com.abs.upapp.portfolio.dto.PortfolioDto;
import br.com.abs.upapp.user.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_user",nullable = false)
    private User owner;

    @OneToMany(mappedBy = "portfolio",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ItemPortfolio> itemPortfolios;

    public Portfolio(PortfolioDto portfolioDto) {

        this.id = portfolioDto.getId();
        this.description = portfolioDto.getDescription();
        this.owner = new User(portfolioDto.getOwner());

        if(portfolioDto.getItemPortfolios() != null)
            this.itemPortfolios = portfolioDto.getItemPortfolios().stream().map(ItemPortfolio::new).toList();
    }
}

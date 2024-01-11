package br.com.abs.upapp.portfolio.dto;

import br.com.abs.upapp.portfolio.entity.Portfolio;
import br.com.abs.upapp.user.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PortfolioDto {

    private Long id;
    private String description;
    private OwnerDto owner;
    private List<ItemPortfolioDto> itemPortfolios = new ArrayList<>();

    public PortfolioDto(Portfolio portfolio) {
        this.id = portfolio.getId();
        this.description = portfolio.getDescription();

        if(portfolio.getOwner() != null
        && portfolio.getOwner().getId() != null) {
            this.owner = new OwnerDto(portfolio.getOwner().getId());
        }
        this.itemPortfolios = portfolio.getItemPortfolios().stream().map(ItemPortfolioDto::new).toList();
    }

    public void setOwner(UserDto owner) {
        this.owner = new OwnerDto(owner.getId());
    }
}

package br.com.abs.upapp.portfolio.mapper;

import br.com.abs.upapp.portfolio.dto.ItemPortfolioDto;
import br.com.abs.upapp.portfolio.entity.ItemPortfolio;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PortfolioItemMapper {
    PortfolioItemMapper INSTANCE = Mappers.getMapper(PortfolioItemMapper.class);
    ItemPortfolioDto objectToDto(ItemPortfolio portfolio);
    ItemPortfolioDto dtoToObject(ItemPortfolioDto portfolioDto);
    List<ItemPortfolioDto> objectToDtos(List<ItemPortfolio> portfolios);
    List<ItemPortfolio> dtoToObjects(List<ItemPortfolioDto> portfolioDtos);

}

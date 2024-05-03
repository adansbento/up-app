package br.com.abs.upapp.portfolio.mapper;

import br.com.abs.upapp.portfolio.dto.PortfolioDto;
import br.com.abs.upapp.portfolio.entity.Portfolio;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PortfolioMapper {
    PortfolioMapper INSTANCE = Mappers.getMapper(PortfolioMapper.class);
    PortfolioDto objectToDto(Portfolio portfolio);
    Portfolio dtoToObject(PortfolioDto portfolioDto);
    List<PortfolioDto> objectToDtos(List<Portfolio> portfolios);
    List<Portfolio> dtoToObjects(List<PortfolioDto> portfolioDtos);

}

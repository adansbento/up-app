package br.com.abs.upapp.portfolio.service;


import br.com.abs.upapp.portfolio.dto.PortfolioDto;

import java.util.List;

public interface PortfolioService {
    void create(PortfolioDto portfolioDto);
    PortfolioDto findById(Long idPortfolio);
    void delete(Long idPortfolio);
    List<PortfolioDto> findAll();
}

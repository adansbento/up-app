package br.com.abs.upapp.portfolio.dto;

import br.com.abs.upapp.assets.dto.AssetDto;

public record ItemPortfolioDto(Long id, Integer amount, PortfolioDto portfolio, AssetDto asset) {
}

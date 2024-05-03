package br.com.abs.upapp.portfolio.dto;

import br.com.abs.upapp.user.dto.UserDto;

import java.util.List;

public record PortfolioDto(Long id, String description, UserDto owner, List<ItemPortfolioDto> itemPortfolios) {
}

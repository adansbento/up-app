package br.com.abs.upapp.portfolio.service.impl;

import br.com.abs.upapp.assets.dto.AssetDto;
import br.com.abs.upapp.assets.service.AssetService;
import br.com.abs.upapp.portfolio.dto.ItemPortfolioDto;
import br.com.abs.upapp.portfolio.dto.PortfolioDto;
import br.com.abs.upapp.portfolio.entity.Portfolio;
import br.com.abs.upapp.portfolio.exceptions.PortfolioNotFoundException;
import br.com.abs.upapp.portfolio.mapper.PortfolioMapper;
import br.com.abs.upapp.portfolio.repository.PortfolioRepository;
import br.com.abs.upapp.portfolio.service.PortfolioService;
import br.com.abs.upapp.user.dto.UserDto;
import br.com.abs.upapp.user.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PortfolioServiceImpl implements PortfolioService {

    private PortfolioRepository portfolioRepository;
    private UserService userService;
    private AssetService assetService;

    @Autowired
    public void setAssetService(AssetService assetService) {
        this.assetService = assetService;
    }

    @Autowired
    public void setPortfolioRepository(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Transactional
    public void create(PortfolioDto portfolioDto) {
        checkAndFillAssetAndUser(portfolioDto);
        portfolioRepository.saveAndFlush(PortfolioMapper.INSTANCE.dtoToObject(portfolioDto));
    }


    private void checkAndFillAssetAndUser(PortfolioDto portfolioDto) {

        UserDto userDto = userService.findById(portfolioDto.owner().id());

       List<ItemPortfolioDto>  itemPortfolioDtoChecked  = new ArrayList<>();

        for (ItemPortfolioDto itemPortfolioDto : portfolioDto.itemPortfolios()) {
            AssetDto assetDto = assetService.findByAssetCode(itemPortfolioDto.asset().assetCode());
            ItemPortfolioDto itemPortfolioDto1 = new ItemPortfolioDto(itemPortfolioDto.id(),itemPortfolioDto.amount(),itemPortfolioDto.portfolio(),assetDto);
            itemPortfolioDtoChecked.add(itemPortfolioDto1);
        }

        portfolioDto  = new PortfolioDto(portfolioDto.id(),portfolioDto.description(),userDto,itemPortfolioDtoChecked);
    }

    public PortfolioDto findById(Long idPortfolio) throws PortfolioNotFoundException {
        Portfolio portfolio = portfolioRepository.findById(idPortfolio).orElseThrow(() -> new PortfolioNotFoundException("Portfolio id: " + idPortfolio + " not found"));
        return PortfolioMapper.INSTANCE.objectToDto(portfolio);
    }

    public List<PortfolioDto> findAll() {
        return PortfolioMapper.INSTANCE.objectToDtos(portfolioRepository.findAll());
    }

    @Override
    public void delete(Long idPortfolio) throws PortfolioNotFoundException {
        Long portfolioId = findById(idPortfolio).id();
        portfolioRepository.deleteById(portfolioId);
    }

}


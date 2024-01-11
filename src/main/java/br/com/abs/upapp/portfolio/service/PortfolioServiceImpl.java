package br.com.abs.upapp.portfolio.service;

import br.com.abs.upapp.asserts.dto.AssertDto;
import br.com.abs.upapp.asserts.service.AssertService;
import br.com.abs.upapp.portfolio.dto.ItemPortfolioDto;
import br.com.abs.upapp.portfolio.dto.PortfolioDto;
import br.com.abs.upapp.portfolio.entity.Portfolio;
import br.com.abs.upapp.portfolio.exceptions.PortfolioNotFoundException;
import br.com.abs.upapp.portfolio.repository.PortfolioRepository;
import br.com.abs.upapp.user.dto.UserDto;
import br.com.abs.upapp.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioServiceImpl implements PortfolioService {

    private PortfolioRepository portfolioRepository;
    private UserService userService;

    private AssertService assertService;

    @Autowired
    public void setAssertService(AssertService assertService) {
        this.assertService = assertService;
    }

    @Autowired
    public void setPortfolioRepository(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void create(PortfolioDto portfolioDto) {
        UserDto userDto = userService.findById(portfolioDto.getOwner().getId());
        portfolioDto.setOwner(userDto);
        checkAndFillAssert(portfolioDto);
        portfolioRepository.save(new Portfolio(portfolioDto));
    }

    private void checkAndFillAssert(PortfolioDto portfolioDto) {

        for (ItemPortfolioDto itemPortfolioDto : portfolioDto.getItemPortfolios()) {
            AssertDto assertDto = assertService.findByAssertCode(itemPortfolioDto.getAnAssert().getAssertCode());
            itemPortfolioDto.setAnAssert(assertDto);
        }
    }

    public PortfolioDto findById(Long idPortfolio) throws PortfolioNotFoundException {
        Portfolio portfolio = portfolioRepository.findById(idPortfolio).orElseThrow(() -> new PortfolioNotFoundException("Portfolio id: " + idPortfolio + " not found"));
        return new PortfolioDto(portfolio);
    }

    public List<PortfolioDto> findAll() {
        return portfolioRepository.findAll().stream().map(PortfolioDto::new).toList();
    }

    @Override
    public void delete(Long idPortfolio) throws PortfolioNotFoundException {
        Long portfolioId = findById(idPortfolio).getId();
        portfolioRepository.deleteById(portfolioId);
    }

}


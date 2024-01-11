package br.com.abs.upapp.portfolio.controller;


import br.com.abs.upapp.portfolio.dto.PortfolioDto;
import br.com.abs.upapp.portfolio.exceptions.PortfolioNotFoundException;
import br.com.abs.upapp.portfolio.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/portfolio")
public class PortfolioController {

    private PortfolioService portfolioService;

    @Autowired
    public PortfolioController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @PostMapping()
    public void create(@RequestBody PortfolioDto portfolioDto){
        portfolioService.create(portfolioDto);
    }
    @GetMapping(path = "{idPortfolio}")
    public PortfolioDto findById(@PathVariable  Long idPortfolio) throws PortfolioNotFoundException {
        return portfolioService.findById(idPortfolio);
    }
    @DeleteMapping(path = "{idPortfolio}")
    public void delete(@PathVariable  Long idPortfolio) throws PortfolioNotFoundException {
        portfolioService.delete(idPortfolio);
    }
    @GetMapping()
    public List<PortfolioDto> findAll(){
        return  portfolioService.findAll();
    }
}

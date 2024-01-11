package br.com.abs.upapp.portfolio.repository;

import br.com.abs.upapp.portfolio.entity.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
}

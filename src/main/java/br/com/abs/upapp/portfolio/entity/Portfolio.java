package br.com.abs.upapp.portfolio.entity;

import br.com.abs.upapp.user.entity.User;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_user",nullable = false)
    private User owner;

    @OneToMany(mappedBy = "portfolio",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ItemPortfolio> itemPortfolios;

    public Portfolio(Long id, String description, User owner, List<ItemPortfolio> itemPortfolios) {
        this.id = id;
        this.description = description;
        this.owner = owner;
        this.itemPortfolios = itemPortfolios;
    }

    public Portfolio() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public List<ItemPortfolio> getItemPortfolios() {
        return itemPortfolios;
    }

    public void setItemPortfolios(List<ItemPortfolio> itemPortfolios) {
        this.itemPortfolios = itemPortfolios;
    }
}

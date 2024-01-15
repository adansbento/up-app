package br.com.abs.upapp.assets.entity;

import br.com.abs.upapp.assets.dto.AssetDto;
import br.com.abs.upapp.portfolio.entity.TypeAsset;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @Column(unique = true,nullable = false)
    private String assetCode;
    @Column(length = 50)
    private String document;
    @Column(nullable = false)
    private BigDecimal value;
    @Column(nullable = false)
    private TypeAsset typeAsset;

    public Asset(AssetDto assetDto) {
        this.id = assetDto.getId();
        this.description = assetDto.getDescription();
        this.assetCode = assetDto.getAssetCode();
        this.document = assetDto.getDocument();
        this.value = assetDto.getValue();
        this.typeAsset = assetDto.getTypeAsset();
    }
}

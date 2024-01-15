package br.com.abs.upapp.assets.dto;

import br.com.abs.upapp.assets.entity.Asset;
import br.com.abs.upapp.portfolio.entity.TypeAsset;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssetDto {

    private Long id;
    private String description;
    private String assetCode;
    private String document;
    private BigDecimal value;
    private TypeAsset typeAsset;

    public AssetDto(Asset asset) {
        this.id = asset.getId();
        this.description = asset.getDescription();
        this.assetCode = asset.getAssetCode();
        this.document = asset.getDocument();
        this.value = asset.getValue();
        this.typeAsset = asset.getTypeAsset();
    }
}

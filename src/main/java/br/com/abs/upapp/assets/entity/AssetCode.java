package br.com.abs.upapp.assets.entity;

import br.com.abs.upapp.portfolio.entity.TypeAsset;
import jakarta.persistence.*;

@Entity
public class AssetCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,length = 50)
    @Enumerated(EnumType.STRING)
    private TypeAsset typeAsset;
    @Column(nullable = false,unique = true,length = 100)
    private String assetCode;

    public AssetCode() {
    }

    public AssetCode(Long id, TypeAsset typeAsset, String assetCode) {
        this.id = id;
        this.typeAsset = typeAsset;
        this.assetCode = assetCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeAsset getTypeAsset() {
        return typeAsset;
    }

    public void setTypeAsset(TypeAsset typeAsset) {
        this.typeAsset = typeAsset;
    }

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }
}

package br.com.abs.upapp.assets.dto;

import br.com.abs.upapp.portfolio.entity.TypeAsset;

public record AssetCodeDto(Long id, TypeAsset typeAsset, String assetCode) {
}


package br.com.abs.upapp.portfolio.service;

import br.com.abs.upapp.assets.dto.AssetCodeDto;

import java.util.List;

public interface AssetCodeService {
    List<AssetCodeDto> findByAssetCode(String assetCode);
    List<AssetCodeDto> findByAll();

}

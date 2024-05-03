package br.com.abs.upapp.assets.service;

import br.com.abs.upapp.assets.dto.AssetDto;

import java.util.List;

public interface AssetService {
    void create(AssetDto assetDto);
    AssetDto findById(Long idAsset);
    AssetDto findByAssetCode(String assetCode);
    void delete(Long idAsset);
    List<AssetDto> findAll();
    void update(AssetDto assetDto, Long codeAsset);

}

package br.com.abs.upapp.assets.service;

import br.com.abs.upapp.assets.dto.AssetDto;
import br.com.abs.upapp.assets.entity.Asset;
import br.com.abs.upapp.assets.exceptions.AssetNotFoundException;
import br.com.abs.upapp.assets.repository.AssetRepository;
import br.com.abs.upapp.exceptions.DuplicateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetServiceImpl implements AssetService {

    private AssetRepository assetRepository;

    @Autowired
    public AssetServiceImpl(AssetRepository assetRepository) {
        this.assetRepository = assetRepository;
    }

    public void create(AssetDto assetDto){
        checkAssetCodeExists(assetDto.getAssetCode());
        assetRepository.save(new Asset(assetDto));
    }

    public AssetDto findById(Long idAsset) throws AssetNotFoundException {
        Asset anAsset = assetRepository.findById(idAsset).orElseThrow(() -> new AssetNotFoundException("Ativo id: " + idAsset + " not found"));
        return new AssetDto(anAsset);
    }

    @Override
    public AssetDto findByAssetCode(String assetCode) {
        Asset anAsset = assetRepository.findByAssetCode(assetCode).orElseThrow(() -> new AssetNotFoundException("Ativo assetCode: " + assetCode + " not found"));
        return new AssetDto(anAsset);
    }

    public List<AssetDto> findAll() {
        return assetRepository.findAll().stream().map(AssetDto::new).toList();
    }

    @Override
    public void update(AssetDto assetDto) {

        Asset anAsset = assetRepository.findById(assetDto.getId()).orElseThrow(() -> new AssetNotFoundException("Ativo Id: " + assetDto.getId() + " not found"));

        if(!assetDto.getAssetCode().equals(anAsset.getAssetCode())){
            checkAssetCodeExists(assetDto.getAssetCode());
        }

        assetDto.setId(anAsset.getId());
        assetRepository.save(new Asset(assetDto));
    }

    @Override
    public void delete(Long idAsset) throws AssetNotFoundException {
        Long assetId = findById(idAsset).getId();
        assetRepository.deleteById(assetId);
    }

    private void checkAssetCodeExists(String assetCode) {

        boolean existsEmail = assetRepository.existsByAssetCode(assetCode);

        if(existsEmail){
            throw new DuplicateException("Codigo do ativo : "+ assetCode+" já cadastrado");
        }
    }

}
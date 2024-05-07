package br.com.abs.upapp.assets.service.impl;

import br.com.abs.upapp.assets.dto.AssetDto;
import br.com.abs.upapp.assets.entity.Asset;
import br.com.abs.upapp.assets.exceptions.AssetNotFoundException;
import br.com.abs.upapp.assets.mapper.AssetMapper;
import br.com.abs.upapp.assets.repository.AssetRepository;
import br.com.abs.upapp.assets.service.AssetService;
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
        checkAssetCodeExists(assetDto.assetCode());
        assetRepository.save(AssetMapper.INSTANCE.dtoToObject(assetDto));
    }

    public AssetDto findById(Long idAsset) throws AssetNotFoundException {
        Asset anAsset = assetRepository.findById(idAsset).orElseThrow(() -> new AssetNotFoundException("Ativo id: " + idAsset + " not found"));
        return AssetMapper.INSTANCE.objectToDto(anAsset);
    }

    @Override
    public AssetDto findByAssetCode(String assetCode) {
        Asset anAsset = assetRepository.findByAssetCode(assetCode).orElseThrow(() -> new AssetNotFoundException("Ativo assetCode: " + assetCode + " not found"));
        return AssetMapper.INSTANCE.objectToDto(anAsset);
    }

    public List<AssetDto> findAll() {
        return AssetMapper.INSTANCE.objectToDtos(assetRepository.findAll());
    }

    @Override
    public void update(AssetDto assetDto) {

        Asset assetFromDB = assetRepository.findByAssetCode(assetDto.assetCode()).orElseThrow(() -> new AssetNotFoundException("Ativo AssetCode: " + assetDto.assetCode() + " not found"));

        if(!assetDto.assetCode().equals(assetFromDB.getAssetCode())){
            checkAssetCodeExists(assetDto.assetCode());
        }

        assetRepository.save(AssetMapper.INSTANCE.dtoToObject(assetDto));
    }

    @Override
    public void delete(Long idAsset) throws AssetNotFoundException {
        Long assetId = findById(idAsset).id();
        assetRepository.deleteById(assetId);
    }

    private void checkAssetCodeExists(String assetCode) {

        boolean existsByAssetCode = assetRepository.existsByAssetCode(assetCode);

        if(existsByAssetCode){
            throw new DuplicateException("Codigo do ativo : "+ assetCode+" já cadastrado");
        }
    }

}
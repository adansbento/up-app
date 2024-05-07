package br.com.abs.upapp.assets.service.impl;

import br.com.abs.upapp.assets.mapper.AssetCodeMapper;
import br.com.abs.upapp.assets.dto.AssetCodeDto;
import br.com.abs.upapp.assets.repository.AssetCodeRepository;
import br.com.abs.upapp.assets.service.AssetCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetCodeServiceImpl implements AssetCodeService {

    private AssetCodeRepository assetRepository;


    @Autowired
    public void setAssetRepository(AssetCodeRepository assetRepository) {
        this.assetRepository = assetRepository;
    }

    @Override
    public List<AssetCodeDto> findByAssetCode(String assetCode) {
        return AssetCodeMapper.INSTANCE.objectToDtos(assetRepository.findByAssetCode(assetCode));
    }

    @Override
    public List<AssetCodeDto> findByAll() {
        return  AssetCodeMapper.INSTANCE.objectToDtos(assetRepository.findAll());
    }
}

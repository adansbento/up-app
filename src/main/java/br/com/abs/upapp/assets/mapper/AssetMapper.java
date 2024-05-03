package br.com.abs.upapp.assets.mapper;

import br.com.abs.upapp.assets.dto.AssetDto;
import br.com.abs.upapp.assets.entity.Asset;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AssetMapper {
    AssetMapper INSTANCE = Mappers.getMapper(AssetMapper.class);
    AssetDto objectToDto(Asset asset);
    Asset dtoToObject(AssetDto asset);

    List<AssetDto> objectToDtos(List<Asset> asset);
    List<Asset> dtoToObjects(List<AssetDto> asset);



}

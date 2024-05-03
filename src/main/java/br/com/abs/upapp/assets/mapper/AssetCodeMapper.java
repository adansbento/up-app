package br.com.abs.upapp.assets.mapper;

import br.com.abs.upapp.assets.dto.AssetCodeDto;
import br.com.abs.upapp.assets.entity.AssetCode;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AssetCodeMapper {
    AssetCodeMapper INSTANCE = Mappers.getMapper(AssetCodeMapper.class);
    AssetCodeDto objectToDto(AssetCode assetCode);
    AssetCode dtoToObject(AssetCodeDto assetCodeDto);

    List<AssetCodeDto> objectToDtos(List<AssetCode> assetCodes);
    List<AssetCode> dtoToObjects(List<AssetCodeDto> assetCodeDtos);

}

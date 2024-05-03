package br.com.abs.upapp.assets.repository;

import br.com.abs.upapp.assets.entity.AssetCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssetCodeRepository extends JpaRepository<AssetCode, Long> {

    List<AssetCode> findByAssetCode(String assetCode);
}

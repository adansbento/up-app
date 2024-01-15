package br.com.abs.upapp.assets.repository;

import br.com.abs.upapp.assets.entity.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AssetRepository extends JpaRepository<Asset, Long> {

    boolean existsByAssetCode(String assetCode);

   Optional<Asset> findByAssetCode(String assetCode);
}

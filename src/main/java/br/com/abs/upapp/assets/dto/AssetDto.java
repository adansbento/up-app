package br.com.abs.upapp.assets.dto;

import br.com.abs.upapp.portfolio.entity.TypeAsset;

import java.math.BigDecimal;
import java.util.List;

public record AssetDto(Long id,
         String assetCode,
        String document,
        String shortName,
        String longName,
        Integer averageDailyVolume3Month,
        Integer averageDailyVolume10Day,
        BigDecimal lastValue,
        Long marketCap,
        TypeAsset typeAsset,
        String address1,
        String address2,
        String city,
        String state,
        String zip,
        String country,
        String phone,
        String website,
        String industry,
        String industryKey,
        String industryDisp,
        String sector,
        String sectorKey,
        String sectorDisp,
        String longBusinessSummary,
        Integer fullTimeEmployees,
       List<String> companyOfficers) {

    }


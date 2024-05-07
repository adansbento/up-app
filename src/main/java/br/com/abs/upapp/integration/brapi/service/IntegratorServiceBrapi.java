package br.com.abs.upapp.integration.brapi.service;


import br.com.abs.upapp.assets.dto.AssetCodeDto;
import br.com.abs.upapp.integration.brapi.model.IntegrationSupplier;
import br.com.abs.upapp.integration.brapi.model.ResponseStock;
import br.com.abs.upapp.integration.util.service.IntegratorService;
import br.com.abs.upapp.portfolio.entity.TypeAsset;
import br.com.abs.upapp.assets.service.AssetCodeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Service
public class IntegratorServiceBrapi implements IntegratorService {



    @Value("${quote.api.brapi.url-quote}")
    private String URL_QUOTE;

    @Value("${quote.api.brapi.key-name}")
    private String API_KEY_NAME;

    @Value("${quote.api.brapi.key-value}")
    private String API_KEY_VALUE = "Bearer eXuzM7HVihDcG4DFp6NxWt";

    private AssetCodeService assetCodeService;

    @Autowired
    public IntegratorServiceBrapi(AssetCodeService assetCodeService) {
        this.assetCodeService = assetCodeService;
    }

    @Override
    public void init(){
        Set<String> assetCodes = getAssetCodes();
        List<ResponseStock> infoAsset = getInfoAsset(assetCodes);
    }

    @Override
    public IntegrationSupplier getSupplier() {
        return IntegrationSupplier.BRAPI;
    }

    private OkHttpClient getConnection() throws URISyntaxException, IOException {

        return new OkHttpClient.Builder()
                .readTimeout(1000, TimeUnit.MILLISECONDS)
                .writeTimeout(1000, TimeUnit.MILLISECONDS)
                .build();

    }

    private List<ResponseStock> getInfoAsset(Set<String> assetCodes){

        List<ResponseStock> responseStocks = new ArrayList<>();

        assetCodes.parallelStream().forEach(assetCode -> {

                    try {
                        Request request = new Request.Builder()
                                .url(URL_QUOTE+"quote/"+assetCode+"?&range=3mo&fundamental=true&modules=summaryProfile")
                                .get()
                                .addHeader(API_KEY_NAME, API_KEY_VALUE)
                                .build();

                        Call call = getConnection().newCall(request);
                        ResponseBody responseBody = call.execute().body();
                        ObjectMapper objectMapper = new ObjectMapper();
                        ResponseStock responseStock = objectMapper.readValue(responseBody.string(), ResponseStock.class);
                        responseStocks.add(responseStock);

                    } catch (URISyntaxException | IOException e) {
                        throw new RuntimeException(e);
                    }
                }
        );

        return responseStocks;

    }


    private Set<String> getAssetCodes(){
        return assetCodeService.findByAssetCode(TypeAsset.STOCK.name()).stream().map(AssetCodeDto::assetCode).collect(Collectors.toSet());
    }


}

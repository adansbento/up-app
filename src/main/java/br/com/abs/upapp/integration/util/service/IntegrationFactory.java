package br.com.abs.upapp.integration.util.service;

import br.com.abs.upapp.integration.brapi.model.IntegrationSupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

import static java.util.stream.Collectors.toUnmodifiableMap;

@Component
public class IntegrationFactory {

    private static Map<IntegrationSupplier, IntegratorService> integrationMap;

    @Autowired
    private IntegrationFactory(List<IntegratorService> integratorServices) {
        integrationMap =    integratorServices.stream().collect(toUnmodifiableMap(IntegratorService::getSupplier, Function.identity()));
    }

    public static IntegratorService getIntegration(IntegrationSupplier integrationSupplier) {
        return   Optional.ofNullable(integrationMap.get(integrationSupplier)).orElseThrow(IllegalArgumentException::new);
    }
}

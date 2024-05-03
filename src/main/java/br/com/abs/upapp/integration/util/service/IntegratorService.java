package br.com.abs.upapp.integration.util.service;

import br.com.abs.upapp.integration.brapi.model.IntegrationSupplier;

public interface IntegratorService {
    void init();
    IntegrationSupplier getSupplier();

}


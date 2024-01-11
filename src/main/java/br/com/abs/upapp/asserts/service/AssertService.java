package br.com.abs.upapp.asserts.service;

import br.com.abs.upapp.asserts.dto.AssertDto;

import java.util.List;

public interface AssertService {
    void create(AssertDto assertDto);
    AssertDto findById(Long idAssert);
    AssertDto findByAssertCode(String assertCode);
    void delete(Long idAssert);
    List<AssertDto> findAll();
    void update(AssertDto assertDto);
}

package br.com.abs.upapp.asserts.service;

import br.com.abs.upapp.asserts.dto.AssertDto;
import br.com.abs.upapp.asserts.entity.Assert;
import br.com.abs.upapp.asserts.exceptions.AssertNotFoundException;
import br.com.abs.upapp.asserts.repository.AssertRepository;
import br.com.abs.upapp.exceptions.DuplicateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssertServiceImpl implements AssertService {

    private AssertRepository assertRepository;

    @Autowired
    public AssertServiceImpl(AssertRepository assertRepository) {
        this.assertRepository = assertRepository;
    }

    public void create(AssertDto assertDto){
        checkAssertCodeExists(assertDto.getAssertCode());
        assertRepository.save(new Assert(assertDto));
    }

    public AssertDto findById(Long idAssert) throws AssertNotFoundException {
        Assert anAssert = assertRepository.findById(idAssert).orElseThrow(() -> new AssertNotFoundException("Ativo id: " + idAssert + " not found"));
        return new AssertDto(anAssert);
    }

    @Override
    public AssertDto findByAssertCode(String assertCode) {
        Assert anAssert = assertRepository.findByAssertCode(assertCode).orElseThrow(() -> new AssertNotFoundException("Ativo assertCode: " + assertCode + " not found"));
        return new AssertDto(anAssert);
    }

    public List<AssertDto> findAll() {
        return assertRepository.findAll().stream().map(AssertDto::new).toList();
    }

    @Override
    public void update(AssertDto assertDto) {

        Assert anAssert = assertRepository.findById(assertDto.getId()).orElseThrow(() -> new AssertNotFoundException("Ativo Id: " + assertDto.getId() + " not found"));

        if(!assertDto.getAssertCode().equals(anAssert.getAssertCode())){
            checkAssertCodeExists(assertDto.getAssertCode());
        }

        assertDto.setId(anAssert.getId());
        assertRepository.save(new Assert(assertDto));
    }

    @Override
    public void delete(Long idAssert) throws AssertNotFoundException {
        Long assertId = findById(idAssert).getId();
        assertRepository.deleteById(assertId);
    }

    private void checkAssertCodeExists(String assertCode) {

        boolean existsEmail = assertRepository.existsByAssertCode(assertCode);

        if(existsEmail){
            throw new DuplicateException("Codigo do ativo : "+ assertCode+" já cadastrado");
        }
    }

}
package br.com.abs.upapp.asserts.controller;


import br.com.abs.upapp.asserts.dto.AssertDto;
import br.com.abs.upapp.asserts.exceptions.AssertNotFoundException;
import br.com.abs.upapp.asserts.service.AssertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/assert")
public class AssertController {

    private AssertService assertService;

    @Autowired
    public AssertController(AssertService assertService) {
        this.assertService = assertService;
    }

    @PostMapping()
    public void create(@RequestBody AssertDto assertDto){
        assertService.create(assertDto);
    }

    @PutMapping(path = "{idAssert}")
    public void update(@RequestBody AssertDto assertDto,@PathVariable  Long idAssert){
        assertDto.setId(idAssert);
        assertService.update(assertDto);
    }

    @GetMapping(path = "{idAssert}")
    public AssertDto findById(@PathVariable  Long idAssert) throws AssertNotFoundException {
        return assertService.findById(idAssert);
    }

    @DeleteMapping(path = "{idAssert}")
    public void delete(@PathVariable  Long idAssert) throws AssertNotFoundException {
        assertService.delete(idAssert);
    }
    @GetMapping()
    public List<AssertDto> findAll(){
        return  assertService.findAll();
    }
}

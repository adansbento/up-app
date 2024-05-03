package br.com.abs.upapp.assets.controller;


import br.com.abs.upapp.assets.dto.AssetDto;
import br.com.abs.upapp.assets.exceptions.AssetNotFoundException;
import br.com.abs.upapp.assets.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/asset")
public class AssetController {

    private AssetService assetService;

    @Autowired
    public AssetController(AssetService assetService) {
        this.assetService = assetService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody AssetDto assetDto){
        assetService.create(assetDto);
    }

    @PutMapping(path = "{idAsset}")
    public void update(@RequestBody AssetDto assetDto,@PathVariable  Long idAsset){
        assetService.update(assetDto,idAsset);
    }

    @GetMapping(path = "{idAsset}")
    public AssetDto findById(@PathVariable  Long idAsset) throws AssetNotFoundException {
        return assetService.findById(idAsset);
    }

    @DeleteMapping(path = "{idAsset}")
    public void delete(@PathVariable  Long idAsset) throws AssetNotFoundException {
        assetService.delete(idAsset);
    }
    @GetMapping()
    public List<AssetDto> findAll(){
        return  assetService.findAll();
    }
}

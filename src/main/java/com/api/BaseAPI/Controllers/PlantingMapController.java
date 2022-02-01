package com.api.BaseAPI.Controllers;

import com.api.BaseAPI.Domains.*;
import com.api.BaseAPI.Services.PlantingMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plantingMap")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class PlantingMapController {

    @Autowired
    private PlantingMapService plantingMapService;

    @GetMapping(value = "/list")
    public ApiResponse getPlantingMaps(@RequestParam Integer userId){
        return this.plantingMapService.read(userId);
    }

    @PostMapping(value = "/save")
    public ApiResponse savePlantingMaps(@RequestBody PlantingMapEntity plantingMapEntity){
        return this.plantingMapService.create(plantingMapEntity);
    }

}

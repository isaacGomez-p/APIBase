package com.api.BaseAPI.Controllers.Front;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Services.Front.LabelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/labels")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class LabelsController {

    @Autowired
    private LabelsService labelsService;

    @GetMapping(value = "/list")
    public ApiResponse getLabels(){
        return this.labelsService.getLabels();
    }

}

package com.api.BaseAPI.Controllers;

import com.api.BaseAPI.Domains.ApiResponse;
import com.api.BaseAPI.Domains.NSpreadsheetEntity;
import com.api.BaseAPI.Domains.UserEntity;
import com.api.BaseAPI.Services.NSpreadsheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spreadsheet")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class NSpreadsheetController {

    @Autowired
    private NSpreadsheetService nSpreasheetService;

    @GetMapping(value = "/list")
    public ApiResponse getSpreadsheets(){
        return this.nSpreasheetService.read();
    }

    @PostMapping(value = "/save")
    public ApiResponse saveSpreadsheets(@RequestBody NSpreadsheetEntity nSpreadsheetEntity){
        return this.nSpreasheetService.create(nSpreadsheetEntity);
    }

}

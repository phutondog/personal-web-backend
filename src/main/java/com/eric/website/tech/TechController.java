package com.eric.website.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tech")
public class TechController {

    private final TechService techService;

    @Autowired
    public TechController(TechService techService) {
        this.techService = techService;
    }


    @GetMapping(value = "")
    public @ResponseBody Optional<List<Tech>>  getAllTech(){
        return techService.getAllTech();
    }


}

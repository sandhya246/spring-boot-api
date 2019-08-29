package com.tekion.springbootapi.controller;

import com.tekion.springbootapi.bean.Series;
import com.tekion.springbootapi.repository.SeriesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class SeriesController {

    @Autowired
    private SeriesRepo seriesRepo;

    @GetMapping("/series/{seriesId}")
    public Optional<Series> retrieveSeriesData(@PathVariable("seriesId") int seriesId)
    {
        return seriesRepo.findById(seriesId);
    }
}

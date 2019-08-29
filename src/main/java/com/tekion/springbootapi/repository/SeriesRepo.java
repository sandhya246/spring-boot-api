package com.tekion.springbootapi.repository;

import com.tekion.springbootapi.bean.Series;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepo extends JpaRepository<Series,Integer> {
}

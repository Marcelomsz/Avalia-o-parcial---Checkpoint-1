package com.marcelo.catalog.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "movie")
public interface MovieFeign {
    @RequestMapping(method = RequestMethod.GET, value = "/movie/catalog/{id}")
    String findName(@PathVariable(value = "id") Long idCatalog);
}

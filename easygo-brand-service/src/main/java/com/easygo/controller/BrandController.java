package com.easygo.controller;

import com.easygo.pojo.Brand;
import com.easygo.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BrandController {
    @Autowired
    private BrandService brandService;

    @RequestMapping("/getBrandList")
    public List<Brand> getBrandList(Brand brand){
        return brandService.selectBrandList(brand);
    }

    @RequestMapping("/getBrandById")
    public Brand getBrandById(@RequestParam Integer id){
        return brandService.selectBrandById(id);
    }

    @RequestMapping("/updateBrand")
    public int updateBrand(Brand brand){
        return brandService.updateBrand(brand);
    }

    @RequestMapping("/deleteBrandById")
    public int deleteBrandById(@RequestParam Integer id){
        return brandService.deleteBrandById(id);
    }

    @RequestMapping("/insertBrand")
    public int insertBrand(Brand brand){
        return brandService.insertBrand(brand);
    }

}

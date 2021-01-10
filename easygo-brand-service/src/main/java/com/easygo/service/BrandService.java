package com.easygo.service;

import com.easygo.pojo.Brand;

import java.util.List;

public interface BrandService {

    List<Brand> selectBrandList(Brand brand);

    Brand selectBrandById(Integer id);

    int insertBrand(Brand brand);

    int updateBrand(Brand brand);

    int deleteBrandById(Integer id);
}

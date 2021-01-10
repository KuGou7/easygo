package com.easygo.service.impl;

import com.easygo.mapper.BrandMapper;
import com.easygo.pojo.Brand;
import com.easygo.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> selectBrandList(Brand brand) {
        return brandMapper.selectBrandList(brand);
    }

    @Override
    public Brand selectBrandById(Integer id) {
        return brandMapper.selectBrandById(id);
    }

    @Override
    public int insertBrand(Brand brand) {
        return brandMapper.insertBrand(brand);
    }

    @Override
    public int updateBrand(Brand brand) {
        return brandMapper.updateBrand(brand);
    }

    @Override
    public int deleteBrandById(Integer id) {
        return brandMapper.deleteBrandById(id);
    }
}

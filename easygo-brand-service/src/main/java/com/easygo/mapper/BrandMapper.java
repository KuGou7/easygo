package com.easygo.mapper;

import com.easygo.pojo.Brand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BrandMapper {

    List<Brand> selectBrandList(Brand brand);

    Brand selectBrandById(Integer id);

    int insertBrand(Brand brand);

    int updateBrand(Brand brand);

    int deleteBrandById(Integer id);

}

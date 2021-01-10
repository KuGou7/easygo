package com.easygo.test;

import com.easygo.mapper.BrandMapper;
import com.easygo.pojo.Brand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BrandTest {

    @Autowired
    BrandMapper brandMapper;

    @Test
    public void testSelectList(){
        System.out.println(brandMapper.selectBrandList(new Brand()));
    }

    @Test
    public void testSelectById(){
        System.out.println(brandMapper.selectBrandById(1));
    }

    @Test
    public void add(){
        Brand brand = new Brand();
        brand.setName("osm");
        brand.setImage("test");
        brand.setFirstChar("L");
        System.out.println(brandMapper.insertBrand(brand) > 0?"新增成功":"失败");
    }

    @Test
    public void update(){
        Brand brand = new Brand();
        brand.setName("osm");
        brand.setImage("test");
        brand.setFirstChar("L");
        brand.setId(1);
        System.out.println(brandMapper.updateBrand(brand) > 0?"更新成功":"失败");
    }


    @Test
    public void delete(){
        System.out.println(brandMapper.deleteBrandById(1) > 0?"删除成功":"失败");
    }
}

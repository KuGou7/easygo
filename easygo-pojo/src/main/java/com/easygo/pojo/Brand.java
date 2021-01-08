package com.easygo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Brand implements Serializable {
    private Integer id;
    private String name;
    private String image;
    private String firstChar;
    private Integer del;
}

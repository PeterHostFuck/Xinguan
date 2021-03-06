package com.coderman.api.biz.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Author zhangyukang
 * @Date 2020/3/17 09:16
 * @Version 1.0
 **/
@Data
public class ProductVO {

    private Long id;

    private String pNum;

    @NotBlank
    private String name;

    @NotBlank
    private String model;

    @NotBlank
    private String unit;

    @NotBlank
    private String remark;

    private Integer sort;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date createTime;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date modifiedTime;


    private String imageUrl;


    @NotNull(message = "分类不能为空")
    private Long[] categoryKeys;

    private Long oneCategoryId;

    private Long twoCategoryId;

    private Long threeCategoryId;

    //商品库存
    private Long stock=0L;
}

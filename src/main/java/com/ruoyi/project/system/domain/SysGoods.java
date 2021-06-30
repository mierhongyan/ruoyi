package com.ruoyi.project.system.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @Author: baimh
 * @Date: 2020/11/11 14:21
 */
public class SysGoods extends BaseEntity {

    public SysGoods(String goodsId) {
        this.goodsId = goodsId;
    }
    public SysGoods()
    {

    }
    /** 商品ID */
    @Excel(name = "商品序号", cellType = Excel.ColumnType.NUMERIC)
    private String goodsId;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String goodsName;

    /** 商品状态（0有效 1失效） */
    @Excel(name = "商品状态", readConverterExp = "0=有效,1=失效")
    private String status;

    /** 商品数量 */
    @Excel(name = "商品数量")
    private int goodsNum;

    /** 商品价格 */
    @Excel(name = "商品价格")
    private double goodsPrice;

    /** 商品图片url */
    @Excel(name = "商品图片url")
    private String goodsImgurl;

    /** 商品划线价格 */
    @Excel(name = "商品划线价格")
    private double goodsOldprice;

    /** 商品原价 */
    @Excel(name = "商品原价")
    private double goodsOriginalprice;

    /** 商品已售数量 */
    @Excel(name = "商品已售数量")
    private int goodsSoldnum;

    /** 商品数量单位 */
    @Excel(name = "商品数量单位")
    private String goodsNumunit;

    /** 商品价格单位 */
    @Excel(name = "商品价格单位")
    private String goodsPriceunit;


    /** 商品原价 */
    @Excel(name = "父级商品ID")
    private String goodsParentid;

    /** 备注 */
    @Excel(name = "备注")
    private String remark;



    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    @NotBlank(message = "商品名称不能为空")
    @Size(min = 0, max = 100, message = "角色名称长度不能超过100个字符")
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsImgurl() {
        return goodsImgurl;
    }

    public void setGoodsImgurl(String goodsImgurl) {
        this.goodsImgurl = goodsImgurl;
    }

    public double getGoodsOldprice() {
        return goodsOldprice;
    }

    public void setGoodsOldprice(double goodsOldprice) {
        this.goodsOldprice = goodsOldprice;
    }

    public double getGoodsOriginalprice() {
        return goodsOriginalprice;
    }

    public void setGoodsOriginalprice(double goodsOriginalprice) {
        this.goodsOriginalprice = goodsOriginalprice;
    }

    public int getGoodsSoldnum() {
        return goodsSoldnum;
    }

    public void setGoodsSoldnum(int goodsSoldnum) {
        this.goodsSoldnum = goodsSoldnum;
    }

    public String getGoodsNumunit() {
        return goodsNumunit;
    }

    public void setGoodsNumunit(String goodsNumunit) {
        this.goodsNumunit = goodsNumunit;
    }

    public String getGoodsPriceunit() {
        return goodsPriceunit;
    }

    public void setGoodsPriceunit(String goodsPriceunit) {
        this.goodsPriceunit = goodsPriceunit;
    }


    public String getGoodsParentid() {
        return goodsParentid;
    }

    public void setGoodsParentid(String goodsParentid) {
        this.goodsParentid = goodsParentid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

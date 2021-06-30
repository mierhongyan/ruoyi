package com.ruoyi.project.system.service;

import com.ruoyi.project.system.domain.SysGoods;

import java.util.List;

/**
 * @Author: baimh
 * @Date: 2020/11/11 14:19
 */
public interface ISysGoodsService {

    /**
     * 根据条件分页查询货品数据
     *
     * @param goods 货品信息
     * @return 货品数据集合信息
     */
    public List<SysGoods> selectGoodsList(SysGoods goods);

}

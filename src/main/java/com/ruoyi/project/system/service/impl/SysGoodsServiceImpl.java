package com.ruoyi.project.system.service.impl;

import com.ruoyi.common.utils.spring.SpringUtils;
import com.ruoyi.project.system.domain.SysGoods;
import com.ruoyi.project.system.domain.SysRole;
import com.ruoyi.project.system.mapper.SysGoodsMapper;
import com.ruoyi.project.system.service.ISysGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: baimh
 * @Date: 2020/11/11 14:31
 */
@Service
public class SysGoodsServiceImpl implements ISysGoodsService {

    @Autowired
    private SysGoodsMapper goodsMapper;

    /**
     * 查询货品列表
     * @param goods 货品信息
     * @return
     */
    @Override
    public List<SysGoods> selectGoodsList(SysGoods goods) {
        return goodsMapper.selectGoodsList(goods);
    }

//    /**
//     * 新增保存角色信息
//     *
//     * @param role 角色信息
//     * @return 结果
//     */
//    @Override
//    @Transactional
//    public int insertRole(SysRole role)
//    {
//        // 新增角色信息
//        roleMapper.insertRole(role);
//        return insertRoleMenu(role);
//    }
}

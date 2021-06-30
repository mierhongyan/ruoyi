package com.ruoyi.project.system.controller;

import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.system.domain.SysGoods;
import com.ruoyi.project.system.domain.SysRole;
import com.ruoyi.project.system.service.ISysGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: baimh
 * @Date: 2020/11/11 14:15
 */
@RestController
@RequestMapping("/product/goods")
public class SysGoodsController extends BaseController {

    @Autowired
    private ISysGoodsService goodsService;

    /**
     * 查询商品列表
     * @param goods
     * @return
     */
    @PreAuthorize("@ss.hasPermi('product:goods:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysGoods goods)
    {
        startPage();
        List<SysGoods> list = goodsService.selectGoodsList(goods);

        return getDataTable(list);
    }

    /**
     * 新增商品
     */
    @PreAuthorize("@ss.hasPermi('product:goods:add')")
    @Log(title = "商品管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Validated @RequestBody SysGoods goods)
    {
//        if (UserConstants.NOT_UNIQUE.equals(goodsService.checkRoleNameUnique(role)))
//        {
//            return AjaxResult.error("新增商品'" + role.getRoleName() + "'失败，角色名称已存在");
//        }
//        else if (UserConstants.NOT_UNIQUE.equals(roleService.checkRoleKeyUnique(role)))
//        {
//            return AjaxResult.error("新增商品'" + role.getRoleName() + "'失败，角色权限已存在");
//        }
        //插入创建人
        goods.setCreateBy(SecurityUtils.getUsername());
//        return toAjax(goodsService.insertRole(goods));
        return null;

    }
}

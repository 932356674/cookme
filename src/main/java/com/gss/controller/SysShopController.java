package com.gss.controller;

import com.gss.entity.Product;
import com.gss.service.SysShopService;
import com.gss.utils.Pager;
import com.gss.utils.R;
import com.gss.utils.ResultData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

@RestController
@RequestMapping("/sys")
@Api(value = "商城",produces = "application/json")
public class SysShopController {

    @Resource
    private SysShopService sysShopService;


    @ApiOperation(value = "首页",notes = "菜市场首页")
    @RequestMapping(value = "/product/index",method = RequestMethod.POST)
    public Map shop(@RequestBody List<Product> sorts){
        List<Product> timeProduct = sysShopService.selectRecommend();
        Map<String,List<Product>> map = new HashMap<>();
        map.put("timeProduct",timeProduct);
       for(int i=0; i<sorts.size() ; i++){
           List<Product> list1 = sysShopService.selectProductList(sorts.get(i).getSort());
           map.put("sort"+(i),list1);
       }
       return map;
    }

    @ApiOperation(value = "查询",notes = "模糊查询")
    @RequestMapping(value = "/product/select",method = RequestMethod.POST)
    public ResultData product(Pager pager, String search){
        return sysShopService.selectByPage(pager, search);
    }
}
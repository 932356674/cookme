package com.gss.controller;

import com.gss.dto.CookbookDTO;
import com.gss.entity.Cookbook;
import com.gss.entity.Material;
import com.gss.entity.Step;
import com.gss.service.SysBookService;
import com.gss.utils.R;
import com.gss.utils.ShiroUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/sys")
@Api(value = "发布菜谱",produces = "application/json")
public class SysBookController {

    @Resource
    private SysBookService sysBookService;

    @ApiOperation(value = "发布",notes = "发布菜谱")
    @RequestMapping(value = "/user/book/addBook",method = RequestMethod.POST)
    public R add(@RequestBody CookbookDTO cookbook){
        return sysBookService.add(cookbook);
    }
}
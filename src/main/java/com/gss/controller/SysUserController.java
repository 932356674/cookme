package com.gss.controller;


import com.gss.entity.Regist;
import com.gss.entity.User;
import com.gss.service.SysUserService;
import com.gss.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sys")
@Api(value = "用户控制器",produces = "application/json")
public class SysUserController {

    @Resource
    private SysUserService sysUserService;

    @ApiOperation(value = "注册",notes = "查询手机号是否存在")
    @RequestMapping(value = "/user/selectMobile/{usMobile}",method = RequestMethod.POST)
    public R selectMobile(@PathVariable Long usMobile){
        return sysUserService.selectMobile(usMobile);
    }



    @ApiOperation(value = "注册",notes = "获取手机验证码")
    @RequestMapping(value = "/user/sendCode/{usMobile}",method = RequestMethod.POST)
    public R getCode(@PathVariable Long usMobile){
        return sysUserService.getCode(usMobile);
    }


    @ApiOperation(value = "注册",notes = "提交注册信息")
    @RequestMapping(value = "/user/register/{code}",method = RequestMethod.POST)
    public R register(@PathVariable int code,@RequestBody User user){
        return sysUserService.register(user,code);
    }


    @ApiOperation(value = "重置密码",notes = "重置密码的验证码")
    @RequestMapping(value = "/user/verifyCode",method = RequestMethod.POST)
    public R verifyCode(@RequestBody Regist regist){
        return sysUserService.verifyCode(regist);
    }


    @ApiOperation(value = "重置密码",notes = "修改密码")
    @RequestMapping(value = "/user/resetPwd",method = RequestMethod.POST)
    public R resetPwd(@RequestBody User user){
        return sysUserService.resetPwd(user);
    }

    @ApiOperation(value = "首页获取用户信息",notes = "首页随机获取用户信息")
    @RequestMapping(value = "/user/selectBest",method = RequestMethod.GET)
    public R selectBest(){
        return sysUserService.selectBest();
    }





}

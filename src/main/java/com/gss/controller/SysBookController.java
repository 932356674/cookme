package com.gss.controller;

import com.gss.dto.BookDTO;
import com.gss.dto.CookbookDTO;
import com.gss.entity.Cookbook;
import com.gss.entity.Material;
import com.gss.entity.Step;
import com.gss.entity.User;
import com.gss.service.SysBookService;
import com.gss.service.SysUserService;
import com.gss.utils.Pager;
import com.gss.utils.R;
import com.gss.utils.ResultData;
import com.gss.utils.ShiroUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
@RestController
@RequestMapping("/sys")
@Api(value = "菜谱控制器",produces = "application/json")
@CrossOrigin(origins = {"*"})
public class SysBookController {

    @Resource
    private SysBookService sysBookService;
    @Resource
    private SysUserService sysUserService;

    @ApiOperation(value = "发布",notes = "发布菜谱")
    @RequestMapping(value = "/user/book/addBook",method = RequestMethod.POST)
    public R add(@RequestBody BookDTO bookDTO){
        return sysBookService.add(bookDTO);
    }

    @ApiOperation(value = "收藏菜谱",notes = "收藏菜谱")
    @RequestMapping(value = "/user/bookAddCollect/{bookId}",method = RequestMethod.GET)
    public R addCollect(@PathVariable int bookId){
        return sysBookService.addCollect(bookId);
    }

    @ApiOperation(value = "模糊查询菜谱或食材",notes = "模糊查询菜谱或食材")
    @RequestMapping(value = "/book/fuzzySelectBook",method = RequestMethod.POST)
    public ResultData selectBook(@RequestBody Pager pager, String search){
        return sysBookService.selectBook(pager,search);
    }

    @ApiOperation(value = "菜谱评论",notes = "菜谱评论")
    @RequestMapping(value = "/book/comment",method = RequestMethod.POST)
    public R comment(int bookId,String commentValue){
        return sysBookService.comment(bookId,commentValue);
    }

    @ApiOperation(value = "查询菜谱",notes = "根据菜谱ID查询菜谱详情")
    @RequestMapping(value = "/book/commentById/{bookId}",method = RequestMethod.GET)
    public R selectByBookId(@PathVariable int bookId){
        R r= sysBookService.selectBookById(bookId);
        Cookbook cookbook = (Cookbook) r.get("cookbook");
        User user = (User) sysUserService.selectMyHome(cookbook.getUsId()).get("user");
        return r.put("user",user);
    }

    //根据菜谱类型获得菜谱简略信息
    @ApiOperation(value = "根据菜谱类型查询",notes = "根据菜谱类型获得菜谱简略信息")
    @RequestMapping(value = "/book/selectByType/{typeId}",method = RequestMethod.POST)
    public ResultData selectByType(@PathVariable Integer typeId ,@RequestBody Pager pager){
        return sysBookService.selectByType(typeId,pager);
    }

    @ApiOperation(value = "查询首页时间菜谱",notes = "根据菜谱类型获得菜谱简略信息")
    @RequestMapping(value = "/book/selectByTimeType",method = RequestMethod.GET)
    public R selectByTimeType(Integer typeId){
        return sysBookService.selectByTimeType(typeId);
    }
    @ApiOperation(value = "查询首页推荐菜谱",notes = "获得菜谱简略信息")
    @RequestMapping(value = "/book/selectByBest",method = RequestMethod.GET)
    public R selectByBest(){
        return sysBookService.selectByBest();
    }

}

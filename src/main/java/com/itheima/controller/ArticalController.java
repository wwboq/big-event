package com.itheima.controller;


import com.itheima.pojo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticalController {
    @GetMapping("/list")
    public Result<String> list(){
        return Result.success("所有的文章数据...");
    }
}

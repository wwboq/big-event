package com.itheima.controller;


import com.itheima.pojo.Result;
import com.itheima.utils.JwtUtil;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/article")
public class ArticalController {
    @GetMapping("/list")
    public Result<String> list(/*@RequestHeader(name = "Authorization") String token, HttpServletResponse response*/){
        //验证token
//        try {
//            Map<String, Object> claims = JwtUtil.praseToken(token);
//            return Result.success("所有的文章数据...");
//        } catch (Exception e) {
//            //http响应状态码为401
//            response.setStatus(401);
//            return Result.error("未登录");
//        }
        return Result.success("所有的文章数据...");
    }
}

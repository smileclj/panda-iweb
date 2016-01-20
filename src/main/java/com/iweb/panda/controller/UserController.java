package com.iweb.panda.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iweb.panda.common.enums.ErrorCode;
import com.iweb.panda.common.resp.JsonpResult;
import com.iweb.panda.common.resp.Result;

@RestController
@RequestMapping(value = "/user")
public class UserController extends BaseController {

    @RequestMapping(value = "/getUserInfo")
    public JsonpResult getUserInfo(HttpServletRequest req) {
        logger.info("getUserInfo");
        return result(req, new Result(ErrorCode.SUCCESS));
    }

    @RequestMapping(value = "/get",method=RequestMethod.GET)
    public void get(String name) {
        logger.info("get:{}", name);
    }

    @RequestMapping(value = "/post",method=RequestMethod.POST)
    public void post(String name) {
        logger.info("post:{}", name);
    }
    
    @RequestMapping(value = "/getAndPost")
    public void getAndPost(String name) {
        logger.info("getAndPost:{}", name);
    }
}

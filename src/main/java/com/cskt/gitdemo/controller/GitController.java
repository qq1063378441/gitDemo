package com.cskt.gitdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Date: 2022/4/5
 * Time: 11:06
 *
 * @author 10633
 */
@RestController
public class GitController {

    @RequestMapping("hello")
    public String aaa(){
        return "hello git";
    }

}

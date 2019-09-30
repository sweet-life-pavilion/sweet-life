package com.wnwy.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wang
 * @version 1.0
 * @
 * 处理主页的请求
 */
@Controller
public class IndexController {



    @RequestMapping("index")
    public String index(){




        return "home-page";
    }


}

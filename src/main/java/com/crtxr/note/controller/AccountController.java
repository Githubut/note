package com.crtxr.note.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author crtxr
 * @since 2019-08-30
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @RequestMapping("index.html")
    public String index() {
        return "html/index";
    }


}

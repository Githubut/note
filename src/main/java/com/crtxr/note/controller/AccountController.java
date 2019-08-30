package com.crtxr.note.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.crtxr.note.entity.Account;
import com.crtxr.note.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

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

    @Autowired
    private AccountService accountServicee;

    @RequestMapping("index.html")
    public String index() {
        return "html/index";
    }


    @RequestMapping("page")
    @ResponseBody
    public Object page() {
        Page<Account> page = new Page<>(1, 15);
        Map<String, Object> pm = new HashMap<>(8);
        pm.put("id", 2);
        page = accountServicee.pageList(page, pm);
//        IPage<Account> iPage = accountServicee.page(page);
        return page;
    }


}

package com.crtxr.note.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.crtxr.note.entity.Account;
import com.crtxr.note.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.management.Query;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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


    @RequestMapping("/page")
    @ResponseBody
    public Object page() {
        Page<Account> page = new Page<>(1, 15);
        Map<String, Object> pm = new HashMap<>(8);
        pm.put("id", 2);
        page = accountServicee.pageList(page, pm);
        return page;
    }

    @RequestMapping("/webtest")
    @ResponseBody
    public Object webtest() {

        return "webtest";
    }


    /**
     * 用户注册
     *
     * @param account
     * @return
     */
    @PostMapping("/add")
    public String add(@RequestBody Account account) {
        boolean save = accountServicee.save(account);
        return "ok";
    }

    /**
     * 登录
     *
     * @param account
     * @return
     */
    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestBody Account account) {
        QueryWrapper<Account> wrapper = new QueryWrapper<>();
        wrapper.eq("Account::getAccountNumber", account.getAccountNumber());
        wrapper.or();
        wrapper.eq("Account::getAccountPassword", account.getAccountPassword());
        Account user = accountServicee.getOne(wrapper);
        if (Objects.nonNull(user)) {
            return "ok";
        }
        throw new RuntimeException("用户名密码错误");
    }
}

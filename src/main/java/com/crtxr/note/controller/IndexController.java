package com.crtxr.note.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    /**
     * 静态页面的return默认是跳转到/static/index.html，
     * 当在pom.xml中引入了thymeleaf组件，动态跳转会覆盖默认的静态跳转，
     * 默认就会跳转到/templates/index.html，注意看两者return代码也有区别，
     * 动态有或没有html后缀都可以
     * <p>
     * 如果在使用动态页面时还想跳转到/static/index.html，
     * 可以使用重定向return "redirect:/index.html"。
     *
     * @return
     */
    @GetMapping("/")
    public String toLogin() {
        return "redirect:register.html";
    }
}

package com.crtxr.note;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.crtxr.note.NoteApplication;
import com.crtxr.note.entity.Account;
import com.crtxr.note.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试webFlux properties = "spring.main.web-application-type=reactive"
 * <p>
 * 单元测试：
 */
@SpringBootTest(classes = NoteApplication.class, properties = "spring.main.web-application-type=reactive")
@RunWith(SpringRunner.class)
public class DyTest {

    @Autowired
    private AccountService service;

    @Test
    public void dytest() throws Exception {
        IPage<Account> page = service.page(new Page<>(1, 4));
        page.getRecords().stream().forEach(s -> {
            System.out.println(s);
        });
    }
}

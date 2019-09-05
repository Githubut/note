package com.crtxr.note;

import com.crtxr.note.NoteApplication;
import com.crtxr.note.entity.Account;
import com.crtxr.note.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 启动一个完整运行的服务器，我们建议您使用随机端口
 */
@SpringBootTest(classes = NoteApplication.class,
        properties = "spring.main.web-application-type=reactive"
)
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class SpyBeanTest {


    /**
     * @SpyBean 包裹着真正的 Bean 装配到了 容器 中，并对特定的行为作出反应。
     */
    @SpyBean
    private AccountService accountService;


    @Test
    public void exampleTest() {

        Account account = new Account(1, "test");
        boolean save = accountService.save(account);
        assertThat(save).isEqualTo(true);

    }


}

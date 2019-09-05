package com.crtxr.note;

import com.crtxr.note.NoteApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

/**
 * 只关注Web层而不是启动完整的ApplicationContext，请考虑使用@WebMvcTest。
 */
@SpringBootTest(classes = NoteApplication.class, properties = "spring.main.web-application-type=reactive")
@RunWith(SpringRunner.class)
@AutoConfigureWebTestClient
public class WbTest {

    /**
     * Web-Flux专用
     */
    @Autowired
    private WebTestClient webClient;


    @Test
    public void wbtest() throws Exception {
        this.webClient.get().uri("/account/webtest").exchange().expectStatus().isOk().expectBody(String.class)
                .isEqualTo("webtest");

    }

}

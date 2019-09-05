package com.crtxr.note;

import com.crtxr.note.NoteApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 启动一个完整运行的服务器，我们建议您使用随机端口
 */
@SpringBootTest(classes = NoteApplication.class,
        properties = "spring.main.web-application-type=reactive",
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@AutoConfigureWebTestClient
public class WbTest2 {

    /**
     * Web-Flux专用
     */
    @Autowired
    private WebTestClient webClient;

    /**
     * web、webflux通用
     */
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void exampleTest() {
        String body = this.restTemplate.getForObject("/account/webtest", String.class);
        assertThat(body).isEqualTo("Hello World");

    }


    @Test
    public void wbtest() throws Exception {
        this.webClient.get().uri("/account/webtest").exchange().expectStatus().isOk().expectBody(String.class)
                .isEqualTo("webtest2");

    }

}

package com.crtxr.note;

import com.crtxr.note.NoteApplication;
import com.crtxr.note.entity.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @JsonTest 不要使用@SpringTest注解
 */
@RunWith(SpringRunner.class)
@JsonTest
public class MyJsonTest {
    @Autowired
    private JacksonTester<Account> jacksonTester;

    @Test
    public void testSerialize() throws Exception {
        Account details = new Account(1, "jsonTest");
        // Assert against a `.json` file in the same package as the test
        // assertThat(this.jacksonTester.write(details)).isEqualToJson("expected.json");
        // Or use JSON path based assertions
        assertThat(this.jacksonTester.write(details)).hasJsonPathStringValue("@.accountId", "1");
        assertThat(this.jacksonTester.write(details)).extractingJsonPathStringValue("@.accountId")
                .isEqualTo("Honda");
    }

    @Test
    public void testDeserialize() throws Exception {
        String content = "{\"accountId\":1,\"accountName\":\"jsonTest\"}";
        assertThat(this.jacksonTester.parse(content))
                .isEqualTo(new Account(1, "jsonTest"));
        assertThat(this.jacksonTester.parseObject(content).getAccountName()).isEqualTo("jsonTest");
    }
}

package com.gd.emaildemo;

import com.gd.emaildemo.Service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmaildemoApplicationTests {
    @Autowired
    private MailService mailService;

    @Test
    public void contextLoads() {
        mailService.sendSimpleMaile("2247589910@qq.com","NTM","test");
    }

}


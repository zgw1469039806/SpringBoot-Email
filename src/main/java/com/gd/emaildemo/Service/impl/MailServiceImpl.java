package com.gd.emaildemo.Service.impl;

import com.gd.emaildemo.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * @DATA 2019-01-07 08:16
 * @Author zhangguowei  WeChat:17630376104
 * @Description TODO
 * SpringBoot邮件服务
 */
@Service
public class MailServiceImpl implements MailService {


    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${mail.fromMail.addr}")
    private String from;

    @Override
    public void sendSimpleMaile(String to, String subject, String content) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(from);
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(content);

        try {
            javaMailSender.send(simpleMailMessage);
            System.out.println("邮件发送成功");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("邮件发送失败");
        }
    }
}

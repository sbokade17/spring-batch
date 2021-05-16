package com.example.springbatch.batch;

import com.example.springbatch.data.LinkedinUsers;
import com.example.springbatch.utils.MailUtil;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LinkedinProcessor implements ItemProcessor<LinkedinUsers, LinkedinUsers> {


    @Autowired
    private MailUtil mailUtil;

    @Override
    public LinkedinUsers process(LinkedinUsers linkedinUsers) throws Exception {

        //Processing code
        //mailUtil.sendMail("sbokade17@gmail.com","bloggersbokade17@gmail.com","Test Mail","This is test mail.");
        return linkedinUsers;
    }
}

package com.example.springbatch.batch;

import com.example.springbatch.data.LinkedinUsers;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class LinkedinProcessor implements ItemProcessor<LinkedinUsers, LinkedinUsers> {
    @Override
    public LinkedinUsers process(LinkedinUsers linkedinUsers) throws Exception {

        //Processing code

        return linkedinUsers;
    }
}

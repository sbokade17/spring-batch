package com.example.springbatch.batch;

import com.example.springbatch.data.LinkedinUsers;
import com.example.springbatch.repository.LinkedinUsersRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LinkedinWriter implements ItemWriter<LinkedinUsers> {

    @Autowired
    private LinkedinUsersRepository linkedinUsersRepository;

    @Override
    public void write(List<? extends LinkedinUsers> list) throws Exception {
        System.out.println("Data for LinkedinUsers: "+ list);
        linkedinUsersRepository.saveAll(list);

    }
}

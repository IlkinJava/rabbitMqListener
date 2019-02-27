package com.example.demo.service;

import com.example.demo.model.TmpData;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class TmpService {

    @RabbitListener(queues = "TMP_Q")
    public void receiveMessage(TmpData data) {
        System.out.println(data.getData());
    }
}

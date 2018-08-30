package mq.rabbit.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import mq.rabbit.entity.User;

@Component
@RabbitListener(queues = "fanout.C")
public class FanoutReceiverC {

    @RabbitHandler
    public void process(User user) {
    	System.out.println("FanoutReceiverC消费者收到消息  : " + user.getId()+","+user.getUsername()+","+user.getPassword()+","+user.getType());
    }

}

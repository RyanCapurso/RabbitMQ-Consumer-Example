package br.com.rabbit.consumer.service.rabbitconsumerservice.rabbitmq.consumers;

import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class StringConsumer {
  @RabbitListener(queues = {"product.log"})
  public void consumer(String message){
    log.info("Mensagem Recebida" + message);
  }
}

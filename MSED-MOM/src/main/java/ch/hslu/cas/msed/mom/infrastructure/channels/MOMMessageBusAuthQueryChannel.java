package ch.hslu.cas.msed.mom.infrastructure.channels;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
@Configuration
@EnableIntegration
public class MOMMessageBusAuthQueryChannel
{
    @Bean(name = "ch.hslu.cas.msed.mom.authquerychannel")
    public MessageChannel AuthQueryChannel() {
        return new DirectChannel();
    }
}
package DubboDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Mr.Wang
 * @create: 2018-09-14
 **/
@Configuration
public class MyConfig {
    @Bean
    public Person person(){
        return new Person();
    }
}

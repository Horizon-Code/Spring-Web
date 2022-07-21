package vass.web.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource({
        "classpath:application2.properties"
})
public class TextosConfig {
}

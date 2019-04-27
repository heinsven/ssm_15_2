package ssm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"ssm.*"})
@EnableWebMvc
public class WebConfig {

    @Bean(name = "multipartResolver")
    public MultipartResolver initMultipartResolver() {
        return new StandardServletMultipartResolver();
    }

}

package config;

import controller.AddController;
import controller.AddFormController;
import controller.HelloController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Spring configuration for sample application.
 */
@Configuration
@ComponentScan({ "config" })
//@PropertySource("classpath:application.properties")
public class ApplicationConfig {

    @Bean
    public AddFormController addFormController() {
        return new AddFormController();
    }

    @Bean
    public AddController addController() {
        return new AddController();
    }

    @Bean
    public HelloController helloController() {
        return new HelloController();
    }

    /**
     * Required to inject properties using the 'Value' annotation.
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}

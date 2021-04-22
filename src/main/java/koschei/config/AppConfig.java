package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public Deth8 getDeth() {
        return new Deth8();
    }
}

package koschei.config;

import koschei.models.Island2;
import koschei.models.Rabbit4;
import koschei.models.Wood3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public static Wood3 getWood(Rabbit4 rabbit4) {
        return new Wood3(rabbit4);
    }
}

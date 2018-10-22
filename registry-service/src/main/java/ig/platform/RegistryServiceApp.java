package ig.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "service" })
public class RegistryServiceApp
{
    public static void main(String[] args) {
        SpringApplication.run(RegistryServiceApp.class, args);
    }
}


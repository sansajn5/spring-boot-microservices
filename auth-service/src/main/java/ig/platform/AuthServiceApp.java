package ig.platform;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "service" })
public class AuthServiceApp
{
    public static void main(String[] args) {
        SpringApplication.run(AuthServiceApp.class, args);
    }
}

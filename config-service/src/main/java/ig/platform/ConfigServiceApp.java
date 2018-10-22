package ig.platform;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ConfigServiceApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigServiceApp.class).run(args);
    }

}

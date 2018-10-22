package ig.platform;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableEurekaClient
@SpringBootApplication
@EnableZuulProxy
public class GatewayServiceApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(GatewayServiceApp.class).run(args);
    }

}

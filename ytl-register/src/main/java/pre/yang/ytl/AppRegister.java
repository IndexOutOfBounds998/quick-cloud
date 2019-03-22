package pre.yang.ytl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * Hello world!
 */

@SpringBootApplication
@EnableEurekaServer
public class AppRegister {
    public static void main(String[] args) {
        SpringApplication.run(AppRegister.class, args);
    }

}
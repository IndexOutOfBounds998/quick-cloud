package pre.yang.ytl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class AppUserService {
    public static void main(String[] args) {
        SpringApplication.run(AppUserService.class, args);
    }

}
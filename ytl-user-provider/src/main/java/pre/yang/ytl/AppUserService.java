package pre.yang.ytl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Hello world!
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class AppUserService {
    public static void main(String[] args) {
        SpringApplication.run(AppUserService.class, args);
    }

}
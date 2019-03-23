package pre.yang.ytl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hello world!
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrixDashboard
public class AppDashboard {
    public static void main(String[] args) {
        SpringApplication.run(AppDashboard.class, args);
    }

}
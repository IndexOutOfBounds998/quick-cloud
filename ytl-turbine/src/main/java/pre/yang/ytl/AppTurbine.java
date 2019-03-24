package pre.yang.ytl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Hello Turbine!
 *
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbine

public class AppTurbine {
    public static void main(String[] args) {
        SpringApplication.run(AppTurbine.class, args);
    }

}
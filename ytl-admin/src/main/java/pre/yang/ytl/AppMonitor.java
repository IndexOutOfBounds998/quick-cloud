package pre.yang.ytl;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class AppMonitor {
    public static void main(String[] args) {
        SpringApplication.run(AppMonitor.class, args);
    }

}
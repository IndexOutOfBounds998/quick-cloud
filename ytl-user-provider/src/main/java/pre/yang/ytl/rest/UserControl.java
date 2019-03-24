package pre.yang.ytl.rest;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pre.yang.ytl.service.UserService;

/**
 * Created by yang on 2019/3/22.
 */

@RestController
public class UserControl {

    @Autowired
    UserService userService;

    /**
     *
     * @return
     */
    @HystrixCommand(fallbackMethod = "sayFallBack")
    @GetMapping("/hello")
    public String say() {
        return userService.sayHello();
    }

    public String sayFallBack(){

        return "服务异常 服务进行熔断。。。。。";
    }
}

package pre.yang.ytl.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pre.yang.ytl.remote.UserService;

/**
 * Created by yang on 2019/3/22.
 */
@RestController
public class UserControl {

    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public String say() {
        return userService.hello();
    }
}

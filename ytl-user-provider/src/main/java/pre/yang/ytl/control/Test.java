package pre.yang.ytl.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yang on 2019/3/22.
 */
@RestController
public class Test {


    @GetMapping("/hello")
    public String say() {
        return "hello word";
    }
}

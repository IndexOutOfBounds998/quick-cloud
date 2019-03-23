package pre.yang.ytl.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by yang on 2019/3/24.
 */
@FeignClient(name = "provide-server")
public interface UserService {

    @GetMapping("/hello")
    String hello();


}

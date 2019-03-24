package pre.yang.ytl.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import pre.yang.ytl.remote.fallback.UserFallBackFactory;

/**
 * 向服务提供者发起请求 请求不成功 降级处理
 * Created by yang on 2019/3/24.
 */
@Component
@FeignClient(name = "provide-server",fallbackFactory =UserFallBackFactory.class)
public interface UserService {

    @GetMapping("/hello")
    String hello();


}

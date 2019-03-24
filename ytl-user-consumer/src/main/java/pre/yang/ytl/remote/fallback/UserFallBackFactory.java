package pre.yang.ytl.remote.fallback;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import pre.yang.ytl.remote.UserService;

/**
 * 统一做降级处理
 * Created by yang on 2019/3/24.
 */
@Component
public class UserFallBackFactory implements FallbackFactory<UserService> {
    @Override
    public UserService create(Throwable throwable) {
        return () -> "服务提供者断开,服务降级处理。。。。。。。";
    }
}

package pre.yang.ytl.service.impl;


import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Service;
import pre.yang.ytl.service.UserService;

import java.util.Random;

/**
 * Created by yang on 2019/3/24.
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello() {

        int rand= RandomUtils.nextInt(4);
        log.info("rand "+rand);
        if(rand>1){
            return "hello world!!!";
        }else {
            //模拟服务端服务异常
            throw  new RuntimeException("异常啦");
        }



    }
}

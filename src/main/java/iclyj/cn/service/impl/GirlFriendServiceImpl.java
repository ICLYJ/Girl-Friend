package iclyj.cn.service.impl;

import iclyj.cn.config.GirlFriendServiceProperties;
import iclyj.cn.service.GirlFriendService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ：lyj
 * @email: : iclyj@iclyj.cn
 * @date ：2019/10/8
 *
 * GirlFriendServiceImpl 实现了 GirlFriendService 接口的 say() 方法，
 * 它会获取 GirlFriendServiceProperties 配置类 message 内容，并打印到控制台。
 *
 */
public class GirlFriendServiceImpl implements GirlFriendService {

    @Autowired
    private GirlFriendServiceProperties girlFriendServiceProperties;

    @Override
    public void say() {
        String message = girlFriendServiceProperties.getMessage();
        System.out.println("Girl Friend: " + message);
    }
}

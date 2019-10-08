package iclyj.cn.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ：lyj
 * @email: : iclyj@iclyj.cn
 * @date ：2019/10/8
 *
 * @ConfigurationProperties注解能够自动获取 application.properties 配置文件中前缀为
 * spring.girlfriend 节点下 message属性的内容，这里我们给了它一个默认值: Hello World !。
 *
 */
@ConfigurationProperties(prefix = "iclyj.girlfriend")
public class GirlFriendServiceProperties {

    /** 默认输出 */
    private String message = "Hello World !";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

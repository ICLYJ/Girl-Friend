package iclyj.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Spring 官方对 starter 的命名是有规范的，
 * 只有官方提供的 starter, 才能命名为 spring-boot-starter-{name},
 * 比如 spring-boot-starter-web; 而对于非官方的，需以 {name}-spring-boot-starter 的格式命名。
 */

@SpringBootApplication
public class GirlFriendSpringBootStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(GirlFriendSpringBootStarterApplication.class, args);
    }

}

package com.wyf;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @Auther: yswzw
 * @Date: 2019/11/21 14:39
 * @Description:
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(App.class).run(args);
    }
}

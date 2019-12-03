package cn.phlos.ph_portiem_test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="cn.phlos.ph_portiem_test.mapper")
public class PhPortiemTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhPortiemTestApplication.class, args);
    }

}

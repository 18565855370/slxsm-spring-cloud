package com.slxsm.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello Eureka
 * @author slxsm
 * @date 2019-04-20
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}

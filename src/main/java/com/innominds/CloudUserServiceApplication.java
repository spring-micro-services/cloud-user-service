package com.innominds;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class CloudUserServiceApplication implements CommandLineRunner {

    @Value( "${database.name}" )
    private String name;

    @Value( "${database.url}" )
    private String url;

    public static void main( String[] args ) {
        final SpringApplication application = new SpringApplication( CloudUserServiceApplication.class );
        application.run( args );
    }

    @Override
    public void run( String... args ) throws Exception {

        // while ( true ) {
        System.err.println( "Database name  = " + name );
        System.err.println( "Database URL  = " + url );
        // TimeUnit.MILLISECONDS.sleep( 10 );
        // }
    }
}

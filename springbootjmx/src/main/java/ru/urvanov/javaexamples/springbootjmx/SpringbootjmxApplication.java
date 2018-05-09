package ru.urvanov.javaexamples.springbootjmx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootjmxApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(SpringbootjmxApplication.class, args);
        // Run forever.
        Thread.sleep(Long.MAX_VALUE);
    }
}

package net.javaguides.springbootbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        try {
            SpringApplication.run(SpringbootBackendApplication.class, args);
        } catch (Exception e) {

            System.out.println("Caught an exception: " + e.getMessage());
        }
        }
    @Override
    public void run(String... args) throws Exception {
//        throw new Exception("An error occurred during application initialization.");

    }
}

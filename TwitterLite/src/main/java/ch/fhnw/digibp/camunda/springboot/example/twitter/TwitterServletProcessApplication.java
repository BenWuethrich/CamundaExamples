package ch.fhnw.digibp.camunda.springboot.example.twitter;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableProcessApplication
public class TwitterServletProcessApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(TwitterServletProcessApplication.class, args);
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(TwitterServletProcessApplication.class);
  }
}

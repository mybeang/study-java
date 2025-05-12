package mybeang.home01.mybeang_home01_spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybeangHome01SpringApplication {
	private static final Logger logger = LoggerFactory.getLogger(MybeangHome01SpringApplication.class);
	public static void main(String[] args) {
		logger.info("Custem Log: Start WebServer ~ !!!");
		SpringApplication.run(MybeangHome01SpringApplication.class, args);
	}

}

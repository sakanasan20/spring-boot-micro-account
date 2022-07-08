package tw.niq.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootMicroAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroAccountApplication.class, args);
	}

}

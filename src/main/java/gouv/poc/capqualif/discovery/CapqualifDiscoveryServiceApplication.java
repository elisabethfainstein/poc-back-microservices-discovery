package gouv.poc.capqualif.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CapqualifDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapqualifDiscoveryServiceApplication.class, args);
	}

}

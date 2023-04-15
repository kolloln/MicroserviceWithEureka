package StockServiceEureka2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StockServiceEureka2Application {

	public static void main(String[] args) {
		SpringApplication.run(StockServiceEureka2Application.class, args);
	}

}

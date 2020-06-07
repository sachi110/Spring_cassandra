package com.techm.springcasendra;

import com.techm.springcasendra.domain.Product;
import com.techm.springcasendra.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.UUID;


@SpringBootApplication

public class SpringcasendraApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcasendraApplication.class, args);
	}

@Autowired
	private ProductService productService;
	@PostConstruct
	public void saveData()
	{
		Product p=new Product();
		ArrayList<Product> pr=new ArrayList<>();
		productService.saveOrUpdate((new Product(UUID.randomUUID(),"this is a good",125,"sachi")));
		productService.saveOrUpdate((new Product(UUID.randomUUID(),"this is a good2",125,"sachi")));
		productService.saveOrUpdate((new Product(UUID.randomUUID(),"this is a good3",125,"abd")));


	}

}

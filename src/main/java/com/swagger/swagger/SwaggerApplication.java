package com.swagger.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*
	https://www.youtube.com/watch?v=gduKpLW_vdY
	8:01
	Terminé le 7/2/2023 Ok tout fonctionne
	Attention bien prendre java 11 (et pas 17) et spring boot 2.1.6.RELEASE
 */
@SpringBootApplication
@EnableSwagger2
public class SwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}

}

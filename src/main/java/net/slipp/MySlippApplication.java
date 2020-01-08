package net.slipp;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableJpaAuditing
@EnableSwagger2
public class MySlippApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySlippApplication.class, args);
	}
	
	@Bean
	public Docket newsAPi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("my-slipp")
				.apiInfo(apiInfo())
				.select()
				.paths(PathSelectors.ant("/api/**"))
				.build();
	}
	
	public ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Spring REST Sample with Swagger")
				.description("Spring REST Sample with Swagger")
				.termsOfServiceUrl("http://www-03.ibm.com")
				.contact("Niklas Heidoff")
				.license("Apache License Version")
				.licenseUrl("github.com")
				.version("2.0")
				.build();
	}
	

}

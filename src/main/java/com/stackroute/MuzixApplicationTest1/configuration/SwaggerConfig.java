package com.stackroute.MuzixApplicationTest1.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@Configuration

public class SwaggerConfig extends WebMvcConfigurationSupport {}
       /* @Bean{
   @Bean
    public Docket apiDocket() {
       return new Docket(DocumentationType.SWAGGER_2)
                .select()
              .apis(RequestHandlerSelectors.basePackage("com.stackroute.MuzixApplicationTest1"))
                .paths(regex("/api/v1.*"))
                .build()
                .apiInfo(metaInfo());

 }
    private ApiInfo metaInfo() {

       ApiInfo apiInfo;

        apiInfo = new ApiInfo(

               "Spring Boot Swagger",

            "Swagger Documentation For Muzix application",

            "2.0",

                "Terms of service",

                new Contact("Muzix", "https://github.com/neelimamadhuri13", "madhuneelima1@gmail.com"),

                "Apache version 2.0",

               "https://www.apache.org/licensen.html"



        );

        return apiInfo;
  }


}
*/
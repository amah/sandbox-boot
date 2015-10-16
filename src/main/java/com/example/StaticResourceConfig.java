package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class StaticResourceConfig extends WebMvcConfigurerAdapter {
	@Value("${static.resource.path}")
	private String staticResourcePath;
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/test/**").addResourceLocations(staticResourcePath);
	}
}

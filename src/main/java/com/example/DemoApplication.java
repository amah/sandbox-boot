package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ResourceLoader;
import org.tuckey.web.filters.urlrewrite.UrlRewriteFilter;

@SpringBootApplication
public class DemoApplication {
	@Autowired
    private ResourceLoader resourceLoader;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    
    
    @Bean
    public FilterRegistrationBean filterRegistrationBean()
    {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();

        registrationBean.setFilter(new UrlRewriteFilter());
        registrationBean.addUrlPatterns("*");
        registrationBean.addInitParameter("modRewriteConfText", "RewriteRule ^/dashboard-services/?(.*) /$1 [R]");

        return registrationBean;
    }
}

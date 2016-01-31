/*package com.interview.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.interview"})
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class CoreConfiguration extends WebMvcConfigurerAdapter {


	//=================================================
	//    Instance variables
	//=================================================

	//=================================================
	//    Beans
	//=================================================

	// With @Configuration which internally uses annotations like @Autowired, @Value, and @PostConstruct, any BeanFactoryPostProcessor beans have to be declared with a static modifier. 
	// Otherwise the containing @Configuration class is instantiated very early and the BeanPostProcessors responsible for resolving annotations like @Value, @Autowired etc, cannot act on it
	
}*/
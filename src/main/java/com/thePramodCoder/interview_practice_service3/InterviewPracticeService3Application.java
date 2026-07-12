package com.thePramodCoder.interview_practice_service3;

// import com.thePramodCoder.interview_practice_service3.SpringBootApplication.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.webmvc.autoconfigure.DispatcherServletAutoConfiguration;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.View;
// import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

//@SpringBootConfiguration
//@ComponentScan(basePackages = "Controller" )
//@EnableAutoConfiguration(exclude = DispatcherServletAutoConfiguration.class)

@SpringBootApplication
 public  class InterviewPracticeService3Application {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPracticeService3Application.class, args);
	}

	           // Lecture 3 Controller vs REST Controller
//    @Bean("JsonViewTemplate")
//	public View name(){
//		return new MappingJackson2JsonView();
//	}


	                    // Lecture 6 @SpringBootApplication
//	@Bean
//	public Employee createEmployee(){
//		return new Employee();
//	}

}

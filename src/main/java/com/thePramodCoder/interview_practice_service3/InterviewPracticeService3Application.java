package com.thePramodCoder.interview_practice_service3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;


@SpringBootApplication
 public  class InterviewPracticeService3Application {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPracticeService3Application.class, args);
	}

//    @Bean("JsonViewTemplate")
//	public View name(){
//		return new MappingJackson2JsonView();
//	}
}

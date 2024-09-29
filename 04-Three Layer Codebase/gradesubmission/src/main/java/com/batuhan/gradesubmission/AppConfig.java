package com.batuhan.gradesubmission;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("app-config.xml")
public class AppConfig {
    /* 
    @Bean
    public GradeRepository gradeRepository() {
        return new GradeRepository();
    }
    */
}
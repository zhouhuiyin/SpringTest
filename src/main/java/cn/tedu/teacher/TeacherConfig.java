package cn.tedu.teacher;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TeacherConfig {
    @Bean
    public Teacher tech(){
        Teacher t = new Teacher();
        t.setId(1);
        t.setJob("物理");
        t.setName("王老师");
        return t;
    }
}

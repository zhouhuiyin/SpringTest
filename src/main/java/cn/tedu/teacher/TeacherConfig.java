package cn.tedu.teacher;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class TeacherConfig {
    @Bean
    @Scope("prototype")
    public Teacher tech(){
        Teacher t = new Teacher();
        t.setId(1);
        t.setJob("物理");
        t.setName("王老师");
        return t;
    }
}

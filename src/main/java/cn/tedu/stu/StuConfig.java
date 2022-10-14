package cn.tedu.stu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//@Configuration 注解的含义是表示当前类是配置Spring框架信息的
//加了这个注解的类可以向Spring容器保存信息
@Configuration
public class StuConfig {


    //@Bean 注解下面要编写一个方法，这个方法的返回值会保存到spring容器中
    //保存的对象有id或name来唯一标识，方法名就是这个对象的name或者id
    @Bean
    public Stu stu(){
        //实例化一个stu并返回到容器中
        Stu s = new Stu();
        s.setId(1);
        s.setName("猪八戒");
        s.setGender("男");
        return s;
    }

}

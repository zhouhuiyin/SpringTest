package cn.tedu.techer;

import cn.tedu.teacher.Teacher;
import cn.tedu.teacher.TeacherConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TeacherTest {
    AnnotationConfigApplicationContext acac;
    @Before
    public void init(){
        acac = new AnnotationConfigApplicationContext(TeacherConfig.class);
    }
    @After
    public void destroy(){
        acac.close();
    }
    @Test
    public void tech(){
        Teacher t1 = acac.getBean("tech",Teacher.class);
        System.out.println(t1);
    }
}

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

    // 原型作用域测试
    @Test
    public void prototype(){
        // 从Spring容器中获得tea,每次获得都是一个新的对象
        Teacher t1=acac.getBean("tech",Teacher.class);
        Teacher t2=acac.getBean("tech",Teacher.class);
        t1.setName("范范");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1==t2);
    }
}

package cn.tedu.cat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CatTest {
    AnnotationConfigApplicationContext acac;
    @Before
    public void init(){
        acac = new AnnotationConfigApplicationContext(CatConfig.class);
        System.out.println("init初始化完毕");
    }

    @After
    public void destroy(){
        acac.close();
    }

    @Test
    public void cat(){
        Cat cat = acac.getBean("hehe",Cat.class);
        System.out.println(cat);
    }
}

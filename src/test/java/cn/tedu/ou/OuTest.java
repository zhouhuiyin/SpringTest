package cn.tedu.ou;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OuTest {
    AnnotationConfigApplicationContext acac;
    @Before
    public void init(){
        acac = new AnnotationConfigApplicationContext(OuConfig.class);
    }

    @After
    public void destroy(){
        acac.close();
    }

    @Test
    public void ou(){
        GuanYu guanYu=acac.getBean("guanYu",GuanYu.class);
        guanYu.fight();
    }
}

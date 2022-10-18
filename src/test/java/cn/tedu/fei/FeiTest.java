package cn.tedu.fei;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FeiTest {
    private AnnotationConfigApplicationContext acac;
    @Before
    public void init(){
        acac = new AnnotationConfigApplicationContext(FeiConfig.class);
    }
    @After
    public void destroy(){
        acac.close();
    }

    @Test
    public void fei(){
        ZhangFei zf = acac.getBean("fei",ZhangFei.class);
        zf.fight();
    }

}

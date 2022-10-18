package cn.tedu.liang;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ZhuTest {
    private AnnotationConfigApplicationContext acac;
    @Before
    public void init(){
        acac = new AnnotationConfigApplicationContext(LiangConfig.class);
    }
    @After
    public void destroy(){
        acac.close();
    }

    @Test
    public void fei(){
        ZhuGeLiang zf = acac.getBean("liang",ZhuGeLiang.class);
        zf.fight();
    }
}

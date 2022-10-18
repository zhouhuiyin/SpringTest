package cn.tedu.guan;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GuanTest {
    AnnotationConfigApplicationContext acac;
    @Before
    public void init(){
        acac = new AnnotationConfigApplicationContext(GuanConfig.class);
    }

    @After
    public void destroy(){
        acac.close();
    }
    @Test
    public void guan(){
//        DragonBlade dragonBlade = acac.getBean("dragonBlade",DragonBlade.class);
        GuanYu guanYu = acac.getBean("guanYu",GuanYu.class);
//        guanYu.setDragonBlade(dragonBlade);
        guanYu.fight();
    }
}

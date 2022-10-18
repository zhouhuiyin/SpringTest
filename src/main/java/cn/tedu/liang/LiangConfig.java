package cn.tedu.liang;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LiangConfig {
    @Bean
    public FeatherFan lance1(){
        return new FeatherFan();
    }

    @Bean
    public FeatherFan lance2(){
        return new FeatherFan();
    }

    @Bean
    public ZhuGeLiang liang(FeatherFan lance1){
        ZhuGeLiang zhu = new ZhuGeLiang();
        zhu.setFeatherFan(lance1);
        return zhu;
    }
}

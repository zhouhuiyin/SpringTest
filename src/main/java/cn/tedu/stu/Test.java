package cn.tedu.stu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        //初始化Spring容器对象
        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(StuConfig.class);
        //acac对象实例化时需要传入配置类的反射做参数，这样对象实例化时就可以按照配置类中的代码将对象保存到spring容器中了
        //从spring容器中获取对象
        Stu ss = acac.getBean("stu",Stu.class);
        System.out.println(ss);
        acac.close();
    }
}

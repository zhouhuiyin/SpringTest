package cn.tedu.cat;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//一个类上面添加@Component注解，表示当前类会自动化对象保存到spring中
@Component("hehe")
//@Scope("prototype")
@Lazy
public class Cat {

    public Cat(){
        // 无参构造方法输出字符串
        System.out.println("Cat类被实例化了");
    }
    private String name="咪咪";
    private String color="蓝色";
    private Integer age=4;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}

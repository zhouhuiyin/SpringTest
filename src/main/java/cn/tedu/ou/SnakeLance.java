package cn.tedu.ou;

import org.springframework.stereotype.Component;

@Component
public class SnakeLance implements Weapon{
    private String name="δΈε«θη";

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

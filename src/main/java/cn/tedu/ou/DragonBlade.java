package cn.tedu.ou;

import org.springframework.stereotype.Component;

@Component
public class DragonBlade implements Weapon{
    private String name="青龙偃月刀";

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

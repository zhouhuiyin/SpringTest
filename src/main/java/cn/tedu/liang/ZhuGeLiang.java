package cn.tedu.liang;

public class ZhuGeLiang {
    private String name = "孔明";
    private FeatherFan featherFan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FeatherFan getFeatherFan() {
        return featherFan;
    }

    public void setFeatherFan(FeatherFan featherFan) {
        this.featherFan = featherFan;
    }

    public void fight(){
        System.out.println(name+"使用"+featherFan+"战斗");
    }
}

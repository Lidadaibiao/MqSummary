package letcode;

import java.util.Objects;

/**
 * @author dadaibiaoLi
 * @Desc
 * @Date 2021/10/16 16:48
 */
public class Car {
    private String name;
    private Integer num;
    private String color;

    public Car(String name, Integer num, String color) {
        this.name = name;
        this.num = num;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "MyCar{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car myCar = (Car) o;
        return Objects.equals(name, myCar.name) &&
                Objects.equals(num, myCar.num) &&
                Objects.equals(color, myCar.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, num, color);
    }


    public void drive(String a){
        System.out.println("引擎工作齿轮转动轮胎转动");
        switch(a){
            case "go ahead" :
                System.out.println("自动挡汽车："+a);
                break;
            case "turn left" :
                System.out.println("自动挡汽车："+a);
                break;
            default :
                System.out.println("参数错误，请检查参数！");
        }
    }
    public void drive(String a,int b){
        System.out.println("引擎工作齿轮转动轮胎转动");
        switch(a){
            case "go ahead" :
                System.out.println("手动动挡汽车：加速"+a+" "+b+"挡");
                break;
            case "turn left" :
                System.out.println("手动动挡汽车：加速"+a+" "+b+"挡");
                break;
            case "break" :
                System.out.println("手动动挡汽车：减速"+a+" "+b+"挡");
                break;
            default :
                System.out.println("参数错误，请检查参数！");
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car("BWM",6666,"Blue");
        System.out.println(myCar.getNum());
        System.out.println(myCar.getColor());
        myCar.drive("go ahead");
        myCar.drive("turn left");
        myCar.drive("go ahead",2);
        myCar.drive("turn left",5);
        myCar.drive("break",0);
    }
}

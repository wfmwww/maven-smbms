package test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data//lombok必须的注解
@AllArgsConstructor//有参构造方法
@NoArgsConstructor//无参构造方法
@ToString(exclude = "name")//去掉某个属性
public class Lombok {
    private String name;
    private String pass;

    public static void main(String[] args) {
        Lombok lm = new Lombok("www", "122");
        System.out.println(lm.getName());
    }
}

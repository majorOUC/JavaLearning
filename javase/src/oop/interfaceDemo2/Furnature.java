package oop.interfaceDemo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//家电的父类，实现多态
public class Furnature implements Operator{
    private String name;
    private Status status;

    //应该实现一个控制家电开和关的方法
    @Override
    public void operate(Furnature f) {
        if(f.status == Status.ON)
            f.status = Status.OFF;
        else
            f.status = Status.ON;
    }


}

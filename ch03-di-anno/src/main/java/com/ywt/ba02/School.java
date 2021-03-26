package com.ywt.ba02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/11/26 16:53
 */
@Component("mySchool")
public class School {
    @Value("西安邮电大学")
    private String name;
    @Value("西安市长安区子午大道")
    private String adress;

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}

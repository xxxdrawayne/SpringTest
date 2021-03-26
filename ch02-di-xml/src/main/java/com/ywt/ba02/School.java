package com.ywt.ba02;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/11/26 16:53
 */
public class School {
    private String name;
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

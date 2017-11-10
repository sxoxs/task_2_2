package com.company;

/**
 * Created by Денис on 09/11/17.
 */
public class Tiger {
    private String name;
    private int age;
    private String busy;

    public Tiger (String name, int age) {
        this.name = name;
        this.age = age;
        this.busy = "miss";
    }

    public Tiger () {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        this.busy = "eat";
    }

    public void miss(){
        this.busy = "miss";
    }

    public void drink(){
        this.busy = "drink";
    }

    public void sleep(){
        this.busy = "sleep";
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Тигр ");
        sb.append("с кличкой ").append(name);
        sb.append(" возрастом ").append(age);
        sb.append(" сейчас ");
        switch (busy) {
            case ("eat"): {
                sb.append("ест");
                break;
            }
            case ("miss"): {
                sb.append("скучает");
                break;
            }
            case ("drink"): {
                sb.append("пьет");
                break;
            }
            case ("sleep"): {
                sb.append("спит");
                break;
            }
        }

        return sb.toString();
    }
}



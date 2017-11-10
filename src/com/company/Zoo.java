package com.company;

/**
 * Created by Денис on 09/11/17.
 */
public class Zoo {
    private Tiger tiger;
    private Lion lion;
    private Giraffe giraffe;

    public Tiger getTiger() {
        return tiger;
    }

    public void setTiger(Tiger tiger) {
        this.tiger = tiger;
    }

    public Lion getLion() {
        return lion;
    }

    public void setLion(Lion lion) {
        this.lion = lion;
    }

    public Giraffe getGiraffe() {
        return giraffe;
    }

    public void setGiraffe(Giraffe giraffe) {
        this.giraffe = giraffe;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Zoo: \n");
        sb.append(tiger.toString()).append("\n");
        sb.append(lion.toString()).append("\n");
        sb.append(giraffe.toString()).append("\n");

        return sb.toString();
    }
}

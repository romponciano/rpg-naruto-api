package ponciano.rom.rpgnarutoapi.domain.model;

public class Missions {
    private Integer sPlus;
    private Integer s;
    private Integer a;
    private Integer b;
    private Integer c;
    private Integer d;

    public Missions(Integer sPlus, Integer s, Integer a, Integer b, Integer c, Integer d) {
        this.sPlus = sPlus;
        this.s = s;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Missions() {
    }

    public Integer getsPlus() {
        return sPlus;
    }

    public void setsPlus(Integer sPlus) {
        this.sPlus = sPlus;
    }

    public Integer getS() {
        return s;
    }

    public void setS(Integer s) {
        this.s = s;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    public Integer getD() {
        return d;
    }

    public void setD(Integer d) {
        this.d = d;
    }
}

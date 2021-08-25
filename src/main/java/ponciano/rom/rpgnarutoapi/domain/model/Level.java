package ponciano.rom.rpgnarutoapi.domain.model;

public class Level {
    private Integer value;
    private String unity;

    public Level(Integer value, String unity) {
        this.value = value;
        this.unity = unity;
    }

    public Level() {}

    public Level(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getUnity() {
        return unity;
    }

    public void setUnity(String unity) {
        this.unity = unity;
    }
}

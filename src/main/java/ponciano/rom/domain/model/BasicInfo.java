package ponciano.rom.domain.model;

public class BasicInfo {
    private String name;
    private String clan;
    private String village;
    private Level level;
    private String nivel;

    public BasicInfo(String name, String clan, String village, Level level, String nivel) {
        this.name = name;
        this.clan = clan;
        this.village = village;
        this.level = level;
        this.nivel = nivel;
    }

    public BasicInfo() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}

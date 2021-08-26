package ponciano.rom.domain.model;

import ponciano.rom.domain.entity.Characteristic;

import java.util.List;

public class Token {
    private BasicInfo basic;
    private Integer life;
    private Integer chakra;
    private Attributes attributes;
    private Skills skills;
    private Elements elements;
    private List<Characteristic> advantages;
    private List<Characteristic> disadvantages;
    private Missions missions;

    public Token(BasicInfo basic, Integer life, Integer chakra, Attributes attributes, Skills skills, Elements elements, List<Characteristic> advantages, List<Characteristic> disadvantages, Missions missions) {
        this.basic = basic;
        this.life = life;
        this.chakra = chakra;
        this.attributes = attributes;
        this.skills = skills;
        this.elements = elements;
        this.advantages = advantages;
        this.disadvantages = disadvantages;
        this.missions = missions;
    }

    public Token() {
    }

    public BasicInfo getBasic() {
        return basic;
    }

    public void setBasic(BasicInfo basic) {
        this.basic = basic;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public Integer getChakra() {
        return chakra;
    }

    public void setChakra(Integer chakra) {
        this.chakra = chakra;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public Elements getElements() {
        return elements;
    }

    public void setElements(Elements elements) {
        this.elements = elements;
    }

    public List<Characteristic> getAdvantages() {
        return advantages;
    }

    public void setAdvantages(List<Characteristic> advantages) {
        this.advantages = advantages;
    }

    public List<Characteristic> getDisadvantages() {
        return disadvantages;
    }

    public void setDisadvantages(List<Characteristic> disadvantages) {
        this.disadvantages = disadvantages;
    }

    public Missions getMissions() {
        return missions;
    }

    public void setMissions(Missions missions) {
        this.missions = missions;
    }
}

package ponciano.rom.domain.dto;

import ponciano.rom.domain.model.Token;

public class TokenResponse extends Token {
    private Integer attack;
    private Integer defense;
    private Integer alert;
    private Integer intimidation;
    private Integer leadership;
    private Integer manipulability;
    private Integer furtivity;
    private Integer dodge;
    private Integer observation;
    private Integer chackraControl;

    public TokenResponse() {
        super();
    }

    public Integer getAttack() {
        return getAttributes().getStrenght()*3;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return getAttributes().getResistence()*3;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getAlert() {
        return getBasic().getLevel().getValue();
    }

    public void setAlert(Integer alert) {
        this.alert = alert;
    }

    public Integer getIntimidation() {
        return getBasic().getLevel().getValue() + getAttributes().getSpirit();
    }

    public void setIntimidation(Integer intimidation) {
        this.intimidation = intimidation;
    }

    public Integer getLeadership() {
        return getAttributes().getCarism();
    }

    public void setLeadership(Integer leadership) {
        this.leadership = leadership;
    }

    public Integer getManipulability() {
        return getAttributes().getCarism();
    }

    public void setManipulability(Integer manipulability) {
        this.manipulability = manipulability;
    }

    public Integer getFurtivity() {
        return getBasic().getLevel().getValue() + getAttributes().getDexterity();
    }

    public void setFurtivity(Integer furtivity) {
        this.furtivity = furtivity;
    }

    public Integer getDodge() {
        return getBasic().getLevel().getValue() + getAttributes().getDexterity();
    }

    public void setDodge(Integer dodge) {
        this.dodge = dodge;
    }

    public Integer getObservation() {
        return getBasic().getLevel().getValue() + getAttributes().getIntelligence();
    }

    public void setObservation(Integer observation) {
        this.observation = observation;
    }

    public Integer getChackraControl() {
        return getBasic().getLevel().getValue() + getAttributes().getIntelligence()*5;
    }

    public void setChackraControl(Integer chackraControl) {
        this.chackraControl = chackraControl;
    }
}

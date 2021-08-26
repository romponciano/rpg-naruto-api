package ponciano.rom.domain.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Characteristic {
    @Id
    private String id;
    private String name;
    private String description;
    private Integer value;

    public Characteristic(String id, String name, String description, Integer value) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.value = value;
    }

    public Characteristic() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}

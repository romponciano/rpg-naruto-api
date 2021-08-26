package ponciano.rom.rpgnarutoapi.domain.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import ponciano.rom.rpgnarutoapi.domain.model.Token;

import java.util.List;

@Document
public class Player {
    @Id
    private String id;
    private List<Token> token;

    public Player(String id, List<Token> token) {
        this.id = id;
        this.token = token;
    }

    public Player() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Token> getToken() {
        return token;
    }

    public void setToken(List<Token> token) {
        this.token = token;
    }
}

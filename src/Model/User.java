package Model;

import java.io.Serializable;

public class User implements Serializable{
    
    private String id;
    private String name;
    private String dateBorn;

    public User(String id, String name, String dateBorn) {
        this.id = id;
        this.name = name;
        this.dateBorn = dateBorn;
    }

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

    public String getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(String dateBorn) {
        this.dateBorn = dateBorn;
    }
}

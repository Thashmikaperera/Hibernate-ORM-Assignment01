package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Author {
    @Id
    private String id;
    private String Name;

    public Author() {
    }

    public Author(String id, String name) {
        this.id = id;
        Name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
}

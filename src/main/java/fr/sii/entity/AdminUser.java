package fr.sii.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * CFP Admin user
 */
@Entity
@Table(name = "admins")
public class AdminUser {

    private int id;
    private String name;
    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @NotNull
    public String getEmail() {
        return email;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

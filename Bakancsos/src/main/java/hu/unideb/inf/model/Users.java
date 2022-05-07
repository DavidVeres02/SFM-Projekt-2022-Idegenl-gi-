package hu.unideb.inf.model;
import javax.persistence.*;

@Entity
public class Users {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String sname;
    @Column
    private String gname;
    @Column
    private String username;
    @Column
    private String password;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}

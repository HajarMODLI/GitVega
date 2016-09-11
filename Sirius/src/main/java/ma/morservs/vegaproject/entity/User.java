package ma.morservs.vegaproject.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ayoub on 19/08/2016.
 */

@Entity
public class User {



    @Id
    @GeneratedValue
    private Integer id;
    private String userName;
    private String password;



    @ManyToMany
    @JoinTable(name="USER_ROLE" ,
            joinColumns={
                    @JoinColumn(name="USER_ID" , nullable=false)
            } ,inverseJoinColumns={
            @JoinColumn(name="ROLE_ID" , nullable=false)}
    )
    private Set<Role> roles=new HashSet<Role>();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}

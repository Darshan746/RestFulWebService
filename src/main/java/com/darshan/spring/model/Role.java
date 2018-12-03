package com.darshan.spring.model;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int roleId;

    @Column(name = "role")
    private String role;
    public Role(){

    }
    public int getRoleId()
    {
        return  roleId;
    }
    public String getRole(){
        return role;
    }

    public void setRoleId(int roleId){
        this.roleId=roleId;
    }

    public void setRole(String role){
        this.role=role;
    }
}

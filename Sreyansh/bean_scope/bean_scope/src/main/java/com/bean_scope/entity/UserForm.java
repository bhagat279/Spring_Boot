package com.bean_scope.entity;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")  // ✅ har baar naya object
public class UserForm {
    private String name;
    private String email;

    public UserForm() {
        System.out.println("👉 New UserForm object created: " + this);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}


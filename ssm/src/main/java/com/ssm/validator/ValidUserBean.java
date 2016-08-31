package com.ssm.validator;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Component("ValidUserBean")
public class ValidUserBean {

    @NotEmpty
    @ID
    private String id;

    @NotEmpty(message="要输点东西")
    @Email(message="要输邮箱")
    private String name;

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
}
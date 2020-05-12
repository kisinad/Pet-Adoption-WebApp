package edu.miu.cs.cs427.blackpanther.model;

import java.util.Objects;

public class LoginBeanDTO {
    private String userName;
    private String password;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginBeanDTO loginBeanDTO = (LoginBeanDTO) o;
        return userName.equals(loginBeanDTO.userName) &&
                password.equals(loginBeanDTO.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, password);
    }
}
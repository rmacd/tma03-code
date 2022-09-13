package com.rmacd.ou.generated;

public abstract class Person {

    private String name;
    private String email;

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
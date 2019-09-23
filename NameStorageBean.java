/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javax.ejb.Singleton;

/**
 *Singleton session bean used to store the name parameter for "/helloWorld" resource
 * 
 * @author Adhi Baskoro
 */
@Singleton
public class NameStorageBean {
//name filed
    private String name = "World";

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}

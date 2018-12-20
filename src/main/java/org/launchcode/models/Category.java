package org.launchcode.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

//mapped to relational database
@Entity
public class Category {
    //fields along with jpa annotations
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String name;

    @OneToMany
    @JoinColumn(name ="category_id")
    private List<Cheese> cheeses =new ArrayList<>();


    /**Default constructor and it is used by Hibernate in the process of
     * creating objects from data retrieved from the
     * database table
     */
    public Category(){

    }
    //arg-constructor
    public Category(String name){
        this.name = name;
    }


   //Getters and Setters
   public int getId() {
       return id;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public List<Cheese> getCheeses() {
        return cheeses;
    }

}

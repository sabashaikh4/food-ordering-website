package com.MUSH_FOOD.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredientsItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private String name;


    @ManyToOne // many ingre have same category
    private IngredientsCategory category;


    @JsonIgnore
    @ManyToOne // one restau have multiple ingre
    private Restaurant restaurant ;

    private boolean inStoke = true;

}

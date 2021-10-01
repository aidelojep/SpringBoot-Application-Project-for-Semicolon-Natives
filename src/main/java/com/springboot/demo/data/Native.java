package com.springboot.demo.data;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
public class Native {
    private String name;
    @Id
    private String scv;
    private Gender gender;
    private String email;
    private LocalDate dateOfBirth;
    private String cohort;
    private static int scvGenerator;

    public Native(String name, String email, Gender gender, LocalDate dateOfBirth, String cohort){
        this.name=name;
        this.scv="SCV" + (++scvGenerator);
        this.gender=gender;
        this.email=email;
        this.dateOfBirth=dateOfBirth;
        this.cohort=cohort;

    }


}
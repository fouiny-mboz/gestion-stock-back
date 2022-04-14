package com.admir.gestionstockv2.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Embeddable
public class Adresse implements Serializable {

    @Column(name = "adrrese1")
    private String adresse1;

    @Column(name = "adrrese2")
    private String adresse2;

    @Column(name = "ville")
    private String ville;

    @Column(name = "codepostal")
    private String codePostal;

    @Column(name = "pays")
    private String pays;
}

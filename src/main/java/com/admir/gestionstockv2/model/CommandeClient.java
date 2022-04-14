package com.admir.gestionstockv2.model;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name ="commandeclient")
public class CommandeClient extends AbstractEntity{

    private String code;

    private Instant dateCommande;

    @ManyToOne
    @JoinColumn(name ="idclient")
    private Client client;

    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient> ligneCommandeClients;
}

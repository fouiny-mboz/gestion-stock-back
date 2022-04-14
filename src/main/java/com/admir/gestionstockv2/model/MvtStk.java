package com.admir.gestionstockv2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name ="mvtstk")
public class MvtStk extends AbstractEntity{
    @Column(name = "quantite")
    private BigDecimal quantite;

    @ManyToOne
    @JoinColumn(name = "article")
    private Article article;

    @Column(name = "datemvt")
    private Instant dateMvt;

    @Column(name = "typemvt")
    private TypeMvtStk typeMvt;
}

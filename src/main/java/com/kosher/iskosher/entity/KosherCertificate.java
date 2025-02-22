package com.kosher.iskosher.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "kosher_certificates")
public class KosherCertificate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @NotNull
    @Column(name = "certificate", nullable = false, unique = true, length = Integer.MAX_VALUE)
    private String certificate;

    @NotNull
    @Column(name = "expiration_date", nullable = false)
    private LocalDate expirationDate;

    @OneToMany(mappedBy = "certificate")
    private Set<CertificateBusiness> certificateVsBusinesses = new LinkedHashSet<>();

}
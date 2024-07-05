package com.namtv.auth.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "m_permission")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "permission", nullable = false)
    private String permission;

    @Column(name = "description", nullable = true)
    private String description;

}

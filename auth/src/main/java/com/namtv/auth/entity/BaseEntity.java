package com.namtv.auth.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Date;
@Data
@EqualsAndHashCode()
@MappedSuperclass
public class BaseEntity {
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", updatable = false, nullable = false)
    private Date createdAt;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", updatable = false, nullable = false)
    private Date updatedAt;

    @Column(name = "created_by", updatable = false, nullable = false)
    private Integer createdBy;
    @Column(name = "updated_by", updatable = false, nullable = false)
    private Integer updatedBy;
    @Column(name = "deleted_by", updatable = false, nullable = false)
    private Integer deletedBy;
}

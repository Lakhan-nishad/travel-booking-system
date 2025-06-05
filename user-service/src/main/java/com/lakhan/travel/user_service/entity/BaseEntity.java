package com.lakhan.travel.user_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * @author Lakhan Nishad
 */

@MappedSuperclass
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
    @Column(updatable = false)
    @CreatedDate
    private String createdAt;
    @Column(updatable = false)
    @CreatedBy
    private String createdBy;
    @LastModifiedDate
    @Column(insertable = false)
    private String updatedAt;
    @Column(insertable = false)
    @LastModifiedBy
    private String updatedBy;
}

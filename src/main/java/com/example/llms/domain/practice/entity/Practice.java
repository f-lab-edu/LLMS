package com.example.llms.domain.practice.entity;

import com.example.llms.global.jpa.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class Practice extends BaseEntity {
    private String username;
    @JsonIgnore
    private String password;
    private String email;
    private String refreshToken;
}

package com.example.llms.domain.member.entity;

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
public class Member extends BaseEntity {
    private String username;
    @JsonIgnore
    private String password;
    private String email;
    private String refreshToken;
}

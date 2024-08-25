package com.example.llms.domain.classGroup.entity;

import com.example.llms.global.jpa.BaseEntity;
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
public class ClassGroup extends BaseEntity {
    private String name;
}

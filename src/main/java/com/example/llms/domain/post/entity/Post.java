package com.example.llms.domain.post.entity;

import com.example.llms.domain.member.entity.Member;
import com.example.llms.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class Post extends BaseEntity {
    @ManyToOne
    private Member author;
    private String subject;
    private String content;
}
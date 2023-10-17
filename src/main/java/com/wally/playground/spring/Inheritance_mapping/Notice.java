package com.wally.playground.spring.Inheritance_mapping;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Table(name = "notice")
@Entity
@Data
@DiscriminatorValue("NOTICE")
public class Notice extends Board {

    @Column
    private int like;  // 좋아요

}

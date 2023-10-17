package com.wally.playground.spring.Inheritance_mapping;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "community")
@Entity
@DiscriminatorValue("NOTICE")
public class Community extends Board {
    // 사실상 Board와 동일한 역할을 하지만, Board와는 다른 테이블에 저장되어야 한다.
}

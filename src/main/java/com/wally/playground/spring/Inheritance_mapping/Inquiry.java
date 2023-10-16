package com.wally.playground.spring.Inheritance_mapping;

import jakarta.persistence.*;

@Table(name = "inquiry")
@Entity
@DiscriminatorValue("INQUIRY")
public class Inquiry extends Board {

    @Column
    private String status;  // WAITING, REPLIED, COMPLETED

    @Column
    private String reply;  // 답변
}

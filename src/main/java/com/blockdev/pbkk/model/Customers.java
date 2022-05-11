package com.blockdev.pbkk.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import java.util.Date;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customers extends AbstractModel<Long> {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String company_name;

    @Column(nullable = false)
    private String country;

    @Lob
    @Column(name="ADDRESS", length = 512)
    private String address;

    @Column(nullable = false)
    private String post_code;

    @Column(nullable = false)
    private String phone_number;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "added_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    private Date addedDate;
}
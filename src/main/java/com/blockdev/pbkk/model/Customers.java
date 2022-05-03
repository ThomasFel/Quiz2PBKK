package com.blockdev.pbkk.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customers extends AbstractModel<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long service_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String company_name;

    @Column(nullable = false)
    private String country;

    @Lob
    @Column(nullable = false, length=512)
    private String address;

    @Column(nullable = false)
    private String post_code;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String phone_number;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    private Date created_at;

    @Column(name = "updated_at", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP", insertable = false)
    private Date updated_at;

}

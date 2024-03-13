package com.ricardoserin.learningspring.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="customers")
public class Customer implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name="names")
    private String names;
    @Column(name="last_names")
    private String lastNames;
    @Column(name="email")
    private String email;
    @Column(name="created_at")
    private Date createdAt;
}

package br.com.rtech.matchdiary.model;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "team")
@Entity(name = "team")
@Data
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String state;
    @Column(name = "photo_url")
    private String photoUrl;
}

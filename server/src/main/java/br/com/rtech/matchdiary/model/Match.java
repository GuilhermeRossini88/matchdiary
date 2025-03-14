package br.com.rtech.matchdiary.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Table(name = "match")
@Entity(name = "match")
@Data
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;

    @Column(name = "score_team_one")
    private Integer scoreTeamOne;
    @Column(name = "score_team_two")
    private Integer scoreTeamTwo;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "team_two_id")
    private Team teamTwoId;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "team_one_id")
    private Team teamOneId;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "team_supported_id")
    private Team teamSupportedId;

}

package ru.sl1degod.test.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "watercut__log", catalog = "local")
public class WaterCutLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wlog_id")
    private Long wlogId;

    @Column(name = "wlog_date")
    private Date wlogDate;

    @ManyToOne
    @JoinColumn(name = "well_id")
    private Well well_id;

    @ManyToOne
    @JoinColumn(name = "hanger_id")
    private Hanger hanger_id;

    @Column(name = "watered")
    private Float watered;
}

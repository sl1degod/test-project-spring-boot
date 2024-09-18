package ru.sl1degod.test.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "well", catalog = "local")
public class Well {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "well_id")
    private Long wellId;

    @ManyToOne
    @JoinColumn(name = "field_id")
    private Field field_id;

}

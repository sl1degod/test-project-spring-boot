package ru.sl1degod.test.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hanger", catalog = "local")
public class Hanger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hanger_id")
    private Integer hangerId;

    @Column(name = "hanger_type_id")
    private Integer hangerTypeId;

}

package ru.sl1degod.test.api.response;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.sl1degod.test.entity.Hanger;
import ru.sl1degod.test.entity.Well;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WaterCutLogResponse {

    private Date wlogDate;

    private Well well_id;

    private Hanger hanger_id;

    private Float watered;

}

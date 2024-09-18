use KRON_DEV


create table local.field (
                             field_id TIdentifier primary key not null
)


create table local.well (
                            well_id TIdentifier identity primary key not null,
                            field_id TIdentifier FOREIGN KEY REFERENCES local.field (field_id) not null
)

create table local.hanger (
                              hanger_id TIdentifier identity primary key not null,
                              well_id TIdentifier FOREIGN KEY REFERENCES local.well (well_id) not null,
                              hanger_type_id TIdentifier not null
)


create table local.watercut__log (
                                     wlog_id TIdentifier identity primary key not null,
                                     wlog_date TDate not null default getutcdate(),
                                     well_id TIdentifier FOREIGN KEY REFERENCES local.well (well_id) not null,
                                     hanger_id TIdentifier FOREIGN KEY REFERENCES local.hanger (hanger_id) not null,
                                     watered TFloat not null
)

    insert into local.field (field_id)
values
(1),
(2),
(3),
(4),
(5)

insert into local.well (field_id)
values
(1),
(2),
(3),
(4),
(5)

insert into local.hanger (well_id, hanger_type_id)
values
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5)

insert into local.watercut__log (well_id, hanger_id, watered)
values
(1, 1, 10),
(2, 2, 20),
(3, 3, 30),
(4, 4, 25),
(5, 5, 50)

SELECT * FROM local.hanger;
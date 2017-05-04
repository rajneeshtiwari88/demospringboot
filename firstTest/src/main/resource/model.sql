
    drop table if exists EMP;

    drop table if exists hibernate_sequence;

    create table EMP (
       id bigint not null,
        age varchar(255),
        EMP_NAME varchar(25),
        sal integer not null,
        primary key (id)
    ) type=MyISAM;

    create table hibernate_sequence (
       next_val bigint
    ) type=MyISAM;

    insert into hibernate_sequence values ( 1 );

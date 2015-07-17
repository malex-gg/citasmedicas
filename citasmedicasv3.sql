/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     22/05/2015 11:01:47                          */
/*==============================================================*/


drop table if exists CITAS;

drop table if exists HISTORIAL;

drop table if exists HORARIO;

drop table if exists MEDICO;

drop table if exists PACIENTE;

/*==============================================================*/
/* Table: CITAS                                                 */
/*==============================================================*/
create table CITAS
(
   CODIGOCITA           int not null,
   CEDULAPACIENTE       varchar(10) not null,
   CEDULAMEDICO         varchar(10) not null,
   IDHORARIO            int,
   NOMBREPACIENTECITA   varchar(32) not null,
   APELLIDOPACIENTECITA varchar(32) not null,
   EDADPACIENTECITA     varchar(2) not null,
   SEXOPACIENTECITA     varchar(16) not null,
   FECHACITA            date not null,
   MEDICOCITA           varchar(64) not null,
   primary key (CODIGOCITA)
);

/*==============================================================*/
/* Table: HISTORIAL                                             */
/*==============================================================*/
create table HISTORIAL
(
   CODIGOHISTORIAL      int not null,
   CEDULAPACIENTE       varchar(10) not null,
   NOMBREPACIENTEHISTORIAL varchar(32) not null,
   APELLIDOPACIENTEHISTORIAL varchar(32) not null,
   EDADPACIENTEHISTORIAL varchar(2) not null,
   SEXOPACIENTEHISTORIAL varchar(16) not null,
   TIPOSANGREPACIENTEHISTORIAL varchar(3) not null,
   ALERGIAPACIENTEHISTORIAL varchar(256),
   SINTOMASPACIENTEHISTORIAL varchar(256),
   OBSERVACIONESPACIENTEHISTORIAL varchar(256),
   DICTAMENMEDICOHISTORIAL varchar(256),
   RECETAMEDICOHISTORIAL varchar(256),
   primary key (CODIGOHISTORIAL)
);

/*==============================================================*/
/* Table: HORARIO                                               */
/*==============================================================*/
create table HORARIO
(
   IDHORARIO            varchar(2) not null ,
   HORACITA             time not null,
   primary key (IDHORARIO) 
);

/*==============================================================*/
/* Table: MEDICO                                                */
/*==============================================================*/
create table MEDICO
(
   CEDULAMEDICO         varchar(10) not null,
   NOMBREMEDICO         varchar(32) not null,
   APELLIDOMEDICO       varchar(32) not null,
   EDADMEDICO           varchar(2) not null,
   ESPECIALIDADMEDICO   varchar(64) not null,
   TELEFONOMEDICO       varchar(10) not null,
   EMAILMEDICO          varchar(32) not null,
   CONTRASENIAMEDICO    varchar(32) not null,
   primary key (CEDULAMEDICO)
);

/*==============================================================*/
/* Table: PACIENTE                                              */
/*==============================================================*/
create table PACIENTE
(
   CEDULAPACIENTE       varchar(10) not null,
   NOMBREPACIENTE       varchar(32) not null,
   APELLIDOPACIENTE     varchar(32) not null,
   EDADPACIENTE         varchar(2) not null,
   SEXOPACIENTE         varchar(16) not null,
   EMAILPACIENTE        varchar(32) not null,
   CONTRASENIAPACIENTE  varchar(32) not null,
   primary key (CEDULAPACIENTE)
);

alter table CITAS add constraint FK_CITAS foreign key (CEDULAPACIENTE)
      references PACIENTE (CEDULAPACIENTE) on delete restrict on update restrict;

alter table CITAS add constraint FK_CITAS2 foreign key (CEDULAMEDICO)
      references MEDICO (CEDULAMEDICO) on delete restrict on update restrict;

alter table CITAS add constraint FK_REFERENCE_4 foreign key (IDHORARIO)
      references HORARIO (IDHORARIO) on delete restrict on update restrict;

alter table HISTORIAL add constraint FK_RELATIONSHIP_2 foreign key (CEDULAPACIENTE)
      references PACIENTE (CEDULAPACIENTE) on delete restrict on update restrict;


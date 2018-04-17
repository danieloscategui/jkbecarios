-- TABLE ASESORES
INSERT INTO daniel.asesores(id_asesor, asesor) VALUES (asesores_seq.nextval, 'Desiree');
INSERT INTO daniel.asesores(id_asesor, asesor) VALUES (asesores_seq.nextval, 'Juanjo');
INSERT INTO daniel.asesores(id_asesor, asesor) VALUES (asesores_seq.nextval, 'Mercedes Andrade');
INSERT INTO daniel.asesores(id_asesor, asesor) VALUES (asesores_seq.nextval, 'Ruth');
INSERT INTO daniel.asesores(id_asesor, asesor) VALUES (asesores_seq.nextval, 'Juana');
INSERT INTO daniel.asesores(id_asesor, asesor) VALUES (asesores_seq.nextval, 'Maribel');
INSERT INTO daniel.asesores(id_asesor, asesor) VALUES (asesores_seq.nextval, 'Isabel Quiroz');
INSERT INTO daniel.asesores(id_asesor, asesor) VALUES (asesores_seq.nextval, 'Oscar');
INSERT INTO daniel.asesores(id_asesor, asesor) VALUES (asesores_seq.nextval, 'Wilder');
INSERT INTO daniel.asesores(id_asesor, asesor) VALUES (asesores_seq.nextval, 'Milagros');
INSERT INTO daniel.asesores(id_asesor, asesor) VALUES (asesores_seq.nextval, 'Jocabeth');

-- TABLA IES
INSERT INTO daniel.ies(id_ies, ies_nombre, tipo_ies, tipo_gestion) VALUES (ies_seq.nextval, 'ICPNA', 'INSTITUTO', 'PRIVADO' );
INSERT INTO daniel.ies(id_ies, ies_nombre, tipo_ies, tipo_gestion) VALUES (ies_seq.nextval, 'UNI', 'UNVERSIDAD', 'PUBLICO' );
INSERT INTO daniel.ies(id_ies, ies_nombre, tipo_ies, tipo_gestion) VALUES (ies_seq.nextval, 'SENATI', 'INSTITUTO', 'PUBLICO_PRIVADO' );
INSERT INTO daniel.ies(id_ies, ies_nombre, tipo_ies, tipo_gestion) VALUES (ies_seq.nextval, 'UNMSM', 'UNIVERSIDAD', 'PUBLICO' );
INSERT INTO daniel.ies(id_ies, ies_nombre, tipo_ies, tipo_gestion) VALUES (ies_seq.nextval, 'UNALM', 'UNIVERSIDAD', 'PUBLICO' );
INSERT INTO daniel.ies(id_ies, ies_nombre, tipo_ies, tipo_gestion) VALUES (ies_seq.nextval, 'CHIO LECCA', 'INSTITUTO', 'PRIVADO' );
INSERT INTO daniel.ies(id_ies, ies_nombre, tipo_ies, tipo_gestion) VALUES (ies_seq.nextval, 'IDAT (IBEROTEC)', 'INSTITUTO', 'PRIVADO' );
INSERT INTO daniel.ies(id_ies, ies_nombre, tipo_ies, tipo_gestion) VALUES (ies_seq.nextval, 'TECSUP', 'INSTITUTO', 'PRIVADO' );
INSERT INTO daniel.ies(id_ies, ies_nombre, tipo_ies, tipo_gestion) VALUES (ies_seq.nextval, 'ADEX', 'INSTITUTO', 'PRIVADO' );
INSERT INTO daniel.ies(id_ies, ies_nombre, tipo_ies, tipo_gestion) VALUES (ies_seq.nextval, 'LA CANTUTA', 'UNIVERSIDAD', 'PUBLICO' );
INSERT INTO daniel.ies(id_ies, ies_nombre, tipo_ies, tipo_gestion) VALUES (ies_seq.nextval, 'CETEMIN', 'INSTITUTO', 'PRIVADO' );
INSERT INTO daniel.ies(id_ies, ies_nombre, tipo_ies, tipo_gestion) VALUES (ies_seq.nextval, 'CENFOTUR', 'INSTITUTO', 'PUBLICO_PRIVADO' );
INSERT INTO daniel.ies(id_ies, ies_nombre, tipo_ies, tipo_gestion) VALUES (ies_seq.nextval, 'UNIV. CALLAO', 'UNIVERSIDAD', 'PUBLICO' );
INSERT INTO daniel.ies(id_ies, ies_nombre, tipo_ies, tipo_gestion) VALUES (ies_seq.nextval, 'AVIA', 'INSTITUTO', 'PRIVADO' );
INSERT INTO daniel.ies(id_ies, ies_nombre, tipo_ies, tipo_gestion) VALUES (ies_seq.nextval, 'IBEROAMERICANO', 'INSTITUTO', 'PRIVADO' );
INSERT INTO daniel.ies(id_ies, ies_nombre, tipo_ies, tipo_gestion) VALUES (ies_seq.nextval, 'CONSERVATORIO', 'UNVERSIDAD', 'PUBLICO' );
INSERT INTO daniel.ies(id_ies, ies_nombre, tipo_ies, tipo_gestion) VALUES (ies_seq.nextval, 'ENSB', 'ESCUELA', 'PUBLICO' );
INSERT INTO daniel.ies(id_ies, ies_nombre, tipo_ies, tipo_gestion) VALUES (ies_seq.nextval, 'BELLAS ARTES', 'ESCUELA', 'PUBLICO' );
INSERT INTO daniel.ies(id_ies, ies_nombre, tipo_ies, tipo_gestion) VALUES (ies_seq.nextval, 'BRITANICO', 'INSTIUTO', 'PRIVADO' );


-- TABLA BENEFICIOS
INSERT INTO daniel.beneficios(id_beneficio, descripcion) VALUES (beneficios_seq.nextval, 'Beneficio 1');
INSERT INTO daniel.beneficios(id_beneficio, descripcion) VALUES (beneficios_seq.nextval, 'Beneficio 2');
INSERT INTO daniel.beneficios(id_beneficio, descripcion) VALUES (beneficios_seq.nextval, 'Beneficio 3');
INSERT INTO daniel.beneficios(id_beneficio, descripcion) VALUES (beneficios_seq.nextval, 'Beneficio 4');
INSERT INTO daniel.beneficios(id_beneficio, descripcion) VALUES (beneficios_seq.nextval, 'Beneficio 5');
INSERT INTO daniel.beneficios(id_beneficio, descripcion) VALUES (beneficios_seq.nextval, 'Beneficio 6');
INSERT INTO daniel.beneficios(id_beneficio, descripcion) VALUES (beneficios_seq.nextval, 'Beneficio 7');
INSERT INTO daniel.beneficios(id_beneficio, descripcion) VALUES (beneficios_seq.nextval, 'Beneficio 8');
INSERT INTO daniel.beneficios(id_beneficio, descripcion) VALUES (beneficios_seq.nextval, 'Beneficio 9');
INSERT INTO daniel.beneficios(id_beneficio, descripcion) VALUES (beneficios_seq.nextval, 'Beneficio 10');

-- TABLA BECAS
INSERT INTO daniel.becas(id_beca, convocatoria, modalidad, id_ies, region_estudio, sede_estudio, carrera, inicio_beca, termino_beca, semestre_egreso, asesor_responsable) 
VALUES (becas_seq.nextval, '2016-I', 'Permanencia Universidades Publicas', 1, 'Lima', 'San Isidro', 'Ciencias Economicas', to_date('15/04/2016','dd/mm/yyyy'), to_date('10/05/2017','dd/mm/yyyy'), 'Semestre 2', 1);
INSERT INTO daniel.becas(id_beca, convocatoria, modalidad, id_ies, region_estudio, sede_estudio, carrera, inicio_beca, termino_beca, semestre_egreso, asesor_responsable) 
VALUES (becas_seq.nextval, '2016-I', 'Permanencia Universidades Publicas', 3, 'Lima', 'San Isidro', 'Ciencias Contables', to_date('15/04/2016','dd/mm/yyyy'), to_date('10/05/2017','dd/mm/yyyy'), 'Semestre 2', 1);
INSERT INTO daniel.becas(id_beca, convocatoria, modalidad, id_ies, region_estudio, sede_estudio, carrera, inicio_beca, termino_beca, semestre_egreso, asesor_responsable) 
VALUES (becas_seq.nextval, '2016-II', 'Permanencia Conservatorio', 2, 'Lima', 'Cercado', 'Guitarra', to_date('10/01/2016','dd/mm/yyyy'), to_date('20/06/2017','dd/mm/yyyy'), 'Semestre 1', 2);
INSERT INTO daniel.becas(id_beca, convocatoria, modalidad, id_ies, region_estudio, sede_estudio, carrera, inicio_beca, termino_beca, semestre_egreso, asesor_responsable) 
VALUES (becas_seq.nextval, '2016-II', 'Permanencia Conservatorio', 2, 'Lima', 'Cercado', 'Canto', to_date('11/01/2016','dd/mm/yyyy'), to_date('21/06/2017','dd/mm/yyyy'), 'Semestre 1', 2);
INSERT INTO daniel.becas(id_beca, convocatoria, modalidad, id_ies, region_estudio, sede_estudio, carrera, inicio_beca, termino_beca, semestre_egreso, asesor_responsable) 
VALUES (becas_seq.nextval, '2016', 'Permanencia Universidades Privadas', 4, 'Lima', 'Surco', 'Medicina Veterinaria', to_date('02/02/2016','dd/mm/yyyy'), to_date('29/11/2017','dd/mm/yyyy'), 'Semestre Unico', 3);
INSERT INTO daniel.becas(id_beca, convocatoria, modalidad, id_ies, region_estudio, sede_estudio, carrera, inicio_beca, termino_beca, semestre_egreso, asesor_responsable) 
VALUES (becas_seq.nextval, '2016', 'Permanencia Universidades Privadas', 4, 'Lima', 'Lince', 'Arquitecto', to_date('02/02/2016','dd/mm/yyyy'), to_date('13/12/2017','dd/mm/yyyy'), 'Semestre Unico', 3);

-- TABLA BECA BENEFICIOS
INSERT INTO daniel.beca_beneficios(id_beca, id_beneficios) VALUES (1, 1);
INSERT INTO daniel.beca_beneficios(id_beca, id_beneficios) VALUES (1, 7);
INSERT INTO daniel.beca_beneficios(id_beca, id_beneficios) VALUES (2, 3);
INSERT INTO daniel.beca_beneficios(id_beca, id_beneficios) VALUES (2, 6);
INSERT INTO daniel.beca_beneficios(id_beca, id_beneficios) VALUES (3, 10);
INSERT INTO daniel.beca_beneficios(id_beca, id_beneficios) VALUES (3, 9);
INSERT INTO daniel.beca_beneficios(id_beca, id_beneficios) VALUES (4, 2);
INSERT INTO daniel.beca_beneficios(id_beca, id_beneficios) VALUES (4, 4);
INSERT INTO daniel.beca_beneficios(id_beca, id_beneficios) VALUES (5, 5);
INSERT INTO daniel.beca_beneficios(id_beca, id_beneficios) VALUES (5, 8);
INSERT INTO daniel.beca_beneficios(id_beca, id_beneficios) VALUES (6, 2);
INSERT INTO daniel.beca_beneficios(id_beca, id_beneficios) VALUES (6, 5);

-- TABLA BECARIOS
INSERT INTO daniel.becarios(dni, apellido_materno, apellido_paterno, nombres, fecha_nacimiento, edad, numero_expediente, 
id_beca, representante_legal, telefonos, correo_pronabec, correo_personal, 
direccion, region_procedencia, provincia_procedencia, distrito_procedencia, 
region_postulacion, provincia_postulacion, distrito_postulacion, resolucion_adjudicacion, resolucion_adjudicacion_fecha, estado_actual) 
VALUES('23417892', 'CALLUPE', 'HINIZ', 'CARMEN', to_date('01/01/1990', 'dd/mm/yyyy'), 16, 'EXP-2016-01', 
1, 'Representante Legal', '88762129', 'pronabec@pronabec.edu.pe', 'carmen@gmail.com', 
'Direccion Lima', 'Lima', 'Lima', 'La Victoria', 
'Lima', 'Lima', 'Lima', 'RES-ADJ-2016-0001', to_date('01/01/2016','dd/mm/yyyy'), 'INACTIVO');
INSERT INTO daniel.becarios(dni, apellido_materno, apellido_paterno, nombres, fecha_nacimiento, edad, numero_expediente, 
id_beca, representante_legal, telefonos, correo_pronabec, correo_personal, 
direccion, region_procedencia, provincia_procedencia, distrito_procedencia, 
region_postulacion, provincia_postulacion, distrito_postulacion, resolucion_adjudicacion, resolucion_adjudicacion_fecha, estado_actual) 
VALUES('12367809', 'MONTESINOS', 'KARL', 'LUIS', to_date('08/09/1991', 'dd/mm/yyyy'), 17, 'EXP-2016-02', 
1, 'Representante Legal', '1123455', 'pronabec@pronabec.edu.pe', 'luis@gmail.com', 
'Direccion Surco', 'Pasco', 'Pasco', 'Colquijirca', 
'Lima', 'Lima', 'Lima', 'RES-ADJ-2016-0002', to_date('04/01/2016','dd/mm/yyyy'), 'ACTIVO');
INSERT INTO daniel.becarios(dni, apellido_materno, apellido_paterno, nombres, fecha_nacimiento, edad, numero_expediente, 
id_beca, representante_legal, telefonos, correo_pronabec, correo_personal, 
direccion, region_procedencia, provincia_procedencia, distrito_procedencia, 
region_postulacion, provincia_postulacion, distrito_postulacion, resolucion_adjudicacion, resolucion_adjudicacion_fecha, estado_actual) 
VALUES('89235809', 'BOZA', 'ESTRELLA', 'MANUEL', to_date('01/03/1990', 'dd/mm/yyyy'), 18, 'EXP-2016-03', 
2, NULL, '8766665', 'pronabec@pronabec.edu.pe', 'manuel@gmail.com', 
'Direccion Cercado', 'Junin', 'Junin', 'Jauja', 
'Lima', 'Lima', 'Callao', 'RES-ADJ-2016-0003', to_date('05/01/2016','dd/mm/yyyy'), 'ACTIVO');
INSERT INTO daniel.becarios(dni, apellido_materno, apellido_paterno, nombres, fecha_nacimiento, edad, numero_expediente, 
id_beca, representante_legal, telefonos, correo_pronabec, correo_personal, 
direccion, region_procedencia, provincia_procedencia, distrito_procedencia, 
region_postulacion, provincia_postulacion, distrito_postulacion, resolucion_adjudicacion, resolucion_adjudicacion_fecha, estado_actual) 
VALUES('54680977', 'VALLE', 'ROSARIO', 'LAURA', to_date('01/01/1989', 'dd/mm/yyyy'), 18, 'EXP-2016-04', 
3, NULL, '098900', 'pronabec@pronabec.edu.pe', 'laura@gmail.com', 
'Direccion Cercado', 'Lima', 'Barranca', 'Huacho', 
'Lima', 'Lima', 'Miraflores', 'RES-ADJ-2016-0004', to_date('01/02/2016','dd/mm/yyyy', 'ACTIVO'));

-- TABLA TRAMITES
INSERT INTO daniel.tramites(id_tramite, dni_becario, numero_sigedo, motivo, oficina_destino, estado, tipo_doc_respuesta, numero_documento, fecha_documento) 
VALUES(tramites_seq.nextval, '23417892', 'SIGEDO-01', 'CONSULTA DE DATOS', 'MESA DE PARTES', 'CERRADO', 'CARTA', 'C001-17', to_date('01/10/2017', 'dd/mm/yyyy'));
INSERT INTO daniel.tramites(id_tramite, dni_becario, numero_sigedo, motivo, oficina_destino, estado, tipo_doc_respuesta, numero_documento, fecha_documento) 
VALUES(tramites_seq.nextval, '54680977', 'SIGEDO-02', 'CONSULTA SOBRE BECA', 'ASISTENCIA TECNICA', 'CERRADO', 'OFICIO', 'OF004-17', to_date('14/11/2017', 'dd/mm/yyyy'));
INSERT INTO daniel.tramites(id_tramite, dni_becario, numero_sigedo, motivo, oficina_destino, estado, tipo_doc_respuesta, numero_documento, fecha_documento) 
VALUES(tramites_seq.nextval, '89235809', 'SIGEDO-03', 'SOLICITUD DE PERMISO DE VIAJE', 'MESA DE PARTES', 'EN TRAMITE', NULL, NULL, NULL);

-- TABLE CONDICION PAGO
INSERT INTO daniel.condicion_pago(id_condicion_pago, fecha, dni_becario, estado, condicion_sibec, situacion, condicion_subvencion) 
VALUES(condicion_pago_seq.nextval, to_date('12/04/2017', 'dd/mm/yyyy'), '89235809', 'Estado 1', 'Condicion Sibec 1', 'Situacion 1', 'Condicion de subvencion');
INSERT INTO daniel.condicion_pago(id_condicion_pago, fecha, dni_becario, estado, condicion_sibec, situacion, condicion_subvencion) 
VALUES(condicion_pago_seq.nextval, to_date('17/08/2017', 'dd/mm/yyyy'), '23417892', 'Estado 3', 'Condicion Sibec 6', 'Situacion 9', 'Condicion de subvencion');
INSERT INTO daniel.condicion_pago(id_condicion_pago, fecha, dni_becario, estado, condicion_sibec, situacion, condicion_subvencion) 
VALUES(condicion_pago_seq.nextval, to_date('07/07/2017', 'dd/mm/yyyy'), '54680977', 'Estado 2', 'Condicion Sibec 4', 'Situacion 8', 'Condicion de subvencion');

-- TABLE PAGO ACADEMICO
INSERT INTO daniel.pago_academico(id_pago_academico, numero_convenio, mes, numero_cuota, numero_solicitud, fecha_solicitud, numero_conformidad, cantidad_becarios, monto_total, pago_materiales) 
VALUES(pago_academico_seq.nextval, 'Convenio 001', 'Abril', 'Cuota 2', 'Solicitud 002', to_date('13/04/2017', 'dd/mm/yyyy'), 'Conformidad 001', 50, 1250.00, 3000.00);
INSERT INTO daniel.pago_academico(id_pago_academico, numero_convenio, mes, numero_cuota, numero_solicitud, fecha_solicitud, numero_conformidad, cantidad_becarios, monto_total, pago_materiales) 
VALUES(pago_academico_seq.nextval, 'Convenio 002', 'Mayo', 'Cuota 3', 'Solicitud 003', to_date('10/02/2017', 'dd/mm/yyyy'), 'Conformidad 011', 55, 2345.00, 1234.00);
INSERT INTO daniel.pago_academico(id_pago_academico, numero_convenio, mes, numero_cuota, numero_solicitud, fecha_solicitud, numero_conformidad, cantidad_becarios, monto_total, pago_materiales) 
VALUES(pago_academico_seq.nextval, 'Convenio 003', 'Marzo', 'Cuota 1', 'Solicitud 005', to_date('08/01/2017', 'dd/mm/yyyy'), 'Conformidad 012', 90, 5349.00, 2349.00);




-- STORE PROCEDURE TO DISTRIBUTE DB_BECARIOS_EXT TABLE INTO THREE TABLES: ASESORES, IES, BECAS, BECARIOS
-- LOOP EACH ROW, CHECK ASESOR_NOMBRE, IES_NOMBRE FIRST
-- ASESOR_ID = IF ASESOR DOESN'T EXIST THEN INSERT ASESOR ANG GET ITS NEW ID CREATED ELSE GET ID
-- IES_ID = IF IES_NOMBRES DOESN'T EXIST THEN INSERT IES_NOMBRE, IES_TIPO,IES_GESTION AND GET ITS NEW ID CREATED ELSE GET ID
-- BECA_ID = IF BECA_CONVOCATORIA, BECA_MODALIDAD, BECA_REGION, BECA_SEDE, BECA_CARRERA DOESN'T EXIST THEN INSERT AND GET ITS
--  ID CREATED ELSE GET ID
-- BECARIO_DNI = IF BECARIO_DNI DOESN'T EXIST THEN INSERT ELSE SKIP.

-- NUMBER ASESOR_EXISTE(ASESOR_NOMBRE);
-- NUMBER IES_EXISTE(IES_NOMBRE);
-- NUMBER BECA_EXISTE(BECA_CONVOCATORIA, BECA_MODALIDAD, BECA_REGION, BECA_SEDE, BECA_CARRERA);
-- VARCHAR2 BECARIO_EXISTE(DNI);

-- INSERT ASESOR(ASESOR_NOMBRE);
-- INSERT IES(IES_NOMBRE, IES_ITPO, IES_GESTION);
-- INSERT BECA(ASESOR_ID, IES_ID, BECA_CONVOCATORIA, BECA_MODALIDAD, BECA_REGION_ESTUDIO, BECA_SEDE_ESTUDIO, BECA_CARRERA, BECA_INICIO, BECA_TERMINO, BECA_SEMESTRE_EGRESO);
-- INSERT BECARIO();
-- CARGAR_DATOS();
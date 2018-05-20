-- CREATE DIRECTORY FOR EXTERNAL TABLE
--CONNECT / AS SYSDBA
--CREATE OR REPLACE DIRECTORY ORACLE_DATA_DIR AS 'D:/DESARROLLO/ORACLE-DIR/FLATFILES/DATA';
--CREATE OR REPLACE DIRECTORY ORACLE_BAD_DIR AS 'D:/DESARROLLO/ORACLE-DIR/FLATFILES/BAD';
--CREATE OR REPLACE DIRECTORY ORACLE_LOG_DIR AS 'D:/DESARROLLO/ORACLE-DIR/FLATFILES/LOG';
--GRANT READ, WRITE ON DIRECTORY ORACLE_DATA_DIR TO daniel;
--GRANT READ, WRITE ON DIRECTORY ORACLE_BAD_DIR TO daniel;
--GRANT READ, WRITE ON DIRECTORY ORACLE_LOG_DIR TO daniel;

-- COPY CSV FILE INTO DIRECTORY

-- CREATE EXTERNAL TABLE
DROP TABLE DB_BECARIOS_EXT;
COMMIT;
CREATE TABLE DB_BECARIOS_EXT(
	IES_NOMBRE VARCHAR2(200),
	IES_TIPO VARCHAR2(100),
	IES_GESTION VARCHAR2(100),
	ASESOR_NOMBRE VARCHAR2(200),
	BECA_CONVOCATORIA VARCHAR2(30),
	BECA_MODALIDAD VARCHAR2(200),
	BECA_REGION_ESTUDIO VARCHAR2(100),
	BECA_SEDE_ESTUDIO VARCHAR2(100),
	BECA_CARRERA VARCHAR2(200),
  BECARIO_DNI VARCHAR2(8),
  BECARIO_APELLIDOS VARCHAR2(200),
  BECARIO_NOMBRES VARCHAR2(200),
  BECARIO_FNAC DATE,
  BECARIO_SEXO VARCHAR2(30),
  BECARIO_ESTADO_ACTUAL VARCHAR2(100),
  BECARIO_EXPEDIENTE VARCHAR2(50),
  BECARIO_REPRESENTANTE VARCHAR2(255),
  BECARIO_REPRESENTANTE_DNI VARCHAR2(20),
  BECARIO_TELEFONOS VARCHAR2(100),
  BECARIO_CORREO_PERSONAL VARCHAR2(100),
  BECARIO_REGION_POSTULACION VARCHAR2(100),
  BECARIO_PROVINCIA_POSTULACION VARCHAR2(100),
  BECARIO_DISTRITO_POSTULACION VARCHAR2(100),
  BECARIO_RESOLUCION VARCHAR2(100)
) ORGANIZATION EXTERNAL (
  TYPE ORACLE_LOADER
  DEFAULT DIRECTORY ORACLE_DAT_DIR
  ACCESS PARAMETERS  
  (
    RECORDS DELIMITED BY NEWLINE 
    BADFILE ORACLE_BAD_DIR: 'BD_BECARIOS_EXT%a_%p.bad'
    LOGFILE ORACLE_LOG_DIR: 'BD_BECARIOS_EXT%a_%p.log'
    FIELDS TERMINATED BY ',' 
    OPTIONALLY ENCLOSED BY '"'
    MISSING FIELD VALUES ARE NULL
    (
      IES_NOMBRE, IES_TIPO, IES_GESTION, 
      ASESOR_NOMBRE,
      BECA_CONVOCATORIA, BECA_MODALIDAD, BECA_REGION_ESTUDIO, BECA_SEDE_ESTUDIO, BECA_CARRERA, 
      BECARIO_DNI, BECARIO_APELLIDOS, BECARIO_NOMBRES, BECARIO_FNAC DATE 'DD/MM/RRRR', BECARIO_SEXO, BECARIO_ESTADO_ACTUAL,
      BECARIO_EXPEDIENTE, BECARIO_REPRESENTANTE, BECARIO_REPRESENTANTE_DNI, BECARIO_TELEFONOS, BECARIO_CORREO_PERSONAL,
      BECARIO_REGION_POSTULACION, BECARIO_PROVINCIA_POSTULACION, BECARIO_DISTRITO_POSTULACION, BECARIO_RESOLUCION
    )
  )
  LOCATION ('DB_BECARIOS_COMPLETO_UTF8.csv')
)
REJECT LIMIT UNLIMITED;

-- CREATE PACKAGE
CREATE OR REPLACE PACKAGE becario_pkg AS
  
  FUNCTION  asesor_existe(nombre_asesor VARCHAR2) RETURN NUMBER;
  FUNCTION  ies_existe(nombre_ies VARCHAR2) RETURN NUMBER;
  FUNCTION  beca_existe(convocatoria_beca VARCHAR2, modalidad_beca VARCHAR2, region_beca VARCHAR2, 
                        sede_beca VARCHAR2, carrera_beca VARCHAR2) RETURN NUMBER;
  FUNCTION  becario_existe(becario_dni VARCHAR2, beca_id NUMBER) RETURN VARCHAR2;
  FUNCTION  crear_asesor(nombre_asesor VARCHAR2) RETURN NUMBER;
  FUNCTION  crear_ies (nombre_ies VARCHAR2, tipo_ies VARCHAR2, gestion_ies VARCHAR2) RETURN NUMBER;
  FUNCTION  crear_beca (asesor_id NUMBER, ies_id NUMBER, convocatoria_beca VARCHAR2, modalidad_beca VARCHAR2, 
            region_beca VARCHAR2, sede_beca VARCHAR2, carrera_beca VARCHAR2) RETURN NUMBER;
  PROCEDURE crear_becario(beca_id NUMBER, dni VARCHAR2, apellidos VARCHAR2, nombres VARCHAR2, fnac DATE, sexo VARCHAR2, estado_actual VARCHAR2,
                          expediente VARCHAR2, representante VARCHAR2, representante_dni VARCHAR2, telefonos VARCHAR2, correo_personal VARCHAR2, 
                          region_postulacion VARCHAR2, provincia_postulacion VARCHAR2, distrito_postulacion VARCHAR2, resolucion VARCHAR2);          
  
END becario_pkg;
/
CREATE OR REPLACE PACKAGE BODY becario_pkg AS

  FUNCTION asesor_existe(nombre_asesor VARCHAR2) RETURN NUMBER IS
    asesor_id NUMBER;
  BEGIN    
    BEGIN
      SELECT id_asesor INTO asesor_id 
      FROM asesores
      WHERE upper(asesor) = upper(trim(nombre_asesor));
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
      asesor_id := 0;
    END;
    RETURN asesor_id;
  END asesor_existe;
  
  FUNCTION ies_existe(nombre_ies VARCHAR2) RETURN NUMBER IS
    ies_id number;
  BEGIN
    BEGIN
      SELECT id_ies INTO ies_id
      FROM ies
      WHERE upper(ies_nombre) = upper(trim(nombre_ies));
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
        ies_id := 0;
    END;
    RETURN ies_id;
  END ies_existe;
  
  FUNCTION beca_existe(convocatoria_beca VARCHAR2, modalidad_beca VARCHAR2, region_beca VARCHAR2, 
          sede_beca VARCHAR2, carrera_beca VARCHAR2) RETURN NUMBER IS
    beca_id NUMBER;
  BEGIN
    BEGIN
    
      SELECT id_beca INTO beca_id
      FROM becas
      WHERE upper(convocatoria) = upper(trim(convocatoria_beca))
      AND   upper(modalidad) = upper(trim(modalidad_beca))
      AND   upper(region_estudio) = upper(trim(region_beca))
      AND   upper(sede_estudio) = upper(trim(sede_beca))
      AND   upper(carrera) = upper(trim(carrera_beca));
      
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
        beca_id := 0;
    END;
    RETURN beca_id;
  END beca_existe;
          
  FUNCTION becario_existe(becario_dni VARCHAR2, beca_id NUMBER) RETURN VARCHAR2 IS
    dni_to_check VARCHAR2(8);
  BEGIN 
    BEGIN
      SELECT dni INTO dni_to_check
      FROM becarios 
      WHERE trim(dni) = trim(becario_dni) 
      AND id_beca = beca_id;
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
        dni_to_check := '0';  
    END;
    RETURN dni_to_check;
  END becario_existe;
  
  FUNCTION crear_asesor(nombre_asesor VARCHAR2) RETURN NUMBER IS
    new_asesor_id NUMBER;
  BEGIN
    SELECT asesores_seq.NEXTVAL INTO new_asesor_id FROM dual;
    INSERT INTO asesores VALUES (new_asesor_id, upper(trim(nombre_asesor)));
    COMMIT;
    RETURN new_asesor_id;
  END crear_asesor;
  
  FUNCTION crear_ies (nombre_ies VARCHAR2, tipo_ies VARCHAR2, gestion_ies VARCHAR2) RETURN NUMBER IS
    new_ies_id NUMBER;
  BEGIN 
    SELECT ies_seq.NEXTVAL INTO new_ies_id  FROM dual;
    INSERT INTO IES VALUES (new_ies_id, upper(trim(nombre_ies)), upper(trim(tipo_ies)), upper(trim(gestion_ies)));
    COMMIT;
    RETURN new_ies_id;
  END crear_ies;
  
  
  FUNCTION crear_beca (asesor_id NUMBER, ies_id NUMBER, convocatoria_beca VARCHAR2, modalidad_beca VARCHAR2, 
          region_beca VARCHAR2, sede_beca VARCHAR2, carrera_beca VARCHAR2) RETURN NUMBER IS
    beca_id NUMBER;
  BEGIN 
    SELECT becas_seq.NEXTVAL INTO beca_id FROM dual;
    INSERT INTO becas (id_beca, convocatoria, modalidad, id_ies, region_estudio, sede_estudio, carrera, asesor_responsable) 
    VALUES (beca_id, convocatoria_beca, modalidad_beca, ies_id, region_beca, sede_beca, carrera_beca, asesor_id);
    COMMIT;
    RETURN beca_id;
  END crear_beca;
 
  
  PROCEDURE crear_becario(beca_id NUMBER, dni VARCHAR2, apellidos VARCHAR2, nombres VARCHAR2, fnac DATE, sexo VARCHAR2, estado_actual VARCHAR2,
                          expediente VARCHAR2, representante VARCHAR2, representante_dni VARCHAR2, telefonos VARCHAR2, correo_personal VARCHAR2, 
                          region_postulacion VARCHAR2, provincia_postulacion VARCHAR2, distrito_postulacion VARCHAR2, resolucion VARCHAR2) IS
    edad_actual number;
  BEGIN
    
    IF (fnac IS NOT NULL) THEN
      edad_actual := trunc(months_between(sysdate, to_date(fnac, 'DD/MM/RRRR'))/12);
    END IF;
    
    INSERT INTO becarios (id_beca, id_becario, dni, apellidos, nombres, fecha_nacimiento, edad, sexo, estado_actual, numero_expediente, 
                          representante, representante_dni, telefonos, correo_personal, region_postulacion, provincia_postulacion,
                          distrito_postulacion, resolucion_adjudicacion)
    VALUES (beca_id, becario_seq.nextval, trim(dni), upper(trim(apellidos)), upper(trim(nombres)), fnac, edad_actual, upper(trim(sexo)), upper(trim(estado_actual)),
            trim(expediente), upper(trim(representante)), trim(representante_dni), trim(telefonos), trim(correo_personal),
            upper(trim(region_postulacion)), upper(trim(provincia_postulacion)), upper(trim(distrito_postulacion)), trim(resolucion));
    COMMIT;
  
  END crear_becario;
         
END becario_pkg;
/


-- CREATE PROCEDURE
CREATE OR REPLACE PROCEDURE load_becario IS

  CURSOR becario_cur IS SELECT * FROM db_becarios_ext;
  b_rec db_becarios_ext%ROWTYPE;
  
  asesor_id number;
  ies_id number;
  beca_id number;
  becario_dni varchar2(8);
  
  count_asesor number := 0;
  count_ies number := 0;
  count_beca number := 0;
  count_becario number := 0;
  
BEGIN
  OPEN becario_cur;
  LOOP
    FETCH becario_cur INTO b_rec;
    EXIT WHEN becario_cur%NOTFOUND;
    
    asesor_id := becario_pkg.asesor_existe(b_rec.asesor_nombre);  
    ies_id := becario_pkg.ies_existe(b_rec.ies_nombre);
    beca_id := becario_pkg.beca_existe(b_rec.beca_convocatoria, b_rec.beca_modalidad, b_rec.beca_region_estudio,
                                      b_rec.beca_sede_estudio, b_rec.beca_carrera);
    becario_dni := becario_pkg.becario_existe(b_rec.becario_dni, beca_id);
    
    IF asesor_id = 0 THEN
      asesor_id := becario_pkg.crear_asesor(b_rec.asesor_nombre);
      count_asesor := count_asesor + 1;
    END IF;
    
    IF ies_id = 0 THEN
      ies_id :=  becario_pkg.crear_ies(b_rec.ies_nombre,b_rec.ies_tipo, b_rec.ies_gestion);
      count_ies := count_ies + 1;
    END IF;
    
    IF beca_id = 0 THEN
      beca_id := becario_pkg.crear_beca(asesor_id, ies_id, b_rec.beca_convocatoria, b_rec.beca_modalidad,
                                        b_rec.beca_region_estudio, b_rec.beca_sede_estudio, b_rec.beca_carrera);
      count_beca := count_beca + 1;                                        
    END IF;
    
    IF (becario_dni = '0') THEN
      becario_pkg.crear_becario(beca_id, b_rec.becario_dni, b_rec.becario_apellidos, b_rec.becario_nombres, 
                                b_rec.becario_fnac, b_rec.becario_sexo, b_rec.becario_estado_actual,
                                b_rec.becario_expediente, b_rec.becario_representante, b_rec.becario_representante_dni,
                                b_rec.becario_telefonos, b_rec.becario_correo_personal, b_rec.becario_region_postulacion,
                                b_rec.becario_provincia_postulacion, b_rec.becario_distrito_postulacion,
                                b_rec.becario_resolucion);
      count_becario := count_becario + 1;
    END IF;
    
  END LOOP;
  CLOSE becario_cur;
  
  DBMS_OUTPUT.PUT_LINE('====== DONE! ======');
  DBMS_OUTPUT.PUT_LINE('# asesores: ' || count_asesor);
  DBMS_OUTPUT.PUT_LINE('# ies     : ' || count_ies);
  DBMS_OUTPUT.PUT_LINE('# becas   : ' || count_beca);
  DBMS_OUTPUT.PUT_LINE('# becarios: ' || count_becario);
  
END;

-- DONE!


  CREATE TABLE IF NOT EXISTS CP_TYPE_DOCUMENT
   (TYP_DOC_CODE VARCHAR(4) PRIMARY KEY,
	DESCRIPCION VARCHAR(60),
	STATUS NUMERIC(1,0) DEFAULT 1 ,
	AUD_CREATED_DATE TIMESTAMP 	,
	AUD_CREATED_USER VARCHAR(120 ) ,
	AUD_UPDATE_DATE TIMESTAMP		,
	AUD_UPDATE_USER VARCHAR(120 )
   );

   COMMENT ON COLUMN CP_TYPE_DOCUMENT.TYP_DOC_CODE IS 'Identificador de la tabla de 4 caracteres númericos';
   COMMENT ON COLUMN CP_TYPE_DOCUMENT.DESCRIPCION IS 'Denominación del los documentos de identidad';
   COMMENT ON TABLE  CP_TYPE_DOCUMENT  IS 'La tabla Identidad contiene el ID';
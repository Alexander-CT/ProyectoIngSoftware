create table usuario( 
cod_usu char(5) primary key, 
cod_emp char(5) , 
nom_usu varchar2(20) , 
password varchar2(20)  
);

create table categoria( 
cod_cate char (5)  primary key , 
nom_cate varchar2(30)  
);

create table producto( 
cod_pro char(5) primary key, 
nom_pro varchar2(30) , 
precio number(10,2) , 
stock int , 
cod_cate char(5) , 
cod_prov char(5)  
);

create table proveedor( 
cod_prov char(5)  primary key, 
nom_prov varchar2(30), 
contacto varchar2(15) 
);

create table cliente( 
cod_cli char(5)  primary key, 
pat_cli varchar2(20), 
mat_cli varchar2(20), 
nom_cli varchar2(20), 
dir_cli varchar2(40), 
sexo char(1), 
dni_ruc varchar2(11), 
contacto varchar2(15) 
);

create table empleado( 
cod_emp char(5) not null primary key, 
pat_emp varchar2(20), 
mat_emp varchar2(20), 
nom_emp varchar2(20), 
dir_emp varchar2(40), 
contacto varchar2(15), 
fecha_nac date  
);

create table comprobante_pago( 
cod_comprobante char(5) primary key, 
tipo char(1), 
cod_cli char(5), 
cod_emp char(5), 
fecha date , 
total number(10,2)  
);

create table detalle_comprobante( 
cod_comprobante char(5) , 
cod_pro char(5) , 
precio number(10,2) , 
cant int  
);

insert into usuario values('001','1AA','PEDRO','1234B');

insert into usuario values('002','2AB','JULIO','2515A');

insert into usuario values('003','3BC','CARLOS','2516B');

insert into usuario values('004','4CD','RAMON','2517C');

insert into usuario values('005','5DE','LUCY','2518D');

insert into usuario values('006','6EF','ESTEBAN','2519E');

insert into usuario values('007','7FG','LUCY','2520F');

insert into usuario values('008','8GH','DAYANA','2620G');

insert into usuario values('009','9HI','CAROLINNE','2627H');

insert into usuario values('010','10A','LIZARDO','2628I');

insert into categoria values('AAS','Sombreros y gorras');

insert into categoria values('ABS','TRAJES DE BAÑO');

insert into categoria values('ACS','CALCETINES');

insert into categoria values('ADS','CHAQUETAS');

insert into categoria values('AES','VESTIDO_VERANO');

insert into categoria values('AFS','PIJAMAS');

insert into categoria values('AGS','TRAJES PARA BODA');

insert into categoria values('AHS','BRAGAS');

insert into categoria values('AIS','FAJAS');

insert into categoria values('AJS','VESTIDOS_GALA');

insert into  producto values('1BB','short',10.50,25,'ABS');

insert into  producto values('2BB','Fajas modeladoras',50,5,'AIS');

insert into  producto values('3BB','T-SHIRT BLANCO',25,0,'AJS');

insert into  producto values('4BB','POLO MANLARGA XM',79.40,5,'AFS');

insert into  producto values('5BB','MEDIAS BLACK GIRL ',100.0,0,'AFS');

insert into  producto values('6BB','Corte A/Princesa Escote en V',20000,10,'AJS');

insert into  producto values('7BB','Conor(Catboy)',150.0,0,'AFS');

insert into  producto values('8BB','BLAZER',400.0,35,'ADS');

insert into  producto values('9BB','GORRA PLANA',900.0,10,'AAS');

insert into  producto values('10B','GORRA DE BEISBOL',5000.0,0,'AAS');

insert into  producto values('1BB','short','10.50',25,'ABS');

insert into  producto values('2BB','Fajas modeladoras','50',5,'AIS');

insert into  producto values('3BB','T-SHIRT BLANCO','25',0,'AJS');

insert into  producto values('4BB','POLO MANLARGA XM','79.40',5,'AFS');

insert into  producto values('5BB','MEDIAS BLACK GIRL ','100.0',0,'AFS');

insert into  producto values('6BB','Corte A/Princesa Escote en V','20000',10,'AJS');

insert into  producto values('7BB','Conor(Catboy)','150.0',0,'AFS');

insert into  producto values('8BB','BLAZER','400.0',35,'ADS');

insert into  producto values('9BB','GORRA PLANA','900.0',10,'AAS');

insert into  producto values('10B','GORRA DE BEISBOL','5000.0',0,'AAS');

insert into  producto values('1BB','short',10.50,25,'ABS');

insert into  producto values('1BB','short',10.50,25,'ABS','ffff4');

insert into  producto values('2BB','Fajas modeladoras',50,5,'ffff5');

insert into  producto values('3BB','T-SHIRT BLANCO',25,0,'ffff6');

insert into  producto values('4BB','POLO MANLARGA XM',79.40,5,'AFS','ffff7');

insert into  producto values('5BB','MEDIAS BLACK GIRL ',100.0,0,'AFS','fffff8');

insert into  producto values('6BB','Corte A/Princesa Escote en V',20000,10,'AJS','ffff9');

insert into  producto values('7BB','Conor(Catboy)',150.0 ,0,'AFS','fff10');

insert into  producto values('8BB','BLAZER',400.0,35,'ADS','fff11');

insert into  producto values('9BB','GORRA PLANA',900.0,10,'AAS','fff11');

insert into  producto values('10B','GORRA DE BEISBOL',5000.0,0,'AAS','fff12');

insert into  producto values('2BB','Fajas modeladoras',50,5,'AIS','ffff5');

insert into  producto values('3BB','T-SHIRT BLANCO',25,0,'AJS','ffff6');

insert into proveedor values('ffff4','JULIO BARRIOS','998154219');

insert into proveedor values('ffff5','CARLOS PONTE','978890857');

insert into proveedor values('ffff6','RICHARD SIFUENTES','998997451');

insert into proveedor values('ffff7','MATIAS MACHO','965234197');

insert into proveedor values('fffff8','ERNESTO VILALOBOS','164578921');

insert into proveedor values('ffff9','JOSE VIDAL','945126498');

insert into proveedor values('fff10','LUCY MONTE','978654187');

insert into proveedor values('fff11','LILY BUSTOS','994562154');

insert into proveedor values('fff11','MARIO CASTRO','984164579');

insert into proveedor values('fff12','HENRY DE LOS MONTES','914765421');

insert into cliente values('ACH1','JORGE ESPINOZA','MARIA TERESA','CARLOS ESPINOZA TERESA','JR.CHICLAYO 2405','MASCULINO','71381504','752105');

insert into cliente values('ACH2','OSCAR CHAVEZ',' ROSA BART','COCKY CHAVEZ BART','VILLA LOS ANGELES PSJ10','MASCULINO','71451240','758741');

insert into cliente values('ACH3','WILFREDO CASSAS','JENNY RAMOS','ELENA CASSAS RAMOS','AV.UNIVERSITARIA CUADRA15','FEMENINO','75021364','784561');

insert into cliente values('ACH4','JOSHY BERTO','LUCIANA SANTOS','LIZ BERTO SANTOS','PUENTE PIEDRA  CUADRA 4 ','FEMENINO','75014782','145687');

insert into cliente values('ACH5','LUAN PACHECO','LILIANO PORTOCARRERO','SHEN PACHECO PORTOCARRERO','AV.ARGENTINA CUADRA 13','MASCULINO','7501468','625418');

insert into cliente values('ACH6','VICTOR GARRIDO','GISELA RAMOS','LIZBETH GARRIDO RAMOS','LOS RAMOS URBLOS FLORES PARTE II','FEMENINO','75014568','6147832');

insert into cliente values('ACH7','VLADIMIR PASSARA','GLORIA PAUCAR','HANSON PASSARA PAUCAR','LOS OLIVOS CUADRA NARANJAL','MASCULINO','724653','6541879');

insert into cliente values('ACH8','JORGE ESTRELLA','LIZ SANCHEZ','EDSON ESTRELLA SANCHEZ','JR.CHICLAYO 2405','MASCULINO','75024788','945781');

insert into cliente values('ACH9','SERGIO YANS','JESSICA HURTADO','BOX YANS HURTADO','JR.PASCUAR LOS MOLINOS','MASCULINO','7954871','164578213');

insert into cliente values('ACH10','SHUAN BOCA','SHYNTIA HUARACA','CARLOS ESPINOZA TERESA','JR.COMAS 247','MASCULINO','615478932','1245879');

insert into cliente values('ACH1','JORGE ESPINOZA','MARIA TERESA','CARLOS ESPINOZA TERESA','JR.CHICLAYO 2405','M','71381504','752105');

insert into cliente values('ACH2','OSCAR CHAVEZ',' ROSA BART','COCKY CHAVEZ BART','VILLA LOS ANGELES PSJ10','M','71451240','758741');

insert into cliente values('ACH3','WILFREDO CASSAS','JENNY RAMOS','ELENA CASSAS RAMOS','AV.UNIVERSITARIA CUADRA15','F','75021364','784561');

insert into cliente values('ACH4','JOSHY BERTO','LUCIANA SANTOS','LIZ BERTO SANTOS','PUENTE PIEDRA  CUADRA 4 ','F','75014782','145687');

insert into cliente values('ACH5','LUAN PACHECO','LILIANO PORTOCARRERO','SHEN PACHECO PORTOCARRERO','AV.ARGENTINA CUADRA 13','M','7501468','625418');

insert into cliente values('ACH6','VICTOR GARRIDO','GISELA RAMOS','LIZBETH GARRIDO RAMOS','LOS RAMOS URBLOS FLORES PARTE II','F','75014568','6147832');

insert into cliente values('ACH7','VLADIMIR PASSARA','GLORIA PAUCAR','HANSON PASSARA PAUCAR','LOS OLIVOS CUADRA NARANJAL','M','724653','6541879');

insert into cliente values('ACH8','JORGE ESTRELLA','LIZ SANCHEZ','EDSON ESTRELLA SANCHEZ','JR.CHICLAYO 2405','M','75024788','945781');

insert into cliente values('ACH9','SERGIO YANS','JESSICA HURTADO','BOX YANS HURTADO','JR.PASCUAR LOS MOLINOS','M','7954871','164578213');

insert into cliente values('AC10','SHUAN BOCA','SHYNTIA HUARACA','CARLOS ESPINOZA TERESA','JR.COMAS 247','M','615478932','1245879');

insert into cliente values('ACH2','OSCAR CHAVEZ',' ROSA BART','COCKY CHAVEZ BART','VILLA LOS ANGELES PSJ10','M','71451240','758741');

insert into cliente values('ACH3','WILFREDO CASSAS','JENNY RAMOS','ELENA CASSAS RAMOS','AV.UNIVERSITARIA CUADRA15','F','75021364','784561');

insert into cliente values('ACH4','JOSHY BERTO','LUCIANA SANTOS','LIZ BERTO SANTOS','PUENTE PIEDRA  CUADRA 4 ','F','75014782','145687');

insert into cliente values('ACH5','LUAN PACHECO','LILIANO PORTOCARRERO','SHEN PACHECO PORTOCARRERO','AV.ARGENTINA CUADRA 13','M','7501468','625418');

insert into cliente values('ACH6','VICTOR GARRIDO','GISELA RAMOS','LIZBETH GARRIDO RAMOS','LOS RAMOS URBLOS FLORES PARTE II','F','75014568','6147832');

insert into cliente values('ACH7','VLADIMIR PASSARA','GLORIA PAUCAR','HANSON PASSARA PAUCAR','LOS OLIVOS CUADRA NARANJAL','M','724653','6541879');

insert into cliente values('ACH8','JORGE ESTRELLA','LIZ SANCHEZ','EDSON ESTRELLA SANCHEZ','JR.CHICLAYO 2405','M','75024788','945781');

insert into cliente values('ACH9','SERGIO YANS','JESSICA HURTADO','BOX YANS HURTADO','JR.PASCUAR LOS MOLINOS','M','7954871','164578213');

insert into cliente values('AC10','SHUAN BOCA','SHYNTIA HUARACA','CARLOS ESPINOZA TERESA','JR.COMAS 247','M','615478932','1245879');

insert into cliente values('ACH1','JORGE ESPINOZA','MARIA TERESA','CARLOS ESPINOZA TERESA','JR.CHICLAYO 2405','M','71381504','752105');

insert into cliente values('ACH2','OSCAR CHAVEZ',' ROSA BART','COCKY CHAVEZ BART','VILLA ANGELES PSJ10','M','71451240','758741');

insert into cliente values('ACH3','WILFREDO CASSAS','JENNY RAMOS','ELENA CASSAS RAMOS','AV.UNIVE CUADRA15','F','75021364','784561');

insert into cliente values('ACH4','JOSHY BERTO','LUCIANA SANTOS','LIZ BERTO SANTOS','PUENTE PIEDRA  CUADRA 4 ','F','75014782','145687');

insert into cliente values('ACH5','LUAN PACHECO','LILIANO PORTOCARRERO','SHEN PACHECO PORTOCARRERO','AV.ARGENTINA CUADRA 13','M','7501468','625418');

insert into cliente values('ACH6','VICTOR GARRIDO','GISELA RAMOS','LIZBETH GARRIDO RAMOS','LOS RAMOS URBLOS FLORES PARTE II','F','75014568','6147832');

insert into cliente values('ACH7','VLADIMIR PASSARA','GLORIA PAUCAR','HANSON PASSARA PAUCAR','LOS OLIVOS NARANJAL','M','724653','6541879');

insert into cliente values('ACH8','JORGE ESTRELLA','LIZ SANCHEZ','EDSON ESTRELLA SANCHEZ','JR.CHICL 2405','M','75024788','945781');

insert into cliente values('ACH9','SERGIO YANS','JESSICA HURTADO','BOX YANS HURTADO','JR.PASCUAR ','M','7954871','164578213');

insert into cliente values('AC10','SHUAN BOCA','SHYNTIA HUARACA','CARLOS ESPINOZA TERESA','JR.COMAS ','M','615478932','1245879');

insert into cliente values('ACH2','OSCAR CHAVEZ',' ROSA BART','COCKY CHAVEZ ','VILLA ANGELES PSJ10','M','71451240','758741');

insert into cliente values('ACH2','OSCAR CHAVEZ','ROSA BART','COCKY CHAVEZ ','VILLA ANGELES PSJ10','M','71451240','758741');

insert into cliente values('ACb2','OSCAR CHAVEZ','ROSA BART','COCKY CHAVEZ ','VILLA ANGELES PSJ10','M','71451240','758741');

insert into cliente values('ACb2','OSCAR CHAVEZ','ROSA BART','COCKY CHAVEZ ','VILLA ANGELES PSJ10','M','71451240','758741');

insert into cliente values('ACC3','WILFREDO CASSAS','JENNY RAMOS','ELENA CASSAS RAMOS','AV.UNIVE CUADRA15','F','75021364','784561');

insert into cliente values('ACD4','JOSHY BERTO','LUCIANA SANTOS','LIZ BERTO SANTOS','PUENTE PIEDRA  CUADRA 4 ','F','75014782','145687');

insert into cliente values('ACO5','LUAN PACHECO','LILIANO PORTOCARRERO','SHEN PACHECO PORTOCARRERO','AV.ARGENTINA CUADRA 13','M','7501468','625418');

insert into cliente values('ACP6','VICTOR GARRIDO','GISELA RAMOS','LIZBETH GARRIDO RAMOS','LOS RAMOS URBLOS FLORES PARTE II','F','75014568','6147832');

insert into cliente values('ACQ7','VLADIMIR PASSARA','GLORIA PAUCAR','HANSON PASSARA PAUCAR','LOS OLIVOS NARANJAL','M','724653','6541879');

insert into cliente values('ACR8','JORGE ESTRELLA','LIZ SANCHEZ','EDSON ESTRELLA SANCHEZ','JR.CHICL 2405','M','75024788','945781');

insert into cliente values('ACS9','SERGIO YANS','JESSICA HURTADO','BOX YANS HURTADO','JR.PASCUAR ','M','7954871','164578213');

insert into cliente values('AT10','SHUAN BOCA','SHYNTIA HUARACA','CARLOS ESPINOZA TERESA','JR.COMAS ','M','615478932','1245879');

select*from cliente;

insert into cliente values('Ay1','JORGE ESPINOZA','MARIA TERESA','CARLOS ESPINOZA ','JR.CHICLAYO 2405','M','71381504','752105');

insert into cliente values('rT10','SHUAN BOCA','SHYNTIA HUARACA','CARLOS ESPINOZA TERESA','JR.COMAS ','M','615478932','1245879');

insert into cliente values('rT10','SHUAN BOCA','SHYNTIA HUARACA','CARLOS BOCA','JR.COMAS ','M','615478932','1245879');

insert into cliente values('rT10','SHUAN BOCA','SHYNTIA HUARACA','CARLOS BOCA','JR.COMAS ','M','615478932','1245879');

select*from cliente;

insert into cliente values('rT11','SHUAN BOCA','SHYNTIA HUARACA','CARLOS BOCA','JR.COMAS','M','61547893','195879');

insert into empleado values ('AX54','ROJAS','SIFUENTES','MAX','NRANJOS ALTURA 44','145789','24/JUNE/1975');

insert into empleado values ('AT15','HOYOS','MOROLOCO','EDWIN','LA MOLINA CUADRA5','2415687','17/JULY/1984');

insert into empleado values ('AM89','CASCAS','VICENTE','LUX','IZAGUIRRE CUADRA 21 AL COSTADO DEL GRIFO LIMAS','214850','18/MAY/1986');

insert into empleado values ('IU76','OROZO','HIERRO','SHAIN',' LOS PALOMARES CUADRA16','154879','07/DECEMBER/1980');

insert into empleado values ('OP15','VILLU','PAREDES','LANDY','JESSICA','1287651','12/AUGUST/1976');

insert into empleado values ('AN14','VIRTRA','ESPEJO','LARA','VILLA MONTES 22','184733','01/FEBRUARY/1985');

insert into empleado values ('ML65','CHOCHO','REYES','DANIEL','SAN ISIDRO CUADRA.GOLF','4517832','26/SEPTEMBER/1988');

insert into empleado values ('JS14','AMPUERO','GARCIA','LORD','PUENTE PIEDRA CUADRA 55','4786587','15/OCTOBER/1982');

insert into empleado values ('KG16','EZQUERRE','VIDAURRE','LESLIE','AV UNIVERSITARIA CUADRA 22','7841564','13/NOVEMBER/1981');

insert into empleado values ('OF32','BUSTOS','VERA','JANN','EL SOL CUADRA SAN ISIDRO','2415687','17/JANUARY/1977');

insert into empleado values ('AS89','CASCAS','VICENTE','LUX','IZAGUIRRE CUADRA 21 AL COSTADO DEL GRIFO LIMAS','214850','18/MAY/1986');

insert into empleado values ('AS89','CASCAS','VICENTE','LUX','IZAGUIRRE CUADRA 21 GRIFO LIMAS','214850','18/MAY/1986');

insert into comprobante_pago values('jj7','F','Ay1','AX54','14/FEBRUARY/2018',1500);

insert into comprobante_pago values('xm4','B','ACb2','AT15','16/JANUARY/2018',1420);

insert into comprobante_pago values('eu9','B','ACC3','AS89','12/APRIL/2018',1300);

insert into comprobante_pago values('rk5','B','ACD4','IU76','10/AUGUST/2018',110);

insert into comprobante_pago values('ut3','F','ACO5','OP15','09/SEPTEMBER/2018',2500);

insert into comprobante_pago values('aq6','F','ACP6','AN14','04/JUNE/2018',4400);

insert into comprobante_pago values('xd3','B','ACQ7','ML65','22/MAY/2018',480);

insert into comprobante_pago values('xf6','B','ACR8','JS14','26/DECEMBER/2018',3600);

insert into comprobante_pago values('df9','F','ACS9','KG16','10/AUGUST/2018',8500);

insert into comprobante_pago values('gj6','F','rT11','OF32','11/FEBRUARY/2018',10000);


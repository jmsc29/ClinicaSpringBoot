INSERT INTO medicos (nombre, apellidos, telefono, especialidad) VALUES ("Juan", "García", "654654645", "Neumología");
INSERT INTO medicos (nombre, apellidos, telefono, especialidad) VALUES ("Antonio", "Castro", "694584243", "Cardiología");
INSERT INTO medicos (nombre, apellidos, telefono, especialidad) VALUES ("Roberto", "Santiago", "678765121", "Urología");
INSERT INTO medicos (nombre, apellidos, telefono, especialidad) VALUES ("Lucía", "Ramos", "690879613", "Pediatría");
INSERT INTO medicos (nombre, apellidos, telefono, especialidad) VALUES ("Ulises", "Mora", "640900361", "Traumatología");
INSERT INTO medicos (nombre, apellidos, telefono, especialidad) VALUES ("María", "Jiménez", "626783401", "Dermatología");

INSERT INTO pacientes (nombre, apellidos, direccion, poblacion, provincia, codigo_postal, telefono, fecha_nacimiento) VALUES ("Rodrigo", "Guevara", "C/ Nueva, nº 3", "Córdoba", "Córdoba", "14005", "654893276", "1990-10-22");
INSERT INTO pacientes (nombre, apellidos, direccion, poblacion, provincia, codigo_postal, telefono, fecha_nacimiento) VALUES ("Marina", "González", "C/ Dávila, nº 5", "Sevilla", "Sevilla", "15005", "634634581", "1986-11-15");
INSERT INTO pacientes (nombre, apellidos, direccion, poblacion, provincia, codigo_postal, telefono, fecha_nacimiento) VALUES ("Cristina", "Muñoz", "C/ Max Aub, nº 32", "Cádiz", "Cádiz", "16005", "603869173", "1989-02-18");
INSERT INTO pacientes (nombre, apellidos, direccion, poblacion, provincia, codigo_postal, telefono, fecha_nacimiento) VALUES ("Adolfo", "López", "C/ Juan Vigón, nº 13", "Burgos", "Burgos", "17005", "600037264", "1992-06-02");
INSERT INTO pacientes (nombre, apellidos, direccion, poblacion, provincia, codigo_postal, telefono, fecha_nacimiento) VALUES ("Alejandro", "Canales", "C/ Plaza del Rastrillo, nº 9", "Toledo", "Toledo", "14005", "610109489", "2002-06-07");
INSERT INTO pacientes (nombre, apellidos, direccion, poblacion, provincia, codigo_postal, telefono, fecha_nacimiento) VALUES ("Antonio", "Sánchez", "C/ Poeta Blas, nº 26", "Madrid", "Madrid", "20005", "654301993", "1978-09-29");
INSERT INTO pacientes (nombre, apellidos, direccion, poblacion, provincia, codigo_postal, telefono, fecha_nacimiento) VALUES ("Iván", "Fernández", "C/ Guillermo Rovirosa, nº 46", "Alcorcón", "Alcorcón", "25005", "655638241", "1999-10-30");
INSERT INTO pacientes (nombre, apellidos, direccion, poblacion, provincia, codigo_postal, telefono, fecha_nacimiento) VALUES ("Miguel", "Pérez", "C/ Primero de Octubre, nº 1", "Pamplona", "Pamplona", "24005", "627278420", "1993-12-31");
INSERT INTO pacientes (nombre, apellidos, direccion, poblacion, provincia, codigo_postal, telefono, fecha_nacimiento) VALUES ("Marta", "Ruiz", "C/ Capitán Cortés, nº 35", "Granada", "Granada", "34005", "610166763", "1994-04-5");
INSERT INTO pacientes (nombre, apellidos, direccion, poblacion, provincia, codigo_postal, telefono, fecha_nacimiento) VALUES ("Inmaculada", "Hernández", "C/ General Fanjul, nº 17", "Almería", "Almería", "12005", "629928537", "1990-08-19");

INSERT INTO ingresos (num_habitacion, cama, fecha_ingreso, codigo_medico, codigo_paciente) VALUES ("13", "1", "2022-01-10", 1, 1);
INSERT INTO ingresos (num_habitacion, cama, fecha_ingreso, codigo_medico, codigo_paciente) VALUES ("17", "2", "2022-02-20", 2, 2);
INSERT INTO ingresos (num_habitacion, cama, fecha_ingreso, codigo_medico, codigo_paciente) VALUES ("19", "1", "2022-02-15", 3, 3);
INSERT INTO ingresos (num_habitacion, cama, fecha_ingreso, codigo_medico, codigo_paciente) VALUES ("20", "2", "2022-01-04", 4, 4);
INSERT INTO ingresos (num_habitacion, cama, fecha_ingreso, codigo_medico, codigo_paciente) VALUES ("26", "1", "2021-10-12", 5, 5);
INSERT INTO ingresos (num_habitacion, cama, fecha_ingreso, codigo_medico, codigo_paciente) VALUES ("22", "2", "2021-12-08", 6, 6);
INSERT INTO ingresos (num_habitacion, cama, fecha_ingreso, codigo_medico, codigo_paciente) VALUES ("04", "1", "2021-11-14", 1, 7);
INSERT INTO ingresos (num_habitacion, cama, fecha_ingreso, codigo_medico, codigo_paciente) VALUES ("19", "2", "2021-09-18", 3, 8);
INSERT INTO ingresos (num_habitacion, cama, fecha_ingreso, codigo_medico, codigo_paciente) VALUES ("30", "1", "2021-10-27", 5, 9);
INSERT INTO ingresos (num_habitacion, cama, fecha_ingreso, codigo_medico, codigo_paciente) VALUES ("25", "2", "2021-11-30", 6, 10);
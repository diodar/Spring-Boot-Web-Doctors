CREATE DATABASE demo_db;


CREATE TABLE IF NOT EXISTS clinics
( id INTEGER NOT NULL AUTO_INCREMENT,
  image VARCHAR(255) NOT NULL,
  name VARCHAR(255) NOT NULL,
  description VARCHAR(255) NOT NULL,
  address VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO
	clinics (image, name, description, address)
VALUES
    ('odrex.jpg', 'ODREX', 'Leading private clinic of the south of Ukraine.', 'Odesa, 69/71, Rozkidailivska Str.'),
	('into_sana.jpg', 'INTO-SANA', 'A modern medical center that provides a wide range of services.', 'Odesa, 2, Varnenska Str.'),
	('asl.jpg', 'OFFICE OF THE FAMILY DOCTOR', 'Modern network of medical centers in Odesa.', 'Odesa, 72a, Ak.Korolyova Str.');


CREATE TABLE IF NOT EXISTS doctors
( id INTEGER NOT NULL AUTO_INCREMENT,
  image VARCHAR(255) NOT NULL,
  name VARCHAR(255) NOT NULL,
  specialization VARCHAR(255) NOT NULL,
  phone VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO
	doctors (image, name, specialization, phone)
VALUES
	('dr_2.jpg', 'Dr. Alexa Stevens', 'Dermatologist', '555 199 74 86'),
	('dr_1.jpg', 'Dr. Peter Brenson', 'Surgeon', '555 387 55 33'),
	('dr_3.jpg', 'Dr. Yana Kocherzhynska-Halis', 'Therapist', '555 099 25 26');
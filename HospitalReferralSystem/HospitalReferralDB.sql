CREATE DATABASE hospital_referral_db;

CREATE TABLE IF NOT EXISTS hospital (
	_id INT PRIMARY KEY AUTO_INCREMENT,
	referring_hospital_name VARCHAR(100) NOT NULL,
    destination_hospital_name VARCHAR(100)NOT NULL,
    ref_hosp_address VARCHAR(50) NOT NULL,
    referring_unit VARCHAR (100)
);

CREATE TABLE IF NOT EXISTS patient (
	id INT PRIMARY KEY AUTO_INCREMENT,
	patient_name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    sex VARCHAR(50) NOT NULL,
    clinical VARCHAR(100) NOT NULL,
    _id INT NOT NULL,
    FOREIGN KEY (_id)
    REFERENCES hospital (_id)
    
);

CREATE TABLE IF NOT EXISTS hospital_user (
id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(100) NOT NULL DEFAULT 'Mr NoName',
last_name VARCHAR(100) NOT NULL DEFAULT 'Unknown',
email VARCHAR(100) UNIQUE NOT NULL,
user_password VARCHAR(100) NOT NULL,
hospital_role VARCHAR(100) NOT NULL DEFAULT 'Healthcare Worker'
);



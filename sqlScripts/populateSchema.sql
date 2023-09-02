-- populate doctors

-- Insert the first doctor
INSERT INTO PERSON (FISCAL_CODE, NAME, SURNAME, DATE_OF_BIRTH, SEX, EMAIL, PHONE_NUMBER, IMAGE_PATH)
VALUES ('RSSMRA85L15A123A', 'Roberto', 'Rossi', '1985-07-15', 'M', 'roberto.rossi@bbh.it', '3201234567', 'doctor1.jpg');

-- Retrieve the automatically generated person_id of the new doctor
SET @doctor1_person_id = LAST_INSERT_ID();

-- Insert the first doctor into the DOCTOR table
INSERT INTO DOCTOR (SPECIALIZATION, PASSWORD, PERSON_ID)
VALUES ('Neurologist', 'pwd' ,@doctor1_person_id);


-- Insert the second doctor
INSERT INTO PERSON (FISCAL_CODE, NAME, SURNAME, DATE_OF_BIRTH, SEX, EMAIL, PHONE_NUMBER, IMAGE_PATH)
VALUES ('VRDGPP80A01F205V', 'Paolo', 'Verdi', '1980-01-01', 'M', 'paolo.verdi@bbh.it', '3409876543', 'doctor2.jpg');

-- Retrieve the automatically generated person_id of the new doctor
SET @doctor2_person_id = LAST_INSERT_ID();

-- Insert the second doctor into the DOCTOR table
INSERT INTO DOCTOR (SPECIALIZATION, PASSWORD, PERSON_ID)
VALUES ('Neurologist', 'pwd' , @doctor2_person_id);


-- Insert the third doctor
INSERT INTO PERSON (FISCAL_CODE, NAME, SURNAME, DATE_OF_BIRTH, SEX, EMAIL, PHONE_NUMBER, IMAGE_PATH)
VALUES ('MRSVNA75C45G897K', 'Anna', 'Maresca', '1975-03-12', 'F', 'anna.maresca@bbh.it', '3488765432', 'doctor3.jpg');

-- Retrieve the automatically generated person_id of the new doctor
SET @doctor3_person_id = LAST_INSERT_ID();

-- Insert the third doctor into the DOCTOR table
INSERT INTO DOCTOR (SPECIALIZATION, PASSWORD, PERSON_ID)
VALUES ('Neurologist', 'pwd' , @doctor3_person_id);





-- populate patients

INSERT INTO PERSON (FISCAL_CODE, NAME, SURNAME, DATE_OF_BIRTH, SEX, EMAIL, PHONE_NUMBER, IMAGE_PATH)
VALUES ('FDRPLS95A15H987T', 'Marco', 'Pellegrini', '1995-08-20', 'M', 'marco.pellegrini@outlook.it', '3209876543', 'patient1.jpg');
SET @patient1_person_id = LAST_INSERT_ID();
INSERT INTO PATIENT (MEDICAL_CONDITION, WEIGHT, COUNTRY, PERSON_ID, DOCTOR_ID)
VALUES ('Hypertension', 75, 'IT', @patient1_person_id, 1); -- Assign Doctor ID 1 to Patient 1

INSERT INTO PERSON (FISCAL_CODE, NAME, SURNAME, DATE_OF_BIRTH, SEX, EMAIL, PHONE_NUMBER, IMAGE_PATH)
VALUES  ('HKLPTY88B25L218U', 'Lucas', 'Blancs', '1988-11-15', 'M', 'lucas.blancs@gmail.com', '3337894561', 'patient2.jpg');
SET @patient2_person_id = LAST_INSERT_ID();
INSERT INTO PATIENT (MEDICAL_CONDITION, WEIGHT, COUNTRY, PERSON_ID, DOCTOR_ID)
VALUES ('Diabetes', 81, 'FR', @patient2_person_id, 2); -- Assign Doctor ID 2 to Patient 2

INSERT INTO PERSON (FISCAL_CODE, NAME, SURNAME, DATE_OF_BIRTH, SEX, EMAIL, PHONE_NUMBER, IMAGE_PATH)
VALUES ('GNRMRN88T62F205H', 'Matteo', 'Gentile', '1988-07-12', 'M', 'matteo.gentile@outlook.it', '3389098765', 'patient3.jpg');
SET @patient3_person_id = LAST_INSERT_ID();
INSERT INTO PATIENT (MEDICAL_CONDITION, WEIGHT, COUNTRY, PERSON_ID, DOCTOR_ID)
VALUES ('Infections', 72, 'IT', @patient3_person_id, 1); -- Assign Doctor ID 1 to Patient 3

INSERT INTO PERSON (FISCAL_CODE, NAME, SURNAME, DATE_OF_BIRTH, SEX, EMAIL, PHONE_NUMBER, IMAGE_PATH)
VALUES ('LMROFR84C49D432L', 'Francesca', 'Lombardi', '1964-06-15', 'F', 'francesca.lombardi@gmail.com', '3208765432', 'patient4.jpg');
SET @patient4_person_id = LAST_INSERT_ID();
INSERT INTO PATIENT (MEDICAL_CONDITION, WEIGHT, COUNTRY, PERSON_ID, DOCTOR_ID)
VALUES ('Allergies', 64, 'IT', @patient4_person_id, 3); -- Assign Doctor ID 3 to Patient 4

INSERT INTO PERSON (FISCAL_CODE, NAME, SURNAME, DATE_OF_BIRTH, SEX, EMAIL, PHONE_NUMBER, IMAGE_PATH)
VALUES ('MRAGLL95C51H612B', 'Silvia', 'Morini', '1995-03-25', 'F', 'silvia.morini@aruba.it', '3487654321', 'patient5.jpg');
SET @patient5_person_id = LAST_INSERT_ID();
INSERT INTO PATIENT (MEDICAL_CONDITION, WEIGHT, COUNTRY, PERSON_ID, DOCTOR_ID)
VALUES ('Asthma', 66, 'IT', @patient5_person_id, 3); -- Assign Doctor ID 3 to Patient 5

INSERT INTO PERSON (FISCAL_CODE, NAME, SURNAME, DATE_OF_BIRTH, SEX, EMAIL, PHONE_NUMBER, IMAGE_PATH)
VALUES ('LLRDNL97H16H501K', 'Hannah', 'Lorenzi', '1990-08-16', 'F', 'hannah.lorenzi@gmail.com', '3398765432', 'patient6.jpg');
SET @patient6_person_id = LAST_INSERT_ID();
INSERT INTO PATIENT (MEDICAL_CONDITION, WEIGHT, COUNTRY, PERSON_ID, DOCTOR_ID)
VALUES ('Headaches', 68, 'DE', @patient6_person_id, 2); -- Assign Doctor ID 2 to Patient 6

INSERT INTO PERSON (FISCAL_CODE, NAME, SURNAME, DATE_OF_BIRTH, SEX, EMAIL, PHONE_NUMBER, IMAGE_PATH)
VALUES ('SCNLMR02P65F205V', 'Marco', 'Sacco', '2002-09-20', 'M', 'marco.sacco@aruba.it', '3204567890', 'patient7.jpg');
SET @patient7_person_id = LAST_INSERT_ID();
INSERT INTO PATIENT (MEDICAL_CONDITION, WEIGHT, COUNTRY, PERSON_ID, DOCTOR_ID)
VALUES ('Asthma', 75, 'IT', @patient7_person_id, 2); -- Assign Doctor ID 2 to Patient 7

INSERT INTO PERSON (FISCAL_CODE, NAME, SURNAME, DATE_OF_BIRTH, SEX, EMAIL, PHONE_NUMBER, IMAGE_PATH)
VALUES ('SLCNRA89T10D501P', 'Dario', 'Salerno', '1969-12-10', 'M', 'dario.salerno@outlook.it', '3318765432', 'patient8.jpg');
SET @patient8_person_id = LAST_INSERT_ID();
INSERT INTO PATIENT (MEDICAL_CONDITION, WEIGHT, COUNTRY, PERSON_ID, DOCTOR_ID)
VALUES ('Diabetes', 84, 'IT', @patient8_person_id, 1); -- Assign Doctor ID 1 to Patient 8

INSERT INTO PERSON (FISCAL_CODE, NAME, SURNAME, DATE_OF_BIRTH, SEX, EMAIL, PHONE_NUMBER, IMAGE_PATH)
VALUES ('MRCMRC99B25Z200A', 'Caterina', 'Marconi', '1999-02-25', 'F', 'caterina.marconi@gmail.com', '3209876123', 'patient9.jpg');
SET @patient9_person_id = LAST_INSERT_ID();
INSERT INTO PATIENT (MEDICAL_CONDITION, WEIGHT, COUNTRY, PERSON_ID, DOCTOR_ID)
VALUES ('Infections', 61, 'IT', @patient9_person_id, 2); -- Assign Doctor ID 2 to Patient 9


INSERT INTO PERSON (FISCAL_CODE, NAME, SURNAME, DATE_OF_BIRTH, SEX, EMAIL, PHONE_NUMBER, IMAGE_PATH)
VALUES ('MRLMRC97T20H501T', 'Lorenzo', 'Moretti', '1997-10-20', 'M', 'lorenzo.moretti@outlook.it', '3487654321', 'patient10.jpg');
SET @patient10_person_id = LAST_INSERT_ID();
INSERT INTO PATIENT (MEDICAL_CONDITION, WEIGHT, COUNTRY, PERSON_ID, DOCTOR_ID)
VALUES ('Hypertension', 75, 'IT', @patient10_person_id, 3); -- Assign Doctor ID 3 to Patient 10








-- populate measurements

-- Measurements for Patient 1 (Marco Pellegrini)
INSERT INTO MEASUREMENT (M_TIMESTAMP, M_TYPE, CSV_PATH, PATIENT_ID)
VALUES
  (TIMESTAMP '2023-07-07 08:45:00', 'BRAINWAVES', 'dataset_6.csv', 1),
  (TIMESTAMP '2023-07-08 09:30:00', 'BRAINWAVES', 'dataset_7.csv', 1);

-- Measurements for Patient 2 (Luca Bianchi)
INSERT INTO MEASUREMENT (M_TIMESTAMP, M_TYPE, CSV_PATH, PATIENT_ID)
VALUES
  (TIMESTAMP '2023-07-07 10:15:00', 'BRAINWAVES', 'dataset_0.csv', 2),
  (TIMESTAMP '2023-07-08 11:30:00', 'BRAINWAVES', 'dataset_1.csv', 2),
  (TIMESTAMP '2023-07-09 12:45:00', 'BRAINWAVES', 'dataset_2.csv', 2),
  (TIMESTAMP '2023-07-10 14:00:00', 'BRAINWAVES', 'dataset_3.csv', 2);

-- Measurements for Patient 3 (Matteo Gentile)
INSERT INTO MEASUREMENT (M_TIMESTAMP, M_TYPE, CSV_PATH, PATIENT_ID)
VALUES
  (TIMESTAMP '2023-07-07 15:30:00', 'BRAINWAVES', 'dataset_4.csv', 3),
  (TIMESTAMP '2023-07-08 16:45:00', 'BRAINWAVES', 'dataset_5.csv', 3),
  (TIMESTAMP '2023-07-09 18:00:00', 'BRAINWAVES', 'dataset_6.csv', 3);

-- Measurements for Patient 4 (Francesca Lombardi)
INSERT INTO MEASUREMENT (M_TIMESTAMP, M_TYPE, CSV_PATH, PATIENT_ID)
VALUES
  (TIMESTAMP '2023-07-11 08:30:00', 'BRAINWAVES', 'dataset_7.csv', 4),
  (TIMESTAMP '2023-07-12 09:15:00', 'BRAINWAVES', 'dataset_0.csv', 4);

-- Measurements for Patient 5 (Silvia Morini)
INSERT INTO MEASUREMENT (M_TIMESTAMP, M_TYPE, CSV_PATH, PATIENT_ID)
VALUES
  (TIMESTAMP '2023-07-11 10:00:00', 'BRAINWAVES', 'dataset_1.csv', 5),
  (TIMESTAMP '2023-07-12 11:30:00', 'BRAINWAVES', 'dataset_2.csv', 5),
  (TIMESTAMP '2023-07-13 12:45:00', 'BRAINWAVES', 'dataset_3.csv', 5);

-- Measurements for Patient 6 (Hannah Lorenzi)
INSERT INTO MEASUREMENT (M_TIMESTAMP, M_TYPE, CSV_PATH, PATIENT_ID)
VALUES
  (TIMESTAMP '2023-07-11 14:15:00', 'BRAINWAVES', 'dataset_4.csv', 6),
  (TIMESTAMP '2023-07-12 15:30:00', 'BRAINWAVES', 'dataset_5.csv', 6);

-- Measurements for Patient 7 (Marco Sacco)
INSERT INTO MEASUREMENT (M_TIMESTAMP, M_TYPE, CSV_PATH, PATIENT_ID)
VALUES
  (TIMESTAMP '2023-07-11 16:45:00', 'BRAINWAVES', 'dataset_6.csv', 7),
  (TIMESTAMP '2023-07-12 18:00:00', 'BRAINWAVES', 'dataset_7.csv', 7),
  (TIMESTAMP '2023-07-13 19:15:00', 'BRAINWAVES', 'dataset_0.csv', 7);

-- Measurements for Patient 8 (Dario Salerno)
INSERT INTO MEASUREMENT (M_TIMESTAMP, M_TYPE, CSV_PATH, PATIENT_ID)
VALUES
  (TIMESTAMP '2023-07-11 09:30:00', 'BRAINWAVES', 'dataset_1.csv', 8),
  (TIMESTAMP '2023-07-12 10:45:00', 'BRAINWAVES', 'dataset_2.csv', 8),
  (TIMESTAMP '2023-07-13 12:00:00', 'BRAINWAVES', 'dataset_3.csv', 8);

-- Measurements for Patient 9 (Caterina Marconi)
INSERT INTO MEASUREMENT (M_TIMESTAMP, M_TYPE, CSV_PATH, PATIENT_ID)
VALUES
  (TIMESTAMP '2023-07-11 13:15:00', 'BRAINWAVES', 'dataset_4.csv', 9),
  (TIMESTAMP '2023-07-12 14:30:00', 'BRAINWAVES', 'dataset_5.csv', 9),
  (TIMESTAMP '2023-07-13 15:45:00', 'BRAINWAVES', 'dataset_6.csv', 9),
  (TIMESTAMP '2023-07-14 17:00:00', 'BRAINWAVES', 'dataset_7.csv', 9);

-- Measurements for Patient 10 (Lorenzo Moretti)
INSERT INTO MEASUREMENT (M_TIMESTAMP, M_TYPE, CSV_PATH, PATIENT_ID)
VALUES
  (TIMESTAMP '2023-07-11 18:15:00', 'BRAINWAVES', 'dataset_0.csv', 10),
  (TIMESTAMP '2023-07-12 19:30:00', 'BRAINWAVES', 'dataset_1.csv', 10);




-- End of script

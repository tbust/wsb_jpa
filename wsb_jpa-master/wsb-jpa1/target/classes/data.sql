insert into address (id, address_line1, address_line2, city, postal_code) values
(1, 'ul. Daszynskiego', '23/16', 'Wroclaw', '45-573'),
(2, 'ul. Wolna', '8d', 'Warszawa', '04-908'),
(3, 'ul. Dębowa', 2, 'Opole', '46-020'),
(4, 'ul. Klonowa', '17/2', 'Kielce', '25-001'),
(5, 'ul. Sosnowa', '3/6', 'Minsk Mazowiecki', '42-216');


insert into patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth,address_id,height) values
(1, 'Janina', 'Okalska', '524296206', 'janina@gmail.com', 'P123456', '1980-06-05' ,1,1.52),
(2, 'Igor', 'Kowalski', '782657295', 'igor@gmail.com', 'P654321', '1990-02-10' ,2,1.80);

insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id) values
(1, 'Kamil', 'Steinbach', '52052502', 'kamik@gmail.com', 'D123', 'SURGEON', 3),
(2, 'Grazyna', 'Nowak', '87205820', 'grazka@gmail.com', 'D32', 'OCULIST',4 );

insert into visit (id, description, time, doctor_id, patient_id) values
(1, 'Brain surgery', '2024-02-10 12:00:00', 1,1),
(2, 'Eye ache', '2024-04-02 09:30:00', 2,2);
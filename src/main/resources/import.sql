insert into role (authority) values ('ROLE_ADMIN');
insert into role (authority) values ('ROLE_USER');
insert into users (username, password, name, email, mobile, enabled) values ('admin', '5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8', 'Administrator', 'admin@ring2park.com', '0887712345678', 1);
insert into users (username, password, name, email, mobile, enabled) values ('fred', '5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8', 'Fred Flintstone', 'fred@flintstones.com', '07777123123123', 1);
insert into users (username, password, name, email, mobile, enabled) values ('barney', '5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8', 'Barney Rubble', 'barney@flinstones.com', '0778845645677', 0);
insert into user_role (user_username, roles_authority) values ('admin', 'ROLE_ADMIN');
insert into user_role (user_username, roles_authority) values ('fred', 'ROLE_USER');
insert into user_role (user_username, roles_authority) values ('barney', 'ROLE_USER');
insert into location (location_id, price, currency, name, address, city, state, zip, country) values (1, 25.00, 'GBP', 'Heathrow Airport', 'Terminal 1', 'Houslow', 'Middlesex', 'TW6 1NJ', 'UK');
insert into location (location_id, price, currency, name, address, city, state, zip, country) values (2, 25.00, 'GBP', 'Heathrow Airport', 'Terminal 4', 'Hillingdon', 'Greater London', 'TW6 3', 'UK');
insert into location (location_id, price, currency, name, address, city, state, zip, country) values (3, 15.00, 'GBP', 'Gatwick Airport', 'South Terminal', 'Gatwick', 'West Sussex', 'RH6 0RN', 'UK');
insert into location (location_id, price, currency, name, address, city, state, zip, country) values (4, 20.00, 'USD', 'John F. Kennedy Airport', 'Van Wyck Expy', 'Queens', 'NY', '11422', 'USA');
insert into location (location_id, price, currency, name, address, city, state, zip, country) values (5, 20.00, 'USD', 'Washington Dulles International Airport', 'A', 'Washington', 'DC', '20041', 'USA');
insert into location (location_id, price, currency, name, address, city, state, zip, country) values (6, 20.00, 'USD', 'W Hotel', 'Union Square, Manhattan', 'NY', 'NY', '10011', 'USA');
insert into location (location_id, price, currency, name, address, city, state, zip, country) values (7, 15.00, 'USD', 'Hotel Rouge', '1315 16th Street NW', 'Washington', 'DC', '20036', 'USA');
insert into location (location_id, price, currency, name, address, city, state, zip, country) values (8, 10.00, 'USD', 'Conrad Miami', '1395 Brickell Ave', 'Miami', 'FL', '33131', 'USA');
insert into location (location_id, price, currency, name, address, city, state, zip, country) values (9, 8.00,  'USD', 'Super 8 Eau Claire Campus Area', '1151 W Macarthur Ave', 'Eau Claire', 'WI', '54701', 'USA');
insert into location (location_id, price, currency, name, address, city, state, zip, country) values (10, 12.00, 'USD', 'Marriot Downtown', '55 Fourth Street', 'San Francisco', 'CA', '94103', 'USA');
insert into location (location_id, price, currency, name, address, city, state, zip, country) values (11, 15.00, 'EUR', 'Hilton Diagonal Mar', 'Passeig del Taulat 262-264', 'Barcelona', 'Catalunya', '08019', 'Spain');
insert into location (location_id, price, currency, name, address, city, state, zip, country) values (12, 10.00, 'ILS', 'Hilton Tel Aviv', 'Independence Park', 'Tel Aviv', 'A', '63405', 'Israel');
insert into location (location_id, price, currency, name, address, city, state, zip, country) values (13, 20.00, 'JPY', 'InterContinental Tokyo Bay', 'Takeshiba Pier', 'Tokyo', 'A', '105', 'Japan');
insert into location (location_id, price, currency, name, address, city, state, zip, country) values (14, 15.00, 'CHF', 'Hotel Beaulac', ' Esplanade Lzopold-Robert 2', 'Neuchatel', 'A', '2000', 'Switzerland');
insert into location (location_id, price, currency, name, address, city, state, zip, country) values (15, 10.00, 'USD', 'Conrad Treasury Place', 'William George Street', 'Brisbane', 'QLD', '4001', 'Australia');
insert into location (location_id, price, currency, name, address, city, state, zip, country) values (16, 12.00, 'CAD', 'Ritz Carlton', '1228 Sherbrooke St', 'West Montreal', 'Quebec', 'H3G1H6', 'Canada');
insert into location (location_id, price, currency, name, address, city, state, zip, country) values (17, 8.00,  'USD', 'Ritz Carlton', 'Peachtree Rd, Buckhead', 'Atlanta', 'GA', '30326', 'USA');
insert into location (location_id, price, currency, name, address, city, state, zip, country) values (18, 10.00, 'AUD', 'Swissotel', '68 Market Street', 'Sydney', 'NSW', '2000', 'Australia');
insert into location (location_id, price, currency, name, address, city, state, zip, country) values (19, 12.00, 'USD', 'Hotel Allegro', '171 West Randolph Street', 'Chicago', 'IL', '60601', 'USA');
insert into vehicle (id, username, license, brand, color, preferred) values (1, 'fred', 'ABC 123', 'Land Rover', 'Black', 0);
insert into vehicle (id, username, license, brand, color, preferred) values (2, 'fred', 'DEF 456', 'Alfa Romeo', 'Red', 1);
insert into vehicle (id, username, license, brand, color, preferred) values (3, 'barney', 'GHJ 789', 'Fiat', 'White', 1);
insert into payment_card (id, username, card_number, type, expiry_month, expiry_year, preferred) values (1, 'fred', '1234567812345678', 'VISA', 1, 2015, 1);
insert into payment_card (id, username, card_number, type, expiry_month, expiry_year, preferred) values (2, 'barney', '8765432187654321', 'AMEX', 12, 2015, 1);
CREATE TABLE role (
  authority varchar(40) NOT NULL,
  PRIMARY KEY (authority)
);

CREATE TABLE users (
  username varchar(255) NOT NULL,
  email varchar(255) DEFAULT NULL,
  enabled NUMBER(3) NOT NULL,
  mobile varchar(255) DEFAULT NULL,
  name varchar(255) DEFAULT NULL,
  password varchar(255) DEFAULT NULL,
  verify_code varchar(255) DEFAULT NULL,
  PRIMARY KEY (username),
  CONSTRAINT email UNIQUE (email),
  CONSTRAINT mobile UNIQUE (mobile)
);

CREATE TABLE user_role (
  user_username varchar(255) NOT NULL,
  roles_authority varchar(40) NOT NULL,
  PRIMARY KEY (user_username,roles_authority),
  CONSTRAINT fk_user_username FOREIGN KEY (user_username) REFERENCES users (username)
);

CREATE INDEX idx_role_username ON user_role (user_username);

CREATE TABLE location (
  location_id number(20) NOT NULL,
  address varchar(255) NOT NULL,
  city varchar(255) NOT NULL,
  country varchar(255) NOT NULL,
  currency varchar(3) DEFAULT NULL,
  name varchar(255) NOT NULL,
  price decimal(4,2) DEFAULT NULL,
  state varchar(255) NOT NULL,
  zip varchar(255) NOT NULL,
  PRIMARY KEY (location_id)
);

CREATE TABLE payment_card (
  id number(20) NOT NULL,
  address varchar(255) DEFAULT NULL,
  country varchar(255) DEFAULT NULL,
  county varchar(255) DEFAULT NULL,
  expiry_month number(11) NOT NULL,
  expiry_year number(11) NOT NULL,
  card_number varchar(255) DEFAULT NULL,
  postal_code varchar(255) DEFAULT NULL,
  preferred number(3) NOT NULL,
  state varchar(255) DEFAULT NULL,
  type varchar(255) DEFAULT NULL,
  username varchar(255) DEFAULT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_payment_user FOREIGN KEY (username) REFERENCES users (username)
);

CREATE TABLE vehicle (
  id number(20) NOT NULL,
  brand varchar(255) NOT NULL,
  color varchar(255) NOT NULL,
  license varchar(255) DEFAULT NULL,
  preferred number(3) NOT NULL,
  username varchar(255) DEFAULT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_vehicle_user FOREIGN KEY (username) REFERENCES users (username)
);

CREATE TABLE booking (
  id number(20) NOT NULL,
  confirmation number(3) NOT NULL,
  end_date timestamp DEFAULT NULL,
  formatted_id varchar(255) DEFAULT NULL,
  reminder number(3) NOT NULL,
  start_date timestamp DEFAULT NULL,
  card number(20) DEFAULT NULL,
  location number(20) DEFAULT NULL,
  username varchar(255) DEFAULT NULL,
  vehicle number(20) DEFAULT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_booking_user FOREIGN KEY (username) REFERENCES users (username),
  CONSTRAINT fk_booking_location FOREIGN KEY (location) REFERENCES location (location_id),
  CONSTRAINT fk_booking_vehicle FOREIGN KEY (vehicle) REFERENCES vehicle (id),
  CONSTRAINT fk_booking_card FOREIGN KEY (card) REFERENCES payment_card (id)
);
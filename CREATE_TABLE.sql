CREATE TABLE PersonalInformation
( person_id int,
  gender varchar(10),
  first_name varchar(50),
  last_name varchar(50),
  ID_card_num int,
  PRIMARY KEY (person_id)
);

CREATE TABLE Place
( place_id int,
  city varchar(50),
  country varchar(50),
  PRIMARY KEY (place_id)
);

CREATE TABLE Address
( place_id int,
  street_name varchar(50),
  number int,
  floor double,
  distinct Boolean,
  village Boolean,
  PRIMARY KEY (place_id)
);

CREATE TABLE locates
( place_id int,
  apartment_id int,
  PRIMARY KEY (apartment_id) 
);

CREATE TABLE Apartment
( id int,
  property_id int,
  description varchar(50),
  price int,
  PRIMARY KEY (id)
);

CREATE TABLE Vehicle
( id int,
  property_id int,
  description varchar(50),
  price int,
  PRIMARY KEY (id)
);

CREATE TABLE Motorcycle
( id int,
  property_id int,
  description varchar(50),
  price int,
  PRIMARY KEY (id)
);

CREATE TABLE Property
( property_id int,
  type varchar(20),
  description varchar(50),
  price int,
  PRIMARY KEY (property_id)
);

CREATE TABLE own
( person_id int,
  property_id int,
  PRIMARY KEY (property_id)
);

CREATE TABLE manufacturedTime
( property_id int,
  date_id int,
  PRIMARY KEY (property_id)
);

CREATE TABLE purchasedTime
( property_id int,
  person_id int,
  date_id int,
  PRIMARY KEY (property_id, person_id)
);

CREATE TABLE currentResidence
( person_id int,
  apartment_id int,
  start_date_id int,
  PRIMARY KEY (person_id, start_date_id)
);

CREATE TABLE previousResidence
( person_id int,
  apartment_id int,
  start_date_id int,
  end_date_id int,
  PRIMARY KEY (person_id, apartment_id, start_date_id, end_date_id)
);

CREATE TABLE Job
( job_id int,
  position varchar(50),
  PRIMARY KEY (job_id)
);

CREATE TABLE manage
( boss_id int,
  worker_id int,
  PRIMARY KEY (boss_id, worker_id)
);

CREATE TABLE Company
( c_id int,
  name varchar(50),
  PRIMARY KEY (c_id)
);

CREATE TABLE Offer
( c_id int,
  job_id int,
  start_date_id int,
  end_date_id int,
  current Boolean,
  PRIMARY KEY (job_id)
);

CREATE TABLE work
( salary int,
  person_id int,
  job_id int,
  PRIMARY KEY (person_id, job_id)
);

CREATE TABLE Marriage
( male_id int,
  female_id int,
  date_id int,
  current_marriage Boolean,
  divorce Boolean,
  ID int,
  PRIMARY KEY (ID)
);

CREATE TABLE marriageLocation
( ID int,
  place_id int,
  PRIMARY KEY (ID)
);

CREATE TABLE Date
( date_id int,
  order_date date,
  PRIMARY KEY (date_id) 
);

CREATE TABLE Birth
( person_id int,
  date_id int,
  mom_id int,
  dad_id int,
  PRIMARY KEY (person_id)
);

CREATE TABLE bornPlace
( person_id int,
  place_id int,
  PRIMARY KEY (person_id)
);

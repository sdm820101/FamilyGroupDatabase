create table PERSONALINFORMATION (
	personid int PRIMARY KEY,
	firstname varchar(30),
	lastname varchar(30),
	gender varchar(6),
	cityofbirth varchar(30),
	countryofbirth varchar(30),
	dateofbirth date,
	marriagestatus varchar(8),
	idnumber int
);

create table RESIDENCE (
	residenceid int PRIMARY KEY,
	ownerid int,
	street varchar(50),
	number int,
	appartment int,
	building varchar(10),
	county varchar(30),
	village varchar(30),
	district varchar(30),
	postcode int,
	city varchar(30),
	state varchar(30),
	country varchar(30),
	
	foreign key(ownerid)
	references PERSONALINFORMATION(personid) 
	on delete set null
);

create table LIVINGPLACE (
	residentid int NOT NULL,
	residenceid int NOT NULL,
	dateofarrival date NOT NULL,
	dateofleaving date,
	
	primary key (residentid, dateofarrival),
	
	foreign key(residentid)
	references PERSONALINFORMATION(personid) 
	on delete cascade,
	
	foreign key(residenceid)
	references RESIDENCE(residenceid) 
	on delete cascade
);

create table FAMILYLINK (
	memberid1 int UNIQUE NOT NULL,
	memberid2 int UNIQUE NOT NULL,
	linkfrom2to1 varchar(8),
	
	primary key (memberid1, memberid2),
	
	foreign key(memberid1)
	references PERSONALINFORMATION(personid) 
	on delete cascade,
	
	foreign key(memberid2)
	references PERSONALINFORMATION(personid) 
	on delete cascade
);

create table JOB (
	workerid int,
	jobname varchar(30) NOT NULL,
	dateofbeginning date NOT NULL,
	dateofend date,
	companyname varchar(30) NOT NULL,
	addressid int,
	salarypermonth int,
	bossid int,
	
	primary key (workerid, dateofbeginning),
	
	foreign key(workerid)
	references PERSONALINFORMATION(personid) 
	on delete cascade,
	
	foreign key(bossid)
	references PERSONALINFORMATION(personid) 
	on delete set null,
	
	foreign key(addressid)
	references RESIDENCE(residenceid) 
	on delete set null
);

create table PROPERTY (
	propertyid int,
	ownerid int,
	propertyaddressid int,
	type varchar(17),
	description varchar(140),
	timeofpurchase date,
	timeofmanufacture date,
	buyingprice int,
	
	primary key (propertyid),
	
	foreign key(ownerid)
	references PERSONALINFORMATION(personid) 
	on delete set null,
	
	foreign key(propertyaddressid)
	references RESIDENCE(residenceid) 
	on delete cascade
);

create table MARRIAGE (
	spouseid1 int UNIQUE,
	spouseid2 int UNIQUE,
	dateofmarriage date,
	dateofdivorce date,
	cityofmarriage varchar(30),
	countryofmarriage varchar(30),
	
	primary key (spouseid1, spouseid2, dateofmarriage)
	
	foreign key(spouseid1)
	references PERSONALINFORMATION(personid) 
	on delete cascade,
	
	foreign key(spouseid2)
	references PERSONALINFORMATION(personid) 
	on delete cascade
);

create view work_record (
	select workerid, companyname, jobname, extract(year FROM dateofbeginning), extract(year FROM dateofend) FROM JOB
	WHERE JOB.workerid = ?
);
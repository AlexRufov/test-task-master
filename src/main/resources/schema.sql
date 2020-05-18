create table CAR (
  id IDENTITY primary key,
  brand VARCHAR2(150),
  model VARCHAR2(200),
  power DOUBLE,
  year_of_issue YEAR
);

create table AIRPLANE (
  id IDENTITY primary key,
  brand VARCHAR2(150),
  model VARCHAR2(200),
  manufacturer VARCHAR2(500),
  year_of_issue YEAR,
  fuelCapacity INT,
  seats INT
);

create table ASSESSED_VALUE(
  id MEDIUMINT NOT NULL AUTO_INCREMENT,
  collateral_type VARCHAR(100),
  evaluation_date date,
  assessed_value DEC(20)
);
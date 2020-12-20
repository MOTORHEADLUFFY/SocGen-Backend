
DROP TABLE IF EXISTS EMPLOYEE;

CREATE TYPE genderType AS ENUM('M','F','T');


CREATE TABLE EMPLOYEE(
   ID  SERIAL PRIMARY KEY,
   FIRST_NAME VARCHAR (20) NOT NULL CHECK (length(FIRST_NAME) > 0),
   LAST_NAME VARCHAR (20)  NOT NULL CHECK (length(LAST_NAME) > 0),
   GENDER genderType  NOT NULL      CHECK (length(GENDER) > 0),
  	DEPARTMENT VARCHAR (20)  NOT NULL CHECK (length(DEPARTMENT) > 0),    
	DATE_OF_BIRTH DATE NOT NULL     CHECK (length(DATE_OF_BIRTH) > 0)
);

    insert into
        employee
        (id, date_of_birth, department, first_name, gender, last_name) 
    values
        (null, '2020-12-19', 'Right-Wing', 'Lionel','M', 'Messi'),
        (null, '2020-10-2', 'Left-Wing', 'Cristiano','M', 'Ronaldo'),
        (null, '2019-5-22', 'GoalKeeper', 'Thibaut','M', 'Courtios'),
        (null, '2017-05-06', 'Striker', 'Timo','M', 'Werner'),
        (null, '2012-11-08', 'Striker', 'Kim','F', 'Hunter');
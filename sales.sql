DROP SCHEMA IF EXISTS course;
CREATE SCHEMA IF NOT EXISTS course;

USE course;

DROP TABLE IF EXISTS salesTable;
CREATE TABLE salesTable(  
  transanctionID INT,
  customerID	INT,  
  transanctionAmount		INT,  
  date		VARCHAR(35),
  CONSTRAINT pk_sal PRIMARY KEY (transanctionID ) 
  );
  
INSERT INTO salesTable
VALUES
(1,13, 23, '2021-06-01'),
(2, 13, 51, '2021-06-16'),
(3,13, 76, '2021-06-25'),
(4, 13, 231, '2021-06-27'),
(5,13, 41, '2021-07-01'),
(6,13, 63, '2021-07-18'),
(7,13, 178, '2021-07-29'),
(8,13, 23, '2021-08-01'),
(9,12, 51, '2021-06-01'),
(10,12, 78, '2021-06-15'),
(11,12, 133, '2021-06-29'),
(12,12,287, '2021-07-08'),
(13,12, 23, '2021-07-15'),
(14,12, 5, '2021-08-06'),
(15,12, 23, '2021-08-19'),
(16,12, 75, '2021-08-13'),
(17,11, 23, '2021-06-01'),
(18,11, 57, '2021-06-02'),
(19,11, 110, '2021-06-09'),
(20,11, 61, '2021-06-21'),
(21,11, 51, '2021-07-03'),
(22,11, 123, '2021-07-18'),
(23,11, 341, '2021-07-21'),
(24,11, 23, '2021-08-01'),
(25,11, 63, '2021-08-03'),
(26,11, 51, '2021-08-05'),
(27,14, 323, '2021-06-18'),
(28,14, 13, '2021-06-22'),
(29,14, 123, '2021-07-21'),
(30,14, 53, '2021-08-12'),
(31,15, 2, '2021-07-21'),
(32,16, 23, '2021-06-01'),
(33,16, 23, '2021-06-01'),
(34,16, 23, '2021-06-01'),
(35,16, 23, '2021-06-01'),
(36,17, 23, '2021-06-01'),
(37,17, 23, '2021-06-01'),
(38,18, 85, '2021-08-19'),
(39,18, 21, '2021-08-22'),
(40,19, 51, '2021-07-29');

SELECT * FROM salesTable  order by transanctionID ;
--Question: 1
CREATE TABLE mt
(eid NUMBER(3),
ename VARCHAR2(30),
salary NUMBER(8,2),
hire_date DATE,
address VARCHAR2(100)
);

--Question: 2
ALTER TABLE mt
ADD CONSTRAINT eid_mt_pk PRIMARY KEY(eid);

--Question: 3
ALTER TABLE mt
ADD (phone VARCHAR2(15), job_title VARCHAR2(30));

--Question: 4
INSERT INTO mt
VALUES (&eid, &ename, &salary, &hire_date, &address, &phone, &job_title);

--Question: 5
SELECT ename, job_title, salary, salary+(salary*.3)
FROM mt;

--Question: 6
SELECT ename, salary
FROM mt
WHERE salary =(SELECT MIN(salary)
			FROM mt
			);

--Question: 7
UPDATE mt
SET job_title = 'Manager';

--Question: 8
CREATE OR REPLACE TRIGGER tr_1
BEFORE UPDATE ON mt
FOR EACH ROW
BEGIN
	dbms_output.put_line('Be AWERE before updating!');
END;
/

SET SERVEROUTPUT ON SIZE 30000;

CREATE OR REPLACE PROCEDURE pr_1
AS
BEGIN
	DECLARE
		x NUMBER := 15;
		y NUMBER := 10;
		z NUMBER := 0;
	BEGIN
		z := x + y;
		dbms_output.put_line('Result of procedure is '||z);
	END;
END;
/

EXECUTE pr_1;

CREATE OR REPLACE FUNCTION f_1
RETURN NUMBER IS
	x NUMBER := 15;
	y NUMBER := 10;
	z NUMBER := 0;
BEGIN
	z := x + y;
	RETURN z;
END;
/

BEGIN
	dbms_output.put_line('Result of function is '||f_1);
END;
/

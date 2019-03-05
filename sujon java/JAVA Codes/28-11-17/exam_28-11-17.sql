--Question 1:
CREATE TABLE emp1240090
(wid NUMBER(2) PRIMARY KEY,
wname VARCHAR2(30),
wsalary NUMBER(8,2),
whire_date DATE,
waddress VARCHAR2(100)
);

--Question 2:
ALTER TABLE emp1240090
ADD(department_id NUMBER(4), dept_name VARCHAR2(30));

--Question 3:
CREATE OR REPLACE TRIGGER tr_1
BEFORE INSERT ON emp1240090
FOR EACH ROW
BEGIN
	dbms_output.put_line('You inserted a row!');
END;
/

CREATE SEQUENCE seq_1
INCREMENT BY 1
START WITH 10;

INSERT INTO emp1240090
VALUES (seq_1.nextval, 'Mamun', 15000.00, SYSDATE, 'Uttara', 1201, 'AAAA');

INSERT INTO emp1240090
VALUES (seq_1.nextval, 'Jamal', 15500.00, SYSDATE, 'Uttara', 1202, 'BBBB');

INSERT INTO emp1240090
VALUES (seq_1.nextval, 'Kasem', 15600.00, SYSDATE, 'Mirpur', 1203, 'CCCC');

INSERT INTO emp1240090
VALUES (seq_1.nextval, 'Ratul', 15700.00, SYSDATE, 'Jatrabari', 1204, 'DDDD');

INSERT INTO emp1240090
VALUES (seq_1.nextval, 'Karim', 15800.00, SYSDATE, 'Savar', 1205, 'EEEE');

INSERT INTO emp1240090
VALUES (seq_1.nextval, 'Jafar', 15800.00, SYSDATE, 'Savar', 1205, 'PPPP');

--Question 4:
SELECT department_id, AVG(wsalary)
FROM emp1240090
HAVING MAX(wsalary)>12000
GROUP BY department_id;

--Question 5:
CREATE VIEW v_1
AS SELECT wid, dept_name
FROM emp1240090
WHERE department_id = 1202;

--Question 6:
CREATE OR REPLACE PROCEDURE pr_1
AS
BEGIN
	DECLARE
		x NUMBER := 5;
		y NUMBER := 5;
		z NUMBER := 0;
	BEGIN
		z := x + y;
		dbms_output.put_line('Result is = '|| z);
	END;
END;
/

EXECUTE pr_1;

CREATE OR REPLACE FUNCTION f_1
RETURN number IS
	x NUMBER := 5;
	y NUMBER := 5;
	z NUMBER := 0;
BEGIN
	z := x + y;
	RETURN z;
END;
/

BEGIN
	dbms_output.put_line(f_1());
END;
/

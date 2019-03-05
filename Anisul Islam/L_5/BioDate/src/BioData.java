
	create table com(id number(5), fname varchar2(25), lname varchar2(25));
	create or replace procedure insert_com(
	c_id in com.id%type,
	c_fname in com.fname%type,
	c_lname in com.lname%type)
	is
	begin
	insert into com(id, fname, lname)
	valuses(c_id, c_fname,c_lname);
	commit;
	end;
	/
	
	begin
	com_insert(100, 'showkat', 'ali');
	end;
	/
	
	
	CREATE OR REPLACE PROCEDURE insert_com(
	c_id IN COM.id%TYPE,
	c_fname IN COM.fname%TYPE,
	c_lname IN COM.lname%TYPE)
	IS
	BEGIN
	insert into com(id, fname, lname)
	valuses(c_id, c_fname,c_lname);
	COMMIT;
	END;
	/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
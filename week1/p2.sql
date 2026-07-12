CREATE OR REPLACE PROCEDURE add_numbers (
   a IN NUMBER,
   b IN NUMBER
)
AS
   result NUMBER;
BEGIN
   result := a + b;
   DBMS_OUTPUT.PUT_LINE('Sum = ' || result);
END;
/
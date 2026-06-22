SET SERVEROUTPUT ON;

DECLARE CURSOR c1 IS SELECT CustomerName, DueDate FROM Loans WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
    FOR rec in c1 LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Dear ' || rec.CustomerName || ', your loan is due on ' ||rec.DueDate);
    END LOOP;
END;
/
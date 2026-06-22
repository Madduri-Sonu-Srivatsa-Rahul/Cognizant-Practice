DECLARE CURSOR c IS SELECT CUSTOMERID,Age FROM CUSTOMERS;
BEGIN
    FOR rec IN c LOOP
        IF rec.Age > 60 THEN
            UPDATE CUSTOMERS
            SET INTERESTRATE = INTERESTRATE - 1
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;
    COMMIT;
END;
/
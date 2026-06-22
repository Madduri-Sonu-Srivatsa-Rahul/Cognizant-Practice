CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(bonus_percent IN NUMBER)
AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * bonus_percent / 100)
    WHERE Department = 'IT';

    COMMIT;
END;
/
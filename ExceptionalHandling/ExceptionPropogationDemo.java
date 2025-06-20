package CRT2025.ExceptionalHandling;

import java.sql.SQLException;

public class ExceptionPropogationDemo {
    public void p() throws SQLException{
        throw new SQLException("Exception in p()");
    }
    public void q() throws SQLException {
        p();
    }
    public void r() throws SQLException{
        q();
    }
    public static void main(String[] args) {
        ExceptionPropogationDemo obj = new ExceptionPropogationDemo();
        try {
            obj.r();
        }catch(Exception ex){
            System.out.println("Exception Propagate Successfully");
        }
    }
}

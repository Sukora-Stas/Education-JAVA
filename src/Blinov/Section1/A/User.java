package Blinov.Section1.A;

/**
 * Created by Sukora Stas.
 */
public class User {
    public int numericCode;//нарушение инкапсуляции
    private String password;

    public void setNumericCode(int value) {
        if (value > 0) numericCode = value;
        else numericCode = 1;
    }

    public int getNumericCode() {
        return numericCode;
    }

    public void setPassword(String pass) {
        if (pass != null) password = pass;
        else password = "11111";
    }

    public String getPassword() {
        return password;
    }
}

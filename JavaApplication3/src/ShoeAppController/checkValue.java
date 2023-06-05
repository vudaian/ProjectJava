package ShoeAppController;

import static com.microsoft.sqlserver.jdbc.StringUtils.isEmpty;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.regex.Pattern;
public class checkValue {
    //Kiểm tra dữ liệu nhập vào là số
    public static boolean checkNumber(String s) {
        if (isEmpty(s)) {
            return false;
        }
        final int sz = s.length();
        for(int i = 0; i < sz; i++) {
            if(!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    //Kiểm tra dữ liệu nhập vào là email
    public static boolean checkEmail(String emailString) {
        String emailRegex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                          + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern pat = Pattern.compile(emailRegex);
        if (emailString == null)
            return false;
        return pat.matcher(emailString).matches();
    }
    
    //Kiểm tra dữ liệu nhập vào là ngày, tháng, năm, hợp lệ
    public static boolean isValidDate(String userInput) {
        try {
            LocalDate inputDate = LocalDate.parse(userInput);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}

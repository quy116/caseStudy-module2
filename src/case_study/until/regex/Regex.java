package case_study.until.regex;

import java.time.LocalDate;
import java.time.Period;

public class Regex {
    private static final String VALIDATE_REGEX_CODENAME = "^KH-[0-9]{4}$";
    private static final String VALIDATE_REGEX_CODENAME_EMPLOYEE = "^NV-[0-9]{4}$";

    private static final String VALIDATE_REGEX_NAME = "^^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$$";

    private static final String VALIDATE_REGEX_DATE = "^[0-9]{4}-[0-9]{2}-[0-9]{2}$";

    private static final String VALIDATE_REGEX_ID = "^([0-9]{12}|[0-9]{9})$";

    private static final String VALIDATE_REGEX_TELEPHONE = "^0[0-9]{9}$";

    private static final String VALIDATE_REGEX_EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public static boolean checkRegexCodeNameCustomer(String codeName) {
        return codeName.matches(VALIDATE_REGEX_CODENAME) ? true : false;
    }
    public static boolean checkRegexCodeNameEmployee(String codeName) {
        return codeName.matches(VALIDATE_REGEX_CODENAME_EMPLOYEE) ? true : false;
    }

    public static boolean checkRegexName(String name) {
        return name.matches(VALIDATE_REGEX_NAME) ? true : false;
    }

    public static boolean checkOld(String date){
        return date.matches(VALIDATE_REGEX_DATE) ? true : false;
    }

    public static boolean checkRegexOld(String date) {
        if (checkOld(date)) {
            LocalDate localDate = LocalDate.parse(date);
            LocalDate localDateNow = LocalDate.now();
            return Period.between(localDate, localDateNow).getYears() >= 18;
        }
        return false;
    }

    public static boolean checkRegexId(String id) {
        return id.matches(VALIDATE_REGEX_ID) ? true : false;
    }

    public static boolean checkRegexTelephone(String telephone) {
        return telephone.matches(VALIDATE_REGEX_TELEPHONE) ? true : false;
    }

    public static boolean checkRegexEmail(String email) {
        return email.matches(VALIDATE_REGEX_EMAIL) ? true : false;
    }
}

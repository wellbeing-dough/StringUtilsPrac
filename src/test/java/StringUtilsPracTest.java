import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;

public class StringUtilsPracTest {

    @Test
    @DisplayName("문자열 속에 찾는 문자가 있는가")
    public void containsTest() {
        Assertions.assertTrue(StringUtils.contains("abcdefghijk", "abc"));
        Assertions.assertFalse(StringUtils.contains("abcdefg", "hijk"));
    }

    @Test
    @DisplayName("두 스트링이 동일한가")
    public void equalsTest() {
        Assertions.assertTrue(StringUtils.equals("kimdongwoo", "kimdongwoo"));
        Assertions.assertFalse(StringUtils.equals("kimdongwoo", "eunchae"));
    }

    @Test
    @DisplayName("소문자가 대문자로 바뀌는가")
    public void upperCaseTest() {
        String lowStr = "kimdongwoo";
        String upperStr = StringUtils.upperCase(lowStr);
        Assertions.assertTrue(StringUtils.equals("KIMDONGWOO", upperStr));
    }

    @Test
    @DisplayName("문자열의 앞뒤 순서가 바뀌는가")
    public void reverseTest() {
        String reverseStr = "esrever";
        String originalStr = StringUtils.reverse(reverseStr);
        Assertions.assertTrue(StringUtils.equals(originalStr, "reverse"));
    }

    @Test
    @DisplayName("문자열 좌우 공백이 제거 되는가")
    public void trimTest() {
        String str = " kimdongwoo ";
        String originalStr = StringUtils.trim(str);
        Assertions.assertTrue(StringUtils.equals(originalStr, "kimdongwoo"));
    }

}

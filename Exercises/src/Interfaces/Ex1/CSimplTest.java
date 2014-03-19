package Interfaces.Ex1;

import org.testng.annotations.Test;

public class CSimplTest {

    @Test
    public void testLength() {
        String s = "qwerty";
        CSimpl cs = new CSimpl(s);
        assert s.length() == cs.length();
        assert new CSimpl().length() == 0;
    }

    @Test
    public void testCharAt() {
        String s = "qwerty";
        int sLen = s.length();

        CSimpl cs = new CSimpl(s);

        for (int i = 0; i < sLen; i++) {
            assert cs.charAt(i) == s.charAt(sLen - i - 1);
        }

        try {
            cs.charAt(sLen);
            assert false : "IndexOutOfBoundsException expected";
        } catch (IndexOutOfBoundsException ignored) {
        } catch (Exception ex) {
            assert false : "Invalid exception type: " + ex;
        }

        try {
            cs.charAt(-1);
            assert false : "IndexOutOfBoundsException expected";
        } catch (IndexOutOfBoundsException ignored) {
        } catch (Exception ex) {
            assert false : "Invalid exception type: " + ex;
        }
    }

    @Test
    public void testSubSequence() throws Exception {

    }

    @Test
    public void testToString() {
        String direct = "qwerty";

        StringBuilder s = new StringBuilder(direct);
        String reverse = s.reverse().toString();

        CSimpl cs = new CSimpl(direct);
        assert cs.toString().equals(reverse);
    }
}

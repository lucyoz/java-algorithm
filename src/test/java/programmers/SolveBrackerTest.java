package programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveBrackerTest {

    @Test
    @DisplayName("괄호가 잘 풀리는지")
    void bracket() { //한글을 -> 영어로 : solve_bracket_return_boolean
        SolveBracker sb = new SolveBracker();
        assertTrue(sb.solution("()()"));
        assertTrue(sb.solution("(())()"));
        assertFalse(sb.solution(")()("));
        assertFalse(sb.solution("(()("));
        assertFalse(sb.solution("((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))"));
    }
}
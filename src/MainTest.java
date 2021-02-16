import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest(name = "{0} + {1} + {2} = {3}")
    @CsvSource({
            "0,  100,   150,   Not a triangle",
            "1,    100,   150, scalene",
            "100,    100,   150,   isosceles",
            "101,  100,   150,   scalene",
            "2,  100,   150,   scalene",
            "50,   149,   150,   scalene",
            "50,   150,   150,   isosceles",
            "50,   50,   150,   isosceles",
            "50,   51,   150,   scalene",
            "50,  100,   100,   isosceles",
            "50,  100,   101,   scalene",
            "50,  100,   149,   scalene",
            "50,  100,   150,   scalene",
            "50,  100,   199,   scalene",
            "50,  100,   200,   scalene",
            "50,  100,   201,   scalene",
            "50,  151,   150,   scalene",
            "50,  49,   150,   scalene",
            "99,   100,   150, scalene"
    })
    void triangleType(int a, int b, int c, String triangle) {
        Main main = new Main();
        assertEquals(triangle, main.triangleType(a, b, c),
                () -> a + "+" + b + "+" + "c" + "should be" + triangle);
    }
}
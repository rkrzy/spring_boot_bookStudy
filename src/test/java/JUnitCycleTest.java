import org.junit.jupiter.api.*;
import org.springframework.context.annotation.Bean;

public class JUnitCycleTest {

    @BeforeAll// 전체 테스트를 시작하기 전에 1회 실행한다.
    static void beforeAll(){
        System.out.println("@BeforeAll");
    }
    @BeforeEach//테스트 케이스를 시작하기 전마다 실행한다.
    public void beforeEach(){
        System.out.println("@BeforeEach");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
    @Test
    public void test3(){
        System.out.println("test3");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("@AfterAll");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("@AfterEach");
    }


}

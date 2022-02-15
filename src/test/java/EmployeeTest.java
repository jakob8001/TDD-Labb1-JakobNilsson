import org.junit.jupiter.api.*;

public class EmployeeTest {

    Employee TestObject1;


    @BeforeAll
    public static void beforeAll(){
        System.out.println("Testsvit påbörjad");
    }

    @AfterAll
    public static void aferAll(){
        System.out.println("testsvit avslutad");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("Slut: ");
    }

    @BeforeEach
    public void beforEach(){
        System.out.println("start");

        TestObject1 = new Employee("Jakob","Nilsson",33,30500.00);
    }

    @Test
    public void checkGetUniqueID(){
        int expected = 1;

        int actual = TestObject1.getUniqueID();


    }

}

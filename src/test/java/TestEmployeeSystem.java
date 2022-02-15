import org.junit.jupiter.api.*;

public class TestEmployeeSystem {
    Employee TestObject1;
    EmployeeSystem TestObjectSystem;


    @BeforeAll
    public static void beforeAll() {
        System.out.println("Testsvit påbörjad");
    }

    @AfterAll
    public static void aferAll() {
        System.out.println("testsvit avslutad");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Slut: ");
    }

    @BeforeEach
    public void beforEach() {
        System.out.println("start: ");

        TestObject1 = new Employee("Jakob", "Nilsson", 23, 30500.00);
        TestObjectSystem = new EmployeeSystem();
    }

    @Test
    public void checkGetEmployeeListTest() {
        int expected = 3;

        int actual = TestObjectSystem.getEmployeeList();
    }

}

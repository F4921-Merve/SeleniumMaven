package Day1_SeleniumMaven;

import org.junit.*;

public class C02_JunitAnnotations {
    //1.test
    //2.test
    //3.test
    //4.test (geliştirme aşamasında bu yüzden rapora dahil olmasın)
    //Her testimizden önce ve sonra çalışması gereken cod bloklarımız mevcut
    //Tüm testlerimizin öncesinde ve sonrasında çalışması gereken methodlar mevcur
    //        1. @Test -> Marks a method as a TEST CASE.
//        2. @Before : Runs before EACH @Test annotation.
//        3. @After : Runs after EACH @Test annotation.
//        4. @BeforeClass : Runs before each class only once.
//        5. @AfterClass : Runs after each class only once.
//        6. @Ignore : Skipping a test case.

    @Test
    public void test01() {
        System.out.println("1.Test yapılıyor");
    }
@Test
    public void test02() {
        System.out.println("2.Test yapılıyor");
    }
@Test
    public void test03() {
        System.out.println("3.Test yapılıyor");
    }


@Test
    @Ignore
    public void test04() {
        System.out.println("4.Test çalışma aşamasında");
    }
    @Before
    public void beforeEach(){
        System.out.println("method öncesi cod bloğu çalıştı");
    }
    @After
    public void afterEach() {
        System.out.println("method sonrası cod bloğu çalıştı");

    }
    @BeforeClass
    public  static void beforeAll(){
        System.out.println("method oncesındeki bloğu çalıştı");
    }
    @AfterClass
    public  static void afterAll(){
        System.out.println("method sonrasındaki cod bloğu çalıştı");
    }
}
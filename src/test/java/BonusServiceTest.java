import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.javaqamvn.services.RestCalculateService;

public class BonusServiceTest {
    @ParameterizedTest
  //  @CsvSource({
  //          "10000,3000,20000,3",
  //          "100000,60000,150000,2"
 //   })
    @CsvFileSource (files="src/test/resources/RestMonth.csv")
        void shouldCalculateForIncome10000(int income, int expenses, int threshold, int expected) {
        RestCalculateService service = new RestCalculateService();

        // подготавливаем данные:
        // int income = 10000;
        // int expenses = 3000;
        // int threshold = 20000;
        // int expected = 33333;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    void shouldCalculateForIncome10000() {
//        RestCalculateService service = new RestCalculateService();
//
//        // подготавливаем данные:
//        int income = 100000;
//        int expenses = 60000;
//        int threshold = 150000;
//
//        // вызываем целевой метод:
//        int restMonthCount = BonusServiceTest2(income, expenses, threshold);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        Assertions.assertEquals(expected, actual);
//    }
}


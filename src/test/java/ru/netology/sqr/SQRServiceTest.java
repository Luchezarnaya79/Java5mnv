package ru.netology.sqr;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

        @ParameterizedTest
       //@CsvSource({"3,300,200",
        //           "12,700,200"})

        @CsvFileSource(files = "src/test/resources/Range.csv")

        public void CalcSQRParam(int expected, int maxD, int minD) {
            SQRServise sqrServise = new SQRServise();
            // вызываем целевой метод:
            int actual = sqrServise.calculateSQR(maxD, minD);
            // производим проверку (сравниваем ожидаемый и фактический):
            Assertions.assertEquals(expected, actual);
        }
    
}

package com.springemployeecw;

import com.springemployeecw.models.EmployeeCalculations;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringEmployeeCwApplicationTests {
    
    @Test
    public void testWeeklyWage(){
         System.out.println("testWeeklyWage");
         EmployeeCalculations ec = new EmployeeCalculations();

         double expResult = 100;
         double result = ec.getWeeklyWage(10, 10);
            
         assertEquals(expResult, result);
    }

    @Test
    public void testEmpAverage() {
        System.out.println("testEmpAverage");
        EmployeeCalculations ec = new EmployeeCalculations();

        double expResult = 380;
        double result = ec.getEmpAverage(TestHelper.getTestList());

        assertEquals(expResult, result);

    }

    @Test
    public void testEmpMax(){

        System.out.println("testEmpMax");
        EmployeeCalculations ec = new EmployeeCalculations();

        double expResult = 420;
        double result = ec.getEmpMax(TestHelper.getTestList());

        assertEquals(expResult, result);
    }

    @Test
    public void testEmpMin(){

        System.out.println("testEmpMin");
        EmployeeCalculations ec = new EmployeeCalculations();

        double expResult = 340;
        double result = ec.getEmpMin(TestHelper.getTestList());

        assertEquals(expResult, result);
    }
}

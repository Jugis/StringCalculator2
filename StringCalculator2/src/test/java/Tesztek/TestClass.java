/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tesztek;

/**
 *
 * @author Pali
 */
import com.pipacorp.stringcalculator2.StringCalculator;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class TestClass {
    StringCalculator stringCalculatorTest;
    
    @Rule
    public ExpectedException amilyenKiveteltVarunk = ExpectedException.none();
    public String szoveg;
    
    @Before
    public void Kezdes(){
        //stringCalculatorTest = new StringCalculator();
    }
//    public TestClass(){
//       
//    }
    
    @Test
    public void uresString() throws Exception{
        stringCalculatorTest = new StringCalculator("",";");
        assertEquals(0, stringCalculatorTest.indit());
    }
    
    @Test
    public void egySzam() throws Exception{
        stringCalculatorTest = new StringCalculator("1",";");
        assertEquals(1, stringCalculatorTest.indit());
    }
    
    @Test
    public void ketSzam() throws Exception{
        stringCalculatorTest = new StringCalculator("2;3",";");
        assertEquals(5, stringCalculatorTest.indit());
    }
    @Test
    public void egyebEsetek() throws Exception{
        stringCalculatorTest = new StringCalculator("15;3",";");
        assertEquals(18, stringCalculatorTest.indit());
        //Már nem igazán tudom mit találhatnék ki... és tudom hogy az 1 paraméteres konstruktort is 
        //használhattam volna, de copypasteltem :D    
    }
    @Test
    public void masElvalaszto() throws Exception{
        stringCalculatorTest = new StringCalculator("2\n3","\n");
        assertEquals(5, stringCalculatorTest.indit());
        
    }
    @Test
    public void negativSzamok() throws Exception{
        stringCalculatorTest = new StringCalculator("-15;3",";");
        amilyenKiveteltVarunk.expect(Exception.class);
        amilyenKiveteltVarunk.expectMessage("No negatives![-15]");
        stringCalculatorTest.indit();
    }
    
}

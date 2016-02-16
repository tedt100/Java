package hw2;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Tester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Tester
{

    @Test
    public void test()
    {
        TaxCollector ruritania2015 = new TaxCollector();
        
        Citizen poorCitizen = new Citizen("Akalobo", "TK", 100, 3, false);
        ruritania2015.collect(poorCitizen);

        Citizen middleClassCitizen = new Citizen("Family Guy", "RF", 35000, 2, false);
        ruritania2015.collect(middleClassCitizen);

        Citizen richCitizen = new Citizen("Ronald Rump", "XA", 1000000, 1, false);
        ruritania2015.collect(richCitizen);
        
        Citizen expatCitizen = new Citizen("Ruhana", "NA", 75000, 2, true);
        ruritania2015.collect(expatCitizen);
        
        ruritania2015.displayCollectedTax();
    }
    
}



package hw2;
import java.util.*;
 

/**
 * Write a description of class TaxCollector here.
 * 
 * @author (RRS) 
 * @version (0.1)
 */
public class TaxCollector
{
    // total collected tax by the agency
    private double collectedTax;
    private ArrayList<Citizen> citizens;

    /**
     * Constructor for objects of class TaxCollector
     */
    public TaxCollector()
    {
        collectedTax = 0.0;
        citizens = new ArrayList<Citizen>();
    }

    /**
     * This method displays the total tax collected
     */
    public void displayCollectedTax() {
        System.out.println("Our beloved King, RRS has collected " + collectedTax + " this year");
    }    
    
    /**
     * this method
     * 1 computes income tax
     * 2 reduces income tax by deductions
     * 3 adds social services tax
     * 4 deducts the tax from the income of the citizen
     * 5 informs the citizen about the collected tax
     * 6 updates the total collected tax
     */
    public void collect(Citizen x)
    {
        if(newCitizen.getIncome()
        
        
    }
    
    
    //extra methods here
}

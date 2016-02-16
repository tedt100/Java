package hw2;
import java.util.*;

/**
 * Write a description of class Citizen here.
 * 
 * @author (RRS) 
 * @version (0.1)
 */
public class Citizen
{
    private static String name;
    private String state;
    private double income;
    private int dependents;
    private boolean expat;
    
    /**
     * Constructor for objects of class Citizen
     */
    public Citizen(String name1, String state1, double income1, int dependents1, boolean expat1)
    {
        name=name1;
        state=state1;
        income=income1;
        dependents=dependents1; 
        expat=expat1;
        
    }
    
    public String getName()
    {
       return name; 
    }
    
    public String getState()
    {
        return state;
    }
    
    public double getIncome()
    {
        return income;
    }
    
    public int getDependents()
    {
        return dependents;
    }
    
    public boolean getExpat()
    {
        return expat;
    }
    
    
}    

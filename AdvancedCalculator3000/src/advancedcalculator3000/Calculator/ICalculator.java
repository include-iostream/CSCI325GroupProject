/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedcalculator3000.Calculator;


import java.util.Scanner;



/**
 * Base calculator interface
 * 
 * @author Christian Hinkle
 */
public interface ICalculator
{
    /**
     * The name of this calculator.
     */
    public static String GetCalculatorName()
    {
        return "Calculator";
    }
    
    /**
     * Used to get this calculator set up for the user (for constant user
     * configurations regardless of the user's selection).
     * Good for BeginPlay-type logic.
     */
    public void InitialUserMenu(Scanner scanner);
    
    /** Print our calculator's options to the user */
    public void PrintUserMenu();
    
    /** 
     * Run calculations for the user based off of his given selection.
     * Also passes in a scanner in case extra user prompts are needed.
     */
    public void HandleUserMenu(Scanner scanner, char userSelection);
}

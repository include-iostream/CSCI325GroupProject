/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedcalculator3000.Calculator;

import java.util.Scanner;



/**
 * 
 * @author Christian Hinkle
 */
public class GeometryCalculator implements ICalculator
{
    private EShape shape;
    
    
    
    public GeometryCalculator()
    {
        shape = EShape.SHAPE_None;
    }
    
    
    //@Override
    public static String GetCalculatorName()
    {
        return "Geometry Calculator";
    }
    
    @Override
    public void InitialUserMenu(Scanner scanner)
    {
        System.out.println("Choose a shape to perform geometry on:");
        PrintShapesMenu();
        
        final char userShapeSelection = scanner.next().charAt(0);
        shape = EShape.GetShapeByCharacter(userShapeSelection);
    }
    
    @Override
    public void PrintUserMenu()
    {
        switch (shape)
        {
            case SHAPE_Box:
                
                break;
            case SHAPE_Sphere:
                
                break;
            case SHAPE_Triangle:
                
                break;
                
                
            default:
                break;
        }
    }
    @Override
    public void HandleUserMenu(Scanner scanner, char userSelection)
    {
        
    }
    
    
    private void PrintShapesMenu()
    {
        for (EShape shape : EShape.values())
        {
            if (shape == EShape.SHAPE_None)
            {
                continue;
            }
            System.out.println("'" + EShape.GetShapeCharacter(shape) + "' - " + shape.toString());
        }
    }
}
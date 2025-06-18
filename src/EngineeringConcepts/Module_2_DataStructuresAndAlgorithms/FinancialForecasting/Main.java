package EngineeringConcepts.Module_2_DataStructuresAndAlgorithms.FinancialForecasting;

import java.util.Scanner;

/*
Recursion : Recursion is a method where a function calls itself to solve a problem by breaking it into smaller subproblems.
Advantages of Recursion:
    - Simplifies code for problems that have repeating subproblems.
    - Natural fit for mathematical sequences and forecasting problems.

Method to calculate future value using recursive approach :
Using compound interest formula : Future Value = Present Value × (1 + r)^n
Recursive function calls :
    FV(n) = FV(n-1)*(1+growthRate)
    if n=0, FV(0) = initialAmt

Complexity analysis of implemented Recursive approach :
    - Time Complexity = O(N) -> Each year calculation depends on the previous year, forming a chain of n recursive calls.
    - Space Complexity = O(N) -> Auxiliary stack space

Optimization of this recursive approach :
The below recursive approach can be optimized using Memoization
Time complexity : O(N)
 */

public class Main {
    public static double predictFutureValue(double initialAmt,double growthRate,int years){
        // Base condition, if years is reduced to 0 then return the initialAmt
        if(years==0) return initialAmt;
        // Else call for previous year, with initialAmt increased by : initialAmt*(1+growthRate) and reducing the years by 1
        return predictFutureValue(initialAmt*(1+growthRate),growthRate,years-1);
    }
    public static void main(String[] args) {
        double initialAmt,growthRate;
        int years;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial amount : ");
        initialAmt=sc.nextDouble();
        System.out.print("Enter the annual growth : ");
        growthRate=sc.nextDouble();
        System.out.print("Enter the number of years : ");
        years=sc.nextInt();
        double predictedVal = predictFutureValue(initialAmt,growthRate,years);
        System.out.println("Future value after "+years+" : Rs."+String.format("%.2f",predictedVal));
    }
}

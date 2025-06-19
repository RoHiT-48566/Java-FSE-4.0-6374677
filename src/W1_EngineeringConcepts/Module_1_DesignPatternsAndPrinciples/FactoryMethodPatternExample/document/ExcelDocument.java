package W1_EngineeringConcepts.Module_1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.document;

public class ExcelDocument implements Document{
    @Override
    public void open() {
        System.out.println("Opening Excel Document...!");
    }
}

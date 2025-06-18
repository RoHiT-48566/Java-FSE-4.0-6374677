package EngineeringConcepts.Module_1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.document;

public class WordDocument implements Document{
    @Override
    public void open() {
        System.out.println("Opening Word Document...!");
    }
}

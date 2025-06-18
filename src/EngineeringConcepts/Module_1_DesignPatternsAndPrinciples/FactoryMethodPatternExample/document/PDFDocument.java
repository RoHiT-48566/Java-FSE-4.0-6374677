package EngineeringConcepts.Module_1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.document;

public class PDFDocument implements Document{
    @Override
    public void open() {
        System.out.println("Opening PDF Document...!");
    }
}

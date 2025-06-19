package W1_EngineeringConcepts.Module_1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.factory;

import W1_EngineeringConcepts.Module_1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.document.Document;
import W1_EngineeringConcepts.Module_1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.document.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory{
    public Document createDocument() {
        return new ExcelDocument();
    }
}

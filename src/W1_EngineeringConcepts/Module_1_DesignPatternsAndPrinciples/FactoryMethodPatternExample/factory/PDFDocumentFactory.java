package W1_EngineeringConcepts.Module_1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.factory;

import W1_EngineeringConcepts.Module_1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.document.Document;
import W1_EngineeringConcepts.Module_1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.document.PDFDocument;

public class PDFDocumentFactory extends DocumentFactory{
    public Document createDocument() {
        return new PDFDocument();
    }
}

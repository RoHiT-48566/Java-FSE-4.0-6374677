package EngineeringConcepts.Module_1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.factory;

import EngineeringConcepts.Module_1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.document.Document;
import EngineeringConcepts.Module_1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.document.PDFDocument;

public class PDFDocumentFactory extends DocumentFactory{
    public Document createDocument() {
        return new PDFDocument();
    }
}

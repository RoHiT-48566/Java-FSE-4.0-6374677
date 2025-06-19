package W1_EngineeringConcepts.Module_1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.factory;

import W1_EngineeringConcepts.Module_1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.document.Document;
import W1_EngineeringConcepts.Module_1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.document.WordDocument;

public class WordDocumentFactory extends DocumentFactory{
    public Document createDocument(){
        return new WordDocument();
    }
}

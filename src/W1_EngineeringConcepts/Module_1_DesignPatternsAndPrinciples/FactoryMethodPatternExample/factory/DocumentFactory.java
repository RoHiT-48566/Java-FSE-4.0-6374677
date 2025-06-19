package W1_EngineeringConcepts.Module_1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.factory;

import W1_EngineeringConcepts.Module_1_DesignPatternsAndPrinciples.FactoryMethodPatternExample.document.Document;

public abstract class DocumentFactory {
    public abstract Document createDocument();
}

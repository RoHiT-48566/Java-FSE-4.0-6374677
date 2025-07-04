package W1_EngineeringConcepts.Module_1_DesignPatternsAndPrinciples.SingletonPatternExample;

public class Logger {
    private static Logger instance;
    private Logger(){}
    public static Logger getInstance(){
        if(instance==null){
            instance = new Logger();
        }
        return instance;
    }
    public void log(String msg){
        System.out.println("[LOG] : "+msg);
    }
}

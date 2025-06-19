package W1_EngineeringConcepts.Module_1_DesignPatternsAndPrinciples.SingletonPatternExample;

public class Main {
    public static void main(String[] args) {
        //Logger log1 = new Logger(); -> Gives error since the constructor is private in Singleton Pattern
        Logger logger1 = Logger.getInstance();
        logger1.log("Message from first logger!");

        Logger logger2 = Logger.getInstance();
        logger2.log("Message from second logger!");

        if(logger1==logger2){
            System.out.println("Both logger instances are same, hence the Singleton Pattern is working!");
        }else{
            System.out.println("Logger instances are different, hence the Single Pattern failed!");
        }

    }
}

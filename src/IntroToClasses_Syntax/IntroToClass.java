package IntroToClasses_Syntax;
public class IntroToClass {
    public String field = ""; // fields are like constants/variables within a class

    public void method(){ // methods are similar to functions of a class 
        // to access fields of a class, we use `this`
        this.field = "value_general";
    }

    public void printFielValue(){
        System.out.println(this.field);
    }
}

//print("hello world")

public interface InterfaceGenerica {
    default void funcaoGenerica() {
        System.out.println("Opening_Interface_Method");
        class localClass implements InterfaceGenerica{
            //Aqui iria o codigo
        }
    }

    public class InnerClass implements InterfaceGenerica{
    
        public static void main(String[] args) {
            InterfaceGenerica inClass = new InnerClass();
            inClass.funcaoGenerica();
        }
    }
}

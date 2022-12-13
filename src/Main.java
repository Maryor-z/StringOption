public class Main {
    public static void main(String[] args) {
        String helloworld = "Hello" + " World";
        helloworld.concat(" and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");


        printInformation(helloworld);
        printInformation(helloWorldBuilder);
    }

    public static void printInformation(String string){
        System.out.println("String = " + string);
        System.out.println("length = " +string.length());
    }
    public static void printInformation(StringBuilder builder){
        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length());
    }

}

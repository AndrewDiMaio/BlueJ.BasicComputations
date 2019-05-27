 


public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        return Integer.toBinaryString(value);
    }

    public String printIntegerAsOctal(int value){
        String octal = new String();
        return octal.format("%o", value);
    }

    public String printIntegerAsHexadecimal(int value){
        String hex = new String();
        return hex.format("%h", value);
    }

    public static void main(String[] args){

    }
}

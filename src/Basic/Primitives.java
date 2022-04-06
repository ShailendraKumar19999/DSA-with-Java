package Basic;

public class Primitives {
    public static void main(String[] args) {
//        8 primitive data type
        int rollNumber = 100;
        char charType = 'C';

        float floatNumber = 20.5f;   // by default is double so need to add 'f' in  the last
        double doubleNumber = 235566788889775.5;

        long longNumber = 2526782627383623883L; // by default is int sO we need to add 'L' in the last
        short shortNumber = 12345;

        boolean condition = true;
        byte byteChar = 'b';
        System.out.println(rollNumber);

    }
}

//        byte	    1 byte	     -128 to 127
//        short	    2 bytes	     -32,768 to 32,767
//        int	    4 bytes	     -2,147,483,648 to 2,147,483,647 (-2^31 to (2^31)-1)
//        long	    8 bytes	     -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//        float	    4 bytes	     Sufficient for storing 6 to 7 decimal digits (-2^31 to (2^31)-1)
//        double    8 bytes      (-2^63 to (2^63)-1) Sufficient for storing 15 decimal digits
//        boolean	1 bit        Stores true or false values (size not defined)
//        char	    2 bytes	     Stores a single character/letter or ASCII values (0 to 65,535)
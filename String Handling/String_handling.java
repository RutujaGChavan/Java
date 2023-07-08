
public class String_handling {

    public static void main(String[] args) {
        //String class
        String S1 = "ABCD";
        System.out.println(S1);

        //craete object to char array
        char arr[] = {'A', 'B', 'C', 'D'};
        String S2 = new String(arr);
        System.out.println(S2);

        //create object by byte array
        byte arr2[] = {97, 98, 99, 100};
        String S3 = new String(arr2);
        System.out.println(S3);

        //length
        String S4 = "Hello World";
        int x = S4.length();
        System.out.println(x);

        //CharAt
        String S5 = "Rutuja Chavan";
        char ch = S5.charAt(0);
        System.out.println(S5);

        //tocharArray
        String S6 = "Rutuja Chavan";
        char arr3[] = S6.toCharArray();
        for (int i = 0; i < S6.length(); i++) {
            System.out.println(arr3[i]);
        }
        for (char c : arr) {
            System.out.println(c);
        }

        //getbytes
        String S7 = "Rutuja Chavan";
        byte arr4[] = S7.getBytes();
        for (byte b : arr4) {
            System.out.println(b);
        }

        //Indexof
        String S8 = "Rutuja Chavan";
        int z = S8.indexOf('u');
        System.out.println(z);
        z = -1;
        while (true) {
            z = S8.indexOf("u", z + 1);
            System.out.println(z);
            if (z == -1) {
                break;
            }
        }

        //lastindexof
        z = S8.lastIndexOf('u');
        System.out.println(z);

        //equals 
        String S9 = new String("Rutuja");
        String S10 = new String("Chavan");
        if (S9 == S10) {
            System.out.println("Equals");
        } else {
            System.out.println("not equals");
        }
        
        //Endwith
        String S11="Rutuja Chavan";
        System.out.println(S11.startsWith("R"));
         System.out.println(S11.startsWith("Ru")); 
         System.out.println(S11.startsWith("tuja"));
          System.out.println(S11.startsWith("Rutu"));
           System.out.println(S11.startsWith("Rutuja"));
        
           
           //cocate
           String S12="Rutuja";
           String S13="Chavan";
           String S14=S12+S13;
           System.out.println(S14);
           
           //Replace
           String S15="Rutuja Chavan";
           String S16=S15.replace("R","r");
           System.out.println(S16);
           
           //trim
           String S17="Rutuja";
           String S18="Rutuja";
           if(S17.equals(S18.trim())){
               System.out.println("equals");
           }
           else{
               System.out.println("not equals");
           }
           
           
          //touppercase
          String S20="rutuja chavan";
          String S21=S20.toUpperCase();
          System.out.println(S21);
          
          //tolowercase
          String S22="RUTUJA";
          String S23=S22.toLowerCase();
            System.out.println(S23);
            
            //substring
            String S24="Rutuja";
            String S25=S24.substring(2,4);
              System.out.println(S25);
    }
    
}



        
package giorno8.contatore;

public class Main {
    public static void main(String[] args) {



           char[] parola = {'a','e','i','o','u'};
           int c =0;

           for ( int i = 0 ; i < 50; i++){
               System.out.println(parola[c]);
               c++;
               if ( c > 4){
                   c=0;
               }
           }


        }

}

import java.util.*;
public class microsoftEasy {

    // arrayProductsign
    public static void arraySign(int num[]){
        int count = 0;
    for( int i = 0 ; i < num.length ; i++ ){
        if( num[i] == 0){
            System.out.println("0"); 
        }
        else if(num[i] <0){
            count++;
        }
    }
        if(count %2 ==1){
            System.out.println("-1");
        }
        else{
            System.out.println("1");
        }
    }

    // Palidrome
    public static void palidrome(int n){
        if(n<0){
            System.out.println("false");
        }
        int temp= n;
        int rev = 0;
        int rem ;
        while( n !=0){
            rem = n%10;
            rev = rev *10 + rem;
            n = n/10;
        }

        if( rev == temp){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }

    // valid palidrome
    public static boolean validPalid(String str){
        int start =0;
        int last = str.length() -1;
       
        while( start <= last){
            if( !Character.isLetterOrDigit(str.charAt(start))){
                start++;
            }
            else if( Character.isLetterOrDigit(str.charAt(last))){
                last--;
            }
            else if( Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(last))){
                return false;
            }else{
                start++;
                last--;
            }
        }
        return true;
    }
    // defance IP
    public String defangIP(String address){
        StringBuilder str = new StringBuilder();
        for( int i = 0 ; i < address.length();i++){
            if( address.charAt(i) == '.'){
                str.append("[.]");
            }else{
                str.append(address.charAt(i));
            }
        }
        return str.toString();
    }
public static void main(String args[]){
    int num[] = {-23,-34,5,0,5,54,3};
    // arraySign( num);

    int n = 11;
    // palidrome(n);

    String str = " A man , a plan , a canal: pananma";
    validPalid(str);

    

}
}
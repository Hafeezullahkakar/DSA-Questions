public class ReversString{

public static void main(String [] args){
    String s ="hafeez";
    char a[] = s.toCharArray();
    int back = a.length-1;
    for (int i =0; i<a.length/2; i++){
        char t = a[i];
        a[i] = a[back-i];
        a[back-i] = t;              
    }
    for (char c : a) {
        System.out.print(c);        
    }   
  }
}
import java.util.Scanner;

public class SieveOfErathosthenes {
    public static void main(String[] args) {
        
Scanner in = new Scanner(System.in);

System.out.println("How many numbers do you want in the array?");
int n = in.nextInt();

boolean [] array = new boolean[n+1]; 
for (int i = 2; i<=n; i++) {
    array[i]=true;
}
for (int i = 2; i<=n; i++){
 if (array[i] == true) {
    for (int j = i*i; j<n; j=j+i){
    array[j] = false;
    }
 }
 }
for (int i = 2; i<n; i++){
    if(array[i]=true){
        System.out.println(i);
    }
}
 }
}
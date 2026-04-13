import java.util.Scanner;

public class Sunrise {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter number of elements ");
        int n=scan.nextInt();;
        int[] arr =new int[n];
        System.out.println("Enter the elements:");
        for (int i=0;i<n;i++) {
            arr[i]=scan.nextInt();
        } 
        int flag=0;
        int first=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>first){
                flag++;
            }
        }
        System.out.println(flag+1);
    }
}

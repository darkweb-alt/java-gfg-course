package Week5;

public class countdigit {
    public static void main(String[] args) {
        int number=12345;
        int count=0;
        while(number/10 !=0){
            count=count+1;
        }
        System.out.println("The number of erms are: "+count);
    }
}

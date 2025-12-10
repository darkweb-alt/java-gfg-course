package Week5;

public class breakandcontinue {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println("Hello Pitambar");
            if(i==2){
                continue;
            }
        }
        int a=5;
        while(a<10){
            System.out.println("Yes Pitambar");
            a++;
            if (a==5){
                continue;
            }
            
        }
    }
}

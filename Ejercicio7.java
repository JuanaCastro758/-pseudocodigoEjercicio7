import java.util.*;
public class Ejercicio7{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        Random aleatorio=new Random();
        int cero=0, par=0,impar=0;
        for (int i=0;i<15;i++){
             int x=aleatorio.nextInt(16-0+1)+0;
             System.out.println(" "+x);
            if (x==0){
                cero++;
            }else if (x % 2==0){
                par++;
            }else{
                impar++;
            }
        }
        float p1=(cero*100)/15;
        float p2=(par*100)/15;
        float p3=(impar*100)/15;
        System.out.println(p1+"% de ceros");
        System.out.println(p2+"% de pares");
        System.out.println(p3+"% de impares");
    }
}
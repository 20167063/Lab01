import java.util.Arrays;
import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        double a,b;
        System.out.println("Nhap cac gia tri bien trong bieu thuc ax+b=0");
        System.out.printf("a = ");
        a = new Scanner(System.in).nextDouble();
        System.out.printf("b = ");
        b =  new Scanner(System.in).nextDouble();
        FirstDgreeEquation firstDgreeEquation = new FirstDgreeEquation(a,b);
        System.out.println(reslove(firstDgreeEquation));
    }
    public static String reslove(FirstDgreeEquation firstDgreeEquation){
        if(firstDgreeEquation.getA() == 0 && firstDgreeEquation.getB() == 0)
            return "Phuong trinh co vo so nghiem";
        if (firstDgreeEquation.getA() == 0 && firstDgreeEquation.getB() != 0)
            return "Phuong trinh vo nghiem";
        return "Phuong trinh co nghiem duy nhat " + -firstDgreeEquation.getB()/firstDgreeEquation.getA();
    }
}

public class GiaiHptB1 {

    public static void main(String[] args) {

        HePtB1 pt1 = new HePtB1();
        pt1.Input();
        if (!THUATTOAN.checkPTVN(pt1))   {
            System.out.println("__TB: PT VÔ NGHIÊM__");
        } else {
            Double D[] = THUATTOAN.DinhThuc(pt1);
            System.out.println("Phuong trinh co nghiem la:");
            System.out.println("y= " + D[2] / D[0]);
            System.out.println("x= " + D[1] / D[0]);

        }
    }

}
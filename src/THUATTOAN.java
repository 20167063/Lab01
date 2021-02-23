public class THUATTOAN {

    public static Double[] DinhThuc(HePtB1 pt) {
        Double D[] = new Double[3];
        D[0] = (pt.a1 * pt.b2) - (pt.a2 * pt.b1);
        D[1] = ((-(pt.c1)) * pt.b2) - (pt.b1 * (-(pt.c2)));
        D[2] = (pt.a1 * (-(pt.c2))) - (pt.a2 * (-(pt.c1)));
        return D;
    }

    public static boolean checkPTVN(HePtB1 _pt) {
        boolean check = true;
        if (((_pt.a1 / _pt.a2) == (_pt.b1 / _pt.b2)) && ((_pt.c1 / _pt.c2) == (_pt.b1 / _pt.b2)))
            check = false;
        if ((_pt.a1 ==0 && _pt.a2==0 )  || (_pt.a2 ==0 &&  _pt.b2 ==0))  check =false;
        double c = THUATTOAN.DinhThuc(_pt)[0];
        if (c==0) check=false;
        return check;
    }
}
class Math {
    public static int square(int num) {
        return num * num;
    }

    public static double max(double n1, double n2) {
        if(n1 > n2) {
            return n1;
        }
        else if(n2 > n1) {
            return n2;
        }
        else {
            return n1;
        }
    }

    public static double abs(double x) {
        if(x >= 0) {
            return x;
        }
        else {
            return x * -1;
        }
    }
}
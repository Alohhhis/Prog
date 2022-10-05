public class Main {
    public static void main(String[] Args) {
        int[] e = new int[10];
        int l = 15;
        for (int p = 0; p != 10; p++) {
            e[p] = l;
            l -= 1;
            //System.out.println(e[p]);
        }
        float[] x = new float[13];
        for (int k = 0; k != 13; k++) {
            x[k] = ((float) (Math.random() * 24.0f) - 14.0f);
            //System.out.println(x[k]);
        }
        double[][] s = new double[10][13];
        for (int i = 0; i != 10; i++) {
            for (int j = 0; j != 13; j++) {
                if (e[i] == 15) {
                    s[i][j] = (Math.cbrt(Math.atan((x[j] - 2) / 24))) / 3 / 4;
                } else {
                    if (e[i] == 7 || e[i] == 8 || e[i] == 10 || e[i] == 13 || e[i] == 14) {
                        s[i][j] = Math.pow(4 * (Math.asin(Math.cos(x[j])) - 1), (Math.tan(Math.pow(Math.E, x[j]))));
                    } else {
                        s[i][j] = Math.pow(((1 / 3.0) - Math.pow(Math.E, (0.5 / (1 - Math.atan((x[j] - 2) / 24))))), (Math.asin(Math.cos(2 * (Math.pow((x[j] / 2), (2)))))));
                    }
                }
                double q = s[i][j];
                String Answ = String.format("%.3f ", q);
                System.out.print(Answ + " ");
            }
            System.out.println(" ");
        }
    }
}

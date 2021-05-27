package com.company;

public class calculateAreas {

    public static double[] area(shape[] objs) {
        double[] n = new double[objs.length];
        for (int i = 0; i < objs.length; i++) {
            if (objs[i] != null) {
                n[i] = objs[i].area();
            }
        }
        return n;
    }
}

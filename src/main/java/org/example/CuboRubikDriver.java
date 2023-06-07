package org.example;

public class CuboRubikDriver {
    public static void main(String[] args) {
        CuboRubik cub = new CuboRubik("Qiyi", 3);
        System.out.println(cub.toString());
        cub.mezclar();
        cub.estaResuelto();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author PC
 */
public class MyToys {

    //class này chứa các hàm tienj ích xài chung cho mọi dự án, nơi
    // no sẽ là static
    //cF: compute Factorial, tính n! giai thừa = 1.2.3...n
    //n! bùng nổ value nhanh nên dùng long lưu kết quả
    //dành cho CI(Continuos Integration), đệ quy recursion sau
    public static long cF(int n) {
        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("n mút be beetween 0..15");
        }
        if (n == 0) {
            return 1;
        }

        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}

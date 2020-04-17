/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1404;

import util.MyToys;

/**
 *
 * @author PC
 */
public class SE1404 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("5! = " + MyToys.cF(5));
        System.out.println("6! = " + MyToys.cF(6));
        System.out.println("0! = " + MyToys.cF(0));
        System.out.println("-5! = " + MyToys.cF(-5));
    }
    
    //thế thì: việc làm = tay clean & build kết hợp với Ant chay jbooj test đảm bảo xnah -> .jar
    //đỏ không ra gì cả, báo lỗi -> thủ công quá
    //tự động hoá
    //DEV push code lên trên Git server
    //có ai đó sẽ theo dõi Git, nếu có thay đổi thì do ai đó push thì
    //Ai đó, sẽ kéo code về máy(xài git) local nào đó
    //Ai đó sẽ gọi Ant lên, (local)
    //Ai đó chạy ant. nếu xanh -> ra file .jar
    //                  nếu đỏ -> email chửi dev vừa push code lên
    //                          copy nguyên message đỏ lỗi gửi qua email
    //Ai đó này cứ lắng nghe Git đẻ làm điều này
    //Dev sửa code, đẩy lên, đỏ, chửi, xanh kết thúc
    //liên tục tích hợp và kiểm tra code, ổn thôi, không ổn chửi
    //Continuous Integration CI
    //
}

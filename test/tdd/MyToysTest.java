/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static util.MyToys.cF;

/**
 *
 * @author PC
 */
public class MyToysTest {
    
    //chỗ này dùng để test các hàm ta viết,đảm bảo chất lượng
    //mỗi hàm ta test ta cần chauarn bị sẵn data, giá trị kỳ vọng
    //và xem kết quả xử lí, và so sánh xem có đúng kỳ vọng hay không
    //không đúng kỳ vọng: sai ở data mẫu hay sai ở code?
    //vd: 5! = 120 ? -> test case
    //login: case 1 -> đúng user/pass - >ok vào đúng trang
    //      case 2 - > đúng user sai pass -> báo sai pass
    
    
    //tình huống hàm cF() chạy đúng, mỗi case phải là một hàm
   @Test //biến hàm bất kì đi kèm JUnit thành public static void main()
    public void tetSuccessfulCases() {
        assertEquals(1, cF(0));
        assertEquals(2, cF(2));
        assertEquals(6, cF(3));
        assertEquals(24, cF(4));
        assertEquals(120, cF(5));
        assertEquals(720, cF(6));
    }
    
    //ngoại lệ k phải là một value để so sánh
    //không ước lượng được
    //không xài hàm assertX() được
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionCases() {
        cF(-5);
        cF(-6);
        cF(-5);
        
    }
    
    //Ant chỉ quan tâm code không sai cú pháp, không thiếu thư viện -> ra file .war, .jar, .apk, . ear
    //không check lỗi logic được

    //hãy dạy Ant biết cách code không sai cú pháp, không thiếu thư viện import, màu xanh
    //của JUnit mới ra được .jar
    
    //Ant không thông minh, chỉ biết làm theo những gì được chỉ có trong file build.xml và file build-impl.xml
    //kịch bản để compile and build 
    
    //độ file này 1 chút, độ dòng 1005 Netbean 8, 1204 netbean 11

    //cấu hình thiết Jekins chơi được với Git lấy code
                                          //Ant để biên dịch và đóng gói
    //JDK để nó...
    //Email Google gửi mail (less secure app access - tắt bm 2 lớp)
}

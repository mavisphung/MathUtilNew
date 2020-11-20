package com.giaolang.ci.ant.tdd.util;

import static com.giaolang.ci.ant.util.MathUtil.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author giao-lang | fb/giao.lang.bis version 20.1115
 */
public class MathUtilTest {
    //class này là class xài bộ thư viện JUnit dùng để test code
    //theo dạng xanh - đỏ, thay vì nhìn = mắt như bên main(), sout()
    //2 file .jar đã được add vào project này, và ta thoải má xài các hàm của nó
    //trong các hàm của thư viện này có n hàm đặc biệt đều có
    //tên xuất phát là assertX(expected và actual đưa vòa)
    //Nếu nó thấy expected != actual thì nó thảy ra màu ĐỎ
    //Nếu có bằng thì thảy ra màu XANH
    //quy tắc xanh đỏ: nếu tất cả xanh thì tất cả đều xanh
    //Nếu có ít nhất 1 đỏ thì toàn bộ đỏ
    
    //Nâng cao: dùng tham số hóa tập data cần test. TBA ...
    @Test
    public void getFactorial_ReturnsWell_IfValidArgument() {
        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(120, getFactorial(5));
        assertEquals(120, getFactorial(6));
        assertEquals(24, getFactorial(4));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void getFactorial_ThrowsException_IfInvalidArgument() {
        getFactorial(-5);        
    }
}

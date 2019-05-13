package cn.zcp.urule;

import cn.zcp.urule.bean.Student;
import com.bstek.urule.ClassUtils;
import org.junit.Test;

import java.io.File;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-02-10 18:27
 * @describe urule-project <描述>
 */
public class ClassUtilTest {


    @Test
    public void createXml(){
        File file = new File("d:/zhongchunping/urule-xml/student.xml");
        ClassUtils.classToXml(Student.class,file);
        System.out.println("生成完成!");
    }

}

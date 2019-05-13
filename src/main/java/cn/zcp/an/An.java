package cn.zcp.an;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-04-11 22:48
 * @describe urule-project <描述>
 */
@Target(ElementType.TYPE)//表示只能用于类、接口、enum
@Retention(RetentionPolicy.RUNTIME)
public @interface An{

}

 package cn.websocket.utils;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import cn.websocket.vo.Person;

/**
 * 
 *  * 通过Converter 把string 转为对象
 * @author xiang
 * @date 2018/12/13
 */
@Component
public class StringToPersonConverter implements Converter<String , Person> {

    /** (non-Javadoc)
     * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
     */
    @Override
    public Person convert(String source) {
        Person p1=new Person();
        if(source!=null) {
            String[] items=source.split(":");
            p1.setUsername(items[0]);
            p1.setPasswd(items[1]);
        }
         return p1;
    }

}

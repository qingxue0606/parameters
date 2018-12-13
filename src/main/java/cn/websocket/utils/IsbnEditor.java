 package cn.websocket.utils;

import java.beans.PropertyEditorSupport;

import org.springframework.util.StringUtils;

/**
 * @author xiang
 * @date 2018/12/13
 */

/**
 * 通过PropertyEditorSupport 来把string 转为对象
 * @author xiang
 * @date 2018/12/13
 */
public class IsbnEditor extends PropertyEditorSupport{
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (StringUtils.hasText(text)) {
            setValue(new Isbn(text.trim()));
        } else {
            setValue(null);
        }
    }
    @Override    public String getAsText() {
        Isbn isbn = (Isbn) getValue();
        if (isbn != null) {
            return isbn.getIsbn();
        } else {
            return "";
        }
    }


}

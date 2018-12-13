 package cn.websocket.vo;

 /**
 * @author xiang
 * @date 2018/12/13
 */
public class Person {
    private String username;
    private String passwd;
    
    
    
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }



    /**
     * @return the passwd
     */
    public String getPasswd() {
        return passwd;
    }



    /**
     * @param passwd the passwd to set
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }



    /** (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Person [username=" + username + ", passwd=" + passwd + "]";
    }
    
}

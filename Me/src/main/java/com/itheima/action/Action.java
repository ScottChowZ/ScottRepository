package com.itheima.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Result;

/**  
 * ClassName:Action <br/>  
 * Function:  <br/>  
 * Date:     2018年3月8日 下午5:48:55 <br/>       
 */
public class Action extends ActionSupport {

    private String id;
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public String  find(){
        
        return SUCCESS;
    }
}
  

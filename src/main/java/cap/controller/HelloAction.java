package cap.controller;

import cap.bean.Admin;
import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{
    private Admin admin;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    public String hello(){
        return SUCCESS;
    }
}

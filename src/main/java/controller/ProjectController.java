package controller;

import data.model.*;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "ProjectController")
public class ProjectController {

    private StudentInfo info = new StudentInfo();

    public StudentInfo getInfo() {
        return info;
    }

    public void setInfo(StudentInfo info) {
        this.info = info;
    }

    public String NextPage(){

        return "viewstudent";
    }
}

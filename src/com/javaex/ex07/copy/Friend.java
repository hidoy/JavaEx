package com.javaex.ex07.copy;

public class Friend {

    private String name;
    private String hp;
    private String school;

    
    public void setName(String theName) {
    	name=theName;
    }
    public String getName() {
    	return name;
    }
    public void setHp(String theHp) {
    	hp=theHp;
    }
    public String getHp() {
    	return hp;
    }
    public void setSchool(String theSchool) {
    	school=theSchool;
    }
    public String getSchool() {
    	return school;
    }
    
    
    
    
    public void showInfo(){
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
    }

}

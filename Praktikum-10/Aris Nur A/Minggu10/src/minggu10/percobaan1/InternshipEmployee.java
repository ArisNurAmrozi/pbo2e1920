/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu10.percobaan1;

/**
 *
 * @author Acer
 */
public class InternshipEmployee  extends Employee{
    private int lenght;
    
    public InternshipEmployee(String name, int length){
        this.lenght = length;
        this.name = name;
    }
    public int getLength(){
        return lenght;
    }
    public void setLength(){
     this.lenght = lenght;   
    }
    public String getEmployee(){
      String info = super.getEmployeeInfo()+"\n";
      info += "Registered as internship employee for "+lenght+"month/s\n";
      return info;
    }
}

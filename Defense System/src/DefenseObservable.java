

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kavin
 */
public class DefenseObservable {
    DefenseInterface[] defenseArray=new DefenseInterface[0];
    public void addDefense(DefenseInterface ob){
        extendsArray();
        defenseArray[defenseArray.length-1]=ob;
    }
    public void extendsArray(){
        DefenseInterface[] tempdefenseArray=new DefenseInterface[defenseArray.length+1];
                for(int i=0;i<defenseArray.length;i++){
                    tempdefenseArray[i]=defenseArray[i];
                }
                defenseArray=tempdefenseArray;
        }
    public void setArea(){
        for(DefenseInterface d1:defenseArray){
            d1.clearArea();
        }
    }
    public void changeButtons(int value){
        for(DefenseInterface d1:defenseArray){
            d1.enableButtons(value);
        }
    }
    public void sendMessage(String message){
        for(DefenseInterface d1:defenseArray){
            d1.appendMessage(message);
         }
    }
}


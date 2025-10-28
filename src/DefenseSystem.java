/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pasindu
 */
public class DefenseSystem {
    public static void main(String[] args) {
        DefenseObservable d1=new DefenseObservable();
        MainController m1=new MainController(d1);
        DefenseInterface h1=new Helicopter(m1);
        DefenseInterface t1=new Tank(m1);
        DefenseInterface s1=new SubMarine(m1);
        d1.addDefense(h1);
        d1.addDefense(t1);
        d1.addDefense(s1);
        
    }
            
}

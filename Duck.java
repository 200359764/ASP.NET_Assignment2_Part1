/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

/**
 *
 * @author seunghwankim
 */
public class Duck extends Pets{

    public Duck(String name, String bread) {
        super(name, bread);
    }
    

    @Override
    public String speak() {
        return "Quack";
    }
}

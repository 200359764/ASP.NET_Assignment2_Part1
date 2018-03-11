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
public class Cat extends Pets{

    public Cat(String name, String bread) {
        super(name, bread);
    }
    
    @Override
    public String speak() {
        return "Meow";
    }
}

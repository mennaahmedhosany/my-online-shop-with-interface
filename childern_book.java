/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_shop_with_interface;

/**
 *
 * @author ORIGINAL
 */
public class childern_book extends book {

    public childern_book() {
    }

    public childern_book(double price) {
        super(price);
    }

    @Override
    public double price(double price) {
        return 2*.3* super.price(price); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

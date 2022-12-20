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
public class cartoon extends childern_book {
 String item ;
    public cartoon() {
    }

    public cartoon(String item) {
        this.item=item;
    }

    @Override
    public double price(double price) {
        return super.price(price); //To change body of generated methods, choose Tools | Templates.
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
    
}

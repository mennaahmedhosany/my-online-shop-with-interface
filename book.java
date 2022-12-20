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
public class book implements product {
 double price;

    public book() {
    }

    public book(double price) {
        this.price = price;
    }
 
    @Override
    public double price(double price) {
        return .5* price;
        }

 
    
}

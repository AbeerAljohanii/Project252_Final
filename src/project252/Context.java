/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project252;

public class Context {
    private PayStrategy paystrategy;
    public Context(PayStrategy paystrategy) {
        this.paystrategy = paystrategy;
    }
    public String ExecuteStrategy(double amount){
        return paystrategy.pay(amount);   
}
}

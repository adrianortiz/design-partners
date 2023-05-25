package com.codizer.creational.factory;

public class InvoiceWithTax extends Invoice {

    public InvoiceWithTax() {
        super();
    }

    public InvoiceWithTax(int number, String concept, double amount) {
        super(number, concept, amount);
    }

    @Override
    public double getAmountWithTax() {
        return getAmount() * 1.20;
    }

}

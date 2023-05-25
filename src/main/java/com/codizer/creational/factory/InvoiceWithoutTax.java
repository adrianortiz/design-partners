package com.codizer.creational.factory;

public class InvoiceWithoutTax extends Invoice {

    public InvoiceWithoutTax() {
        super();
    }

    public InvoiceWithoutTax(int number, String concept, double amount) {
        super(number, concept, amount);
    }

    @Override
    public double getAmountWithTax() {
        return getAmount();
    }

}

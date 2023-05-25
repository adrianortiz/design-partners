package com.codizer.creational.factory;

public class InvoiceFactory {

    enum InvoiceType {
        TAX, NOTTAX
    }

    public static Invoice getInvoice(InvoiceType type) {

        if (type == InvoiceType.TAX) {
            return new InvoiceWithTax();
        } else {
            return new InvoiceWithoutTax();
        }
    }

}

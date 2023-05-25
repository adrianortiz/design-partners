package com.codizer.creational.factory;

public class Main {

    public static void main(String[] args) {

        Invoice invoice1 = InvoiceFactory.getInvoice(InvoiceFactory.InvoiceType.TAX);
        invoice1.setNumber(1);
        invoice1.setConcept("Computer");
        invoice1.setAmount(200);
        System.out.println(invoice1.getAmountWithTax());

        Invoice invoice2 = InvoiceFactory.getInvoice(InvoiceFactory.InvoiceType.NOTTAX);
        invoice2.setNumber(1);
        invoice2.setConcept("Computer");
        invoice2.setAmount(200);
        System.out.println(invoice2.getAmountWithTax());

    }
}

package com.aweperi.solidprinciples.singleresponsibilityprinciple.solution;

public class InvoicePrinter {
    private final Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void print() {
        System.out.println(invoice.getQuantity() + "x " + invoice.getBook().getName() + " " + invoice.getBook().getPrice() + " $");
        System.out.println("Discount Rate: " + invoice.getDiscountRate());
        System.out.println("Tax Rate: " + invoice.getTaxRate());
        System.out.println("Total: " + invoice.getTotal() + " $");
    }
}
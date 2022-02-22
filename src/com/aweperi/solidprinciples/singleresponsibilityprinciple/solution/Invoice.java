package com.aweperi.solidprinciples.singleresponsibilityprinciple.solution;

import com.aweperi.solidprinciples.singleresponsibilityprinciple.violation.Book;

public class Invoice {
    private Book book;
    private int quantity;
    private double discountRate;
    private double taxRate;
    private double total;

    public Invoice(Book book, int quantity, double discountRate, double taxRate) {
        this.book = book;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
        this.total = this.calculateTotal();
    }

    public Book getBook() {
        return book;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getTotal() {
        return total;
    }

    public double calculateTotal() {
        double price = ((book.getPrice() - book.getPrice() * discountRate) * this.quantity);

        double priceWithTaxes = price * (1 + taxRate);

        return priceWithTaxes;
    }

}

// The first violation is the printInvoice method, which contains our printing logic.
// The saveToFile method also violates SRP
// The SRP states that our class should only have a single reason to change,
// and that reason should be a change in the invoice calculation for our class.

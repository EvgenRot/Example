package Day_52_Encapsulation2;

import java.time.LocalDateTime;

public class Invoice {

    private int invNumber = 1000;
    private LocalDateTime invDateTime;
    private String companyNameFrom = "EuroTechStudy";
    private String productName;
    private double price;
    private int amount;
    private static int count = 0;

    public Invoice(String productName, int price, int amount) {

         this.productName = productName;
        this.price = price;
        this.amount = amount;
        this.invNumber = count + invNumber;
        count++;
        this.invDateTime = LocalDateTime.now();
    }

    public double getTotalPrice() {
        return price*amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invNumber=" + invNumber +
                ", invDateTime=" + invDateTime +
                ", companyNameFrom='" + companyNameFrom + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }

    /*
    1. при оформлении счет фактуры, номер с/ф начинается с 1000
    и должен присваиваться автоматически С-Ф
    2. дата присваивается автоматически
    3. название компании всегда подставляется в поле фирмы
    4. при оформлении с/ф должно автоматически считать сумму
     */

}

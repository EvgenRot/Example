package Day_64_Interface_Enum_DataRecord.dataRecord;

import java.util.Objects;

public final class Customer {
    private final String firstName;
    private final String lastName;
    private final String adress;
    private final int phone;

    public static void main(String[] args) {

        CustomerR customerR = new CustomerR("Evgen", "Rot", "Deutschland", 111);
        CustomerR customerR1 = new CustomerR("Evgen", "Rot", "Deutschland", 111);
        System.out.println(customerR);
        System.out.println(customerR1.equals(customerR));

        Customer customer = new Customer("Denis", "Euro", "Deutschland", 222);
        System.out.println(customer);

        CustomerR aaa = new CustomerR("Igor","Stadt","Russia");
        System.out.println(aaa);
        aaa.method();
    }

    public Customer(String firstName, String lastName, String adress, int phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAdress() {
        return adress;
    }

    public int getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return phone == customer.phone && Objects.equals(firstName, customer.firstName)
                && Objects.equals(lastName, customer.lastName) && Objects.equals(adress, customer.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, adress, phone);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", adress='" + adress + '\'' +
                ", phone=" + phone +
                '}';
    }
}

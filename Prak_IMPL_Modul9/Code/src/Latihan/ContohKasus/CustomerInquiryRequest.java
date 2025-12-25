package Latihan.ContohKasus;

public class CustomerInquiryRequest {
    private Customer customer;
    private CustomerProduct customerProduct;

    // Constructor, Getter, dan Setter
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public CustomerProduct getCustomerProduct() {
        return customerProduct;
    }

    public void setCustomerProduct(CustomerProduct customerProduct) {
        this.customerProduct = customerProduct;
    }
}

class Customer {
    private String customerID;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
}

class CustomerProduct {
    private String productNumber;

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }
}

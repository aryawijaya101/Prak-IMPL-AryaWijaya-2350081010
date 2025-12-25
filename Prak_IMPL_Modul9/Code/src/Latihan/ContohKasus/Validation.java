package Latihan.ContohKasus;

public class Validation {

    // Perbaikan dengan menggunakan metode Java
    public void validateRequest(CustomerInquiryRequest request, int customerFieldLength, int productFieldLength) {
        checkCustomerInquiryNotNullOrEmpty(request);
        checkCustomerInquiryNullOrEmpty(request);
        checkCustomerIDValid(request, customerFieldLength);
        checkProductNumberValid(request, productFieldLength);
    }

    private void checkCustomerInquiryNotNullOrEmpty(CustomerInquiryRequest request) {
        // Memeriksa apakah parameter CustomerID dan ProductNumber tidak null atau kosong
        if (request.getCustomerProduct().getProductNumber() != null && !request.getCustomerProduct().getProductNumber().isEmpty() &&
                request.getCustomer().getCustomerID() != null && !request.getCustomer().getCustomerID().isEmpty()) {
            // Kedua parameter terisi
            throw new BusinessException(HandledErrors.INVALID_BOTH_PARAMETER_MESSAGE);
        }
    }

    private void checkCustomerInquiryNullOrEmpty(CustomerInquiryRequest request) {
        // Memeriksa apakah kedua parameter kosong atau null
        if ((request.getCustomer().getCustomerID() == null || request.getCustomer().getCustomerID().isEmpty()) &&
                (request.getCustomerProduct().getProductNumber() == null || request.getCustomerProduct().getProductNumber().isEmpty())) {
            // Kedua parameter kosong
            throw new BusinessException(HandledErrors.CUSTOMER_EMPTY_MESSAGE);
        }
    }

    private void checkCustomerIDValid(CustomerInquiryRequest request, int customerIDFieldLength) {
        if (request.getCustomer().getCustomerID() != null && !request.getCustomer().getCustomerID().isEmpty()) {
            String customerID = request.getCustomer().getCustomerID();

            // Memeriksa panjang Customer ID
            if (customerID.length() > customerIDFieldLength) {
                throw new BusinessException(HandledErrors.CUSTOMER_INVALID_LENGTH_MESSAGE);
            }

            // Menambahkan padding di kiri ID pelanggan jika diperlukan
            while (customerID.length() < customerIDFieldLength) {
                customerID = "0" + customerID;
            }

            request.getCustomer().setCustomerID(customerID);
        }
    }

    private void checkProductNumberValid(CustomerInquiryRequest request, int productFieldLength) {
        if (request.getCustomerProduct().getProductNumber() != null && !request.getCustomerProduct().getProductNumber().isEmpty()) {
            String productNumber = request.getCustomerProduct().getProductNumber();

            // Memeriksa panjang Product Number
            if (productNumber.length() > productFieldLength) {
                throw new BusinessException(HandledErrors.PRODUCT_INVALID_LENGTH_MESSAGE);
            }

            // Menambahkan padding di kiri nomor produk jika diperlukan
            while (productNumber.length() < productFieldLength) {
                productNumber = "0" + productNumber;
            }

            request.getCustomerProduct().setProductNumber(productNumber);
        }
    }
}

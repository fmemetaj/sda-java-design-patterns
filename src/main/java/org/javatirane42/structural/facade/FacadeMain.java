package org.javatirane42.structural.facade;

public class FacadeMain {

    public static void main(String[] args) {
        Long id = 1L;
        int price = 500;
        String user = "User";

        DeliveryService deliveryService = (productsId, amount, recipient) -> System.out.println("Delivered product with product id: " + productsId + " and amount: " + amount + " to " + recipient);
        PaymentService paymentService = (productId, amount) -> System.out.println("Payment for product with product id: " + productId + " and amount: " + amount);
        ProductAvailabilityService productAvailabilityService = productId -> true;

        OrderFacade orderFacade = new OrderFacade(deliveryService, paymentService, productAvailabilityService);

        orderFacade.placeOrder(id, price, user);
    }
}

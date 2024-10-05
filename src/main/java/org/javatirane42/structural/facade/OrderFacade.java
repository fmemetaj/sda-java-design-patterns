package org.javatirane42.structural.facade;

public class OrderFacade {

    private final DeliveryService deliveryService;
    private final PaymentService paymentService;
    private final ProductAvailabilityService productAvailabilityService;

    public OrderFacade(DeliveryService deliveryService, PaymentService paymentService, ProductAvailabilityService productAvailabilityService) {
        this.deliveryService = deliveryService;
        this.paymentService = paymentService;
        this.productAvailabilityService = productAvailabilityService;
    }

    public boolean placeOrder(Long productId, int amount, String recipient) {
        if (productAvailabilityService.isAvailable(productId)) {
            paymentService.pay(productId, amount);
            deliveryService.deliverProduct(productId, amount, recipient);
            return true;
        }
        return false;
    }
}

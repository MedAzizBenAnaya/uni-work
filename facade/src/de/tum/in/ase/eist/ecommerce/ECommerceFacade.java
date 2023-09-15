package de.tum.in.ase.eist.ecommerce;

public class ECommerceFacade {
    
    private OrderController orderController = new OrderController();
    private AdvertisementController advertisementController = new AdvertisementController();
    private ShippingController shippingController = new ShippingController();


    public void processOrder(Order order) {

        orderController.processOrder(order);
    }

    public void processOrder(Order order, String phoneNumber) {
        
        orderController.processOrder(order, phoneNumber);
    }


    public Order retrieveLatestOrder(int id) {

        return orderController.retrieveLatestOrder(id);
    }


    public void playAdvertisement(int ageRestriction) {

        advertisementController.playAdvertisement(ageRestriction);
    }

    public void shipOrder(Order order, String adress) {

       

        order.setShipping(shippingController.createShipping(adress));

        shippingController.shipOrder(order);

    }




}

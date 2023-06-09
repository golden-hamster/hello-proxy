package hello.proxy.app.v1;

public class OrderControllerV1mpl implements OrderControllerV1 {

    private final OrderServiceV1 orderService;

    public OrderControllerV1mpl(OrderServiceV1 orderService) {
        this.orderService = orderService;
    }


    @Override
    public String request(String itemId) {
        orderService.orderItem(itemId);
        return "ok";
    }

    @Override
    public String noLog() {
        return "ok";
    }

}

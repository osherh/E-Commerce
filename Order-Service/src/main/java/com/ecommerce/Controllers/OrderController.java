@RestController
@RequestMapping("/orders")
public class OrderController
{
    @PostMapping("/create")
    public ResponseEntity<String> createOrder(@RequestBody OrderDTO orderDTO)
    {
        //TODO:
        //1. store the order on the orders_db
        //2. publish an OrderCreated event to rabbitmq
        //3. use the outbox pattern
        return ResponseEntity.ok("Order created successfully");
    }
}
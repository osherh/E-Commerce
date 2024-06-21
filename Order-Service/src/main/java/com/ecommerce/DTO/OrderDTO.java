import java.util.UUID;

public record OrderDTO
{
    private UUID customerId;
    private List<ProductDTO> products;
}
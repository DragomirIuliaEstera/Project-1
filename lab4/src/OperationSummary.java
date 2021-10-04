public class OperationSummary {
    private String _productName;
    private float _quantity;
    private float _price;

    public OperationSummary(String productName, float quantity, float price) {
        _productName = productName;
        _quantity = quantity;
        _price = price;
    }

    public String printOperationSummary() {
        String opSum = "\n"+"Sumar operatiune:"
                + "\nProdus: " +_productName
                +"\nCantitate( L): "+_quantity
                +"\nPret( lei): "+_price+"\n";
        return opSum;
    }
}
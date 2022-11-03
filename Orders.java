package io.javabrains;

public class Orders {
private String OrderName;
private String OrderStatus;
private int Price;
     public Orders(String OrderName, String OrderStatus, int Price) {
         super();
         this.OrderName = OrderName;
         this.OrderStatus = OrderStatus;
         this.Price = Price;
     }
     public String getOrderName() {
         return OrderName;
     }
     public void setOrderName(String OrderName) {
         this.OrderName = OrderName;
     }
     public String getOrderStatus() {
         return OrderStatus;
     }
     public void setOrderStatus(String OrderStatus) {
         this.OrderStatus = OrderStatus;
     }
     public int getPrice() {
         return Price;
     }
     public void setPrice(int Price) {
         this.Price = Price;
     }
    @Override
    public String toString(){
        return "Order[OrderName:"+OrderName+", Status:"+OrderStatus+", Price:"+Price+"]";
    }
}

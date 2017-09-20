public class Device {
    public String code;
    public String producer;
    public String type;
    public double price;

    Device (String code, String producer, String type, double price){
        this.code=code;
        this.producer=producer;
        this.type=type;
        this.price=price;

    }
    Device (String code, String producer, String type){
        this.code=code;
        this.producer=producer;
        this.type=type;

    }
    public String getInfo(){
        return code +" "+ producer + " " + type+ " " + price;
    }
}

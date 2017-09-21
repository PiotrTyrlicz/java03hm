public class Device {
    public String code;
    public String producer;
    public String type;
    public double price;

    Device (String code, String producer, String type){
        this.code=code;
        this.producer=producer;
        this.type=type;
    }

    Device (String code, String producer, String type, double price) {
        this(code, producer, type);
        this.price = price;
    }

    public String getInfo(){
        return code +" "+ producer + " " + type+ " " + price;
    }
}

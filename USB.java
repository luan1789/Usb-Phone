package Phone;

public class USB {

    // static khong van tao obj
    static String model = "china";
    int code;
    int capicity;

    // constructor
    public USB() {

        // ham tao khong co tham so
        // truyen vao
    }

    public USB(int code, int capicity) {
        this.code = code;
        this.capicity = capicity;
    }

    public void ChangeModel() {
        model = "Viet Nam";
    }

    public String Tostring() {
        return code + "-" + capicity + "GB" + "-" + model;
    }

    public int getCapicity() {
        return capicity;
    }

    public void setCapicity(int capicity) {
        this.capicity = capicity;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getModel() {
        return model;
    }

    // MobilePhone
    class MobilePhone {

        double price;
        String USBport;

        public MobilePhone() {
        }

        public MobilePhone(double price, String USBport) {
            this.price = price;
            this.USBport = USBport;
        }

        public String Tostring() {
            return code + "-" + capicity + "GB" + "-" + model + "-" + price;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getUSBport() {
            return USBport;
        }

        public void setUSBport(String USBport) {
            this.USBport = USBport;
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

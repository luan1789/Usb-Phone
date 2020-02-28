package Phone;

/**
 *
 * @author User
 */
public class Program {
    public static void main(String[] args) {
        USB             test1Usb   = new USB(111, 256);
        USB.MobilePhone namephone1 = test1Usb.new MobilePhone(1000, "hd");
        USB             test2Usb   = new USB(222, 128);
        USB.MobilePhone namephone2 = test2Usb.new MobilePhone(1200, "hd");

        System.out.println(namephone1.Tostring());
        System.out.println(namephone2.Tostring());
        System.out.println("");

        ////////////////////////
        test1Usb.ChangeModel();
        test2Usb.ChangeModel();
        System.out.println(namephone1.Tostring());
        System.out.println(namephone2.Tostring());
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

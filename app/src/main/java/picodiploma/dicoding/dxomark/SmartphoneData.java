package picodiploma.dicoding.dxomark;

import java.util.ArrayList;

public class SmartphoneData {

    public static String[][] data = new String[][]{
            {"Huawei P30 Pro", "DXOMARK MOBILE = 112\nDXOMARK SELFIE = 89", "https://cdn2.gsmarena.com/vv/bigpic/huawei-p30-pro.jpg"},
            {"Samsung Galaxy S10", "DXOMARK MOBILE = 112\nDXOMARK SELFIE = 97", "https://cdn2.gsmarena.com/vv/bigpic/samsung-galaxy-s10.jpg"},
            {"One Plus 7 Pro", "DXOMARK MOBILE = 111\nDXOMARK SELFIE = 86", "https://cdn2.gsmarena.com/vv/bigpic/oneplus-7-pro-r1.jpg"},
            {"Huawei Mate 20 Pro", "DXOMARK MOBILE = 109\nDXOMARK SELFIE = 75", "https://cdn2.gsmarena.com/vv/bigpic/huawei-mate-20-pro-1.jpg"},
            {"Huawei P20 Pro", "DXOMARK MOBILE = 109\nDXOMARK SELFIE = 72", "https://cdn2.gsmarena.com/vv/bigpic/huawei-p20-pro-.jpg"},
            {"Samsung Galaxy S10 Plus", "DXOMARK MOBILE = 109\nDXOMARK SELFIE = 96", "https://cdn2.gsmarena.com/vv/bigpic/samsung-galaxy-s10-plus-new.jpg"},
            {"Xiaomi Mi 9", "DXOMARK MOBILE = 107\nDXOMARK SELFIE = 84", "https://cdn2.gsmarena.com/vv/bigpic/xiaomi-mi-9-.jpg"},
            {"Apple Iphone XS Max", "DXOMARK MOBILE = 105\nDXOMARK SELFIE = 82", "https://cdn2.gsmarena.com/vv/bigpic/apple-iphone-xs-max-new1.jpg"}
    };

    public static ArrayList<Smartphone> getListData() {
        Smartphone Smartphone = null;
        ArrayList<Smartphone> list = new ArrayList<>();
        for (String[] aData : data) {
            Smartphone = new Smartphone();
            Smartphone.setName(aData[0]);
            Smartphone.setRemarks(aData[1]);
            Smartphone.setPhoto(aData[2]);

            list.add(Smartphone);
        }

        return list;
    }

}

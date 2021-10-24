import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Name {
    public static void main(String[] args) {

//        Name.getChinese();
//        for (Object li : list
//        ) {
//            System.out.println(li);
//        }

    }

    public static String getName() {
        Random random = new Random();
        String[] Surname = {"赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈", "褚", "卫", "蒋", "沈", "韩", "杨", "朱", "秦",
                "尤", "许", "何", "吕", "施", "张", "孔", "曹", "严", "鲁", "韦", "昌", "马", "冷", "曾", "关", "岳", "高"};

        int index = random.nextInt(Surname.length - 1);
        String name = Surname[index]; // 获得一个随机的姓氏
        /* 从常用字中选取一个或两个字作为名 */
        if (random.nextBoolean()) {
            name += Name.getChinese() + Name.getChinese();
        } else {
            name += Name.getChinese();
        }
//        System.out.println(name);

        return name;

    }

    public static String getChinese() {
//        String str = null;
//        int highPos, lowPos;
//        Random random = new Random();
//        highPos = (176 + Math.abs(random.nextInt(71)));// 区码，0xA0打头，从第16区开始，即0xB0=11*16=176,16~55一级汉字，56~87二级汉字
//        random = new Random();
//        lowPos = 161 + Math.abs(random.nextInt(94));// 位码，0xA0打头，范围第1~94列
//
//        byte[] bArr = new byte[2];
//        bArr[0] = (new Integer(highPos)).byteValue();
//        bArr[1] = (new Integer(lowPos)).byteValue();
//        try {
//            str = new String(bArr, "GB2312"); // 区位码组合成汉字
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        String[] mName = { "军", "骏", "立", "利", "存", "威", "位", "丽", "梅", "香", "非", "少", "好", "跑", "刚", "女", "金", "贺",
                "就", "零", "柏", "思", "林", "高", "衣", "操", "看", "要", "一", "农", "波", "博", "为", "三", "将", "中" };
        Random random = new Random();
        int index = random.nextInt(mName.length - 1);
        String bName =mName[index];
         return bName;
    }

}

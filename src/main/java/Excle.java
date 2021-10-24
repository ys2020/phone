import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Excle{
    public static void main(String[] args) throws IOException {
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("1", "value1");
//        map.put("2", "value2");
//        map.put("3", "value3");



        //第一种：普遍使用，二次取值
//        System.out.println("通过Map.keySet遍历key和value：");
//        for (String key : map.keySet()) {
//            System.out.println( key + " " + map.get(key));
//        }
        List<Map<String, String>> result = new ArrayList<>();
        Map<String, String> map = new LinkedHashMap<>();
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            String name = Name.getName();
            int op = random.nextInt(3);//随机运营商标志位
            sb = new StringBuilder();
            sb.append(RandomPhoneNumber.createMobile(op));
            map = new LinkedHashMap<>();
            map.put("U_ID",name);
            map.put("UDT_SAPID",sb.toString());
            result.add(map);
        }


        String fileName = "公司员工信息表.xls";        // 定义文件名
        String headString = "公司员工信息表";          // 定义表格标题
        String sheetName = "工作表一";                  // 定义工作表表名
        String filePath = "D:\\";             // 文件本地保存路径
        String[] thead = {"姓名(U_ID)","号码(UDT_STATE)"};                    // 定义表头内容
        int[] sheetWidth = {2500,3500};   // 定义每一列宽度

        HSSFWorkbook wb = new HSSFWorkbook();           // 创建Excel文档对象
        HSSFSheet sheet = wb.createSheet(sheetName);    // 创建工作表

        // ①创建表格标题
//        ExcelUtil.createHeadTittle(wb, sheet, null, result.get(0).size() - 1);

        ExcelUtil.createThead(wb, sheet, thead, sheetWidth);

        // ③填入数据
        ExcelUtil.createTable(wb, sheet, result);

        FileOutputStream fos = new FileOutputStream(new File(filePath+fileName));
// filePath,fileName是如上定义的文件保存路径及文件名
        wb.write(fos);

        fos.close();
        wb.close();



        //第二种
//        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
//        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry<String, String> entry = it.next();
//            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
//        }
//
//        //第三种：推荐，尤其是容量大时
//        System.out.println("通过Map.entrySet遍历key和value");
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
//        }
//
//        //第四种
//        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
//        for (String v : map.values()) {
//            System.out.println("value= " + v);
//        }
    }
}
package moleFarm.common.utils;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import moleFarm.common.status.ProductType;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class JsonOp {
    /**
     * 通过路径读取json文件，返回jsonobject对象
     * @param jsonPath
     * @return
     * @throws FileNotFoundException
     */
    private static JSONObject getJson(String jsonPath) throws FileNotFoundException {
        JSONReader jsonReader = new JSONReader(new FileReader(jsonPath));
        JSONObject o = (JSONObject) jsonReader.readObject();
        return o;
    }
    public static List<String> SearchJson(ProductType productType) {
        String text = productType.getText();
        String jsonPath = "src/main/java/moleFarm/common/resources/farm.json";
        List<String> list = null;
        try {
            JSONObject json = getJson(jsonPath);
            JSONObject temp = (JSONObject) (json.get("farm"));
            list = (List<String>) temp.get(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(list);
        return list;
    }

    /**
     * 工具类用来解析
     * @param name
     * @param fileName
     * @param difference
     * @return
     */
    public static String utilSearchJson(String name, String fileName, String difference){
        String jsonPath="src/main/java/moleFarm/common/resources/"+fileName+".json";
        try {
            JSONObject json = getJson(jsonPath);
            if(name==difference){
                return (String) json.get(name);
            }
            else{
                JSONObject factory = (JSONObject)json.get("factory");
                JSONObject conc = (JSONObject)factory.get("conc");
                return (String) conc.get(name);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 解析path.json
     * @param name
     * @return
     */
    public static String getPathJson(String name){
        return utilSearchJson(name, "path", "IFactory");
    }
    /**
     *解析msg.json
     * @param name
     * @return
     */
    public static String getMsgJson(String name){
        return utilSearchJson(name,"msg","FarmProductFactory");
    }

}

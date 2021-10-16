package moleFarm.common.other;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import moleFarm.common.farmenum.FarmType;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class JsonOp {
    public static List<String> searchJson(FarmType farmType) {
        String text = farmType.getText();
        String jsonPath = "src/main/resources/farm.json";
        File file = new File(jsonPath);
        String path = file.getPath();
        List<String> list = null;
        try {
            JSONReader jsonReader = new JSONReader(new FileReader(path));
            JSONObject o = (JSONObject) jsonReader.readObject();
            JSONObject temp = (JSONObject) (o.get("farm"));
            list = (List<String>) temp.get(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(searchJson(FarmType.CROPS));
    }
}

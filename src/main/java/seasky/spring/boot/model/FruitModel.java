package seasky.spring.boot.model;

import com.google.gson.Gson;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by junhong on 2016/5/11.
 */
public class FruitModel {
    Gson GSON = new Gson();
    Logger LOG = Logger.getLogger(FruitModel.class);

    Map<String, String> fruits = new HashMap<>();

    public FruitModel() {
        fruits.put("apple", "苹果");
        fruits.put("banana", "香蕉");
        fruits.put("pear", "鸭梨");
    }

    public Map<String, Object> getFruits() {

        Map<String, Object> maps = new HashMap<>();
        maps.put("ret", 0);
        maps.put("item", fruits);
        return maps;
    }

    public Map<String, Object> getFruitByTag(String tag) {

        Map<String, Object> maps = new HashMap<>();
        Object fruitName = fruits.get(tag);
        Long now = System.currentTimeMillis();
        maps.put("query_time", "" + now / 1000);
        maps.put("fruit", fruitName);
        return maps;
    }

    public void test1() {
        LOG.info(GSON.toJson(getFruits()));
    }

    public void test2() {
        String tag = "banana";
        LOG.info(GSON.toJson(getFruitByTag(tag)));
    }

//    public static void main(String[] args) {
//        new FruitModel().test1();
//        new FruitModel().test2();
//    }
}

package test;

import cn.edu.sdjzu.xg.bysj.domain.Degree;
import cn.edu.sdjzu.xg.bysj.service.DegreeService;
import com.alibaba.fastjson.JSON;

import java.sql.SQLException;
import java.util.Collection;

public class DatabaseTest {
    public static void main(String[] args) throws SQLException {
        String list = "{\n" +
                "        \"description\": \"博士后\",\n" +
                "        \"id\": 1,\n" +
                "        \"no\": \"01\",\n" +
                "        \"remarks\": \"厉害\"\n" +
                "    }";
        Degree degree = JSON.parseObject(list, Degree.class);
        DegreeService.getInstance().update(degree);
    }
}

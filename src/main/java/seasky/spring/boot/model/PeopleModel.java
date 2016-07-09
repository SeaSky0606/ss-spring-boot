package seasky.spring.boot.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import seasky.spring.boot.bean.PeopleData;

public class PeopleModel {

	static List<PeopleData> datas = new ArrayList<>();
	static {

		datas.add(new PeopleData(1, "people1"));
		datas.add(new PeopleData(2, "people12"));
		datas.add(new PeopleData(3, "people123"));
	}

	public Map<String, Object> getAllPeople() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("peopleList", datas);
		return map;
	}

	public Map<String, Object> getPeopleById(int id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("peopleList", datas.get(id));
		return map;
	}

}

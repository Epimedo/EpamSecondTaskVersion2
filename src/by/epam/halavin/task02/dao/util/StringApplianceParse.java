package by.epam.halavin.task02.dao.util;

import by.epam.halavin.task02.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class StringApplianceParse implements StringParse {

    public <E> String[] parse(String[] lines, Criteria<E> criteria) {
        String value = null;
        ArrayList<String> list = new ArrayList<>();
        Set<E> set = criteria.getCriteria().keySet();
        Map<E, Object> map = criteria.getCriteria();
        boolean bool = false;

        for (String str : lines) {
            bool = true;
            for (E type : set) {
                value = map.get(type).toString();
                if (!Pattern.matches("^.*" + type.toString() + "=" + value + ".*$", str)) {
                    bool = false;
                    break;
                }
            }
            if (bool == true) {
                list.add(str);
            }
        }
        lines = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            lines[i] = list.get(i);
        }

        return lines;
    }
}

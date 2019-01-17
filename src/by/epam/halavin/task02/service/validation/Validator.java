package by.epam.halavin.task02.service.validation;

import by.epam.halavin.task02.entity.criteria.Criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Validator {
    private static final char paramDelimeter = '-';
    private static final Pattern digit = Pattern.compile("^\\-?[0-9]+\\.?[0-9]*$");
    private static final Pattern word = Pattern.compile("^[a-zA-Z]+$");
    private static final Pattern typeWord = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_\\-]+$");
    private static final Pattern rangeWord = Pattern.compile("^[1-9]+\\-[0-9]+$");
    private static final Pattern type = Pattern.compile("^.*TYPE.*$");
    private static final Pattern range = Pattern.compile("^.*RANGE.*$");
    private static final Pattern color = Pattern.compile("^.*COLOR.*$");

    private static Map<String, ValidatorCriteriaSelect> map = new HashMap<>();

    static {
        map.put("Oven", new OvenCriteriaSelect());
        map.put("Laptop", new LaptopCriteriaSelect());
        map.put("Refrigerator", new RefrigeratorCriteriaSelect());
        map.put("VacuumCleaner", new VacuumCleanerCriteriaSelect());
        map.put("TabletPC", new TabletPCCriteriaSelect());
        map.put("Speakers", new SpeakersCriteriaSelect());
    }

    public static <E> boolean criteriaValidator(Criteria<E> criteria) {
        String str = "";
        boolean bool = true;
        Object[] objects = map.get(criteria.getTypeNameGenerics()).select();

        for (Object oven : objects) {
            if (map.containsKey(oven)) {
                str = map.get(oven).toString();

                if (digit.matcher(str).matches()) {
                    if (Double.parseDouble(str) < 0) {
                        bool = false;
                    }
                } else if (type.matcher(oven.toString()).matches()) {
                    if (!typeWord.matcher(str.trim()).matches()) {
                        bool = false;
                    }
                } else if (range.matcher(oven.toString()).matches()) {
                    if (!rangeWord.matcher(str.trim()).matches()) {
                        bool = false;
                    }
                    String border1 = str.substring(0, str.indexOf(paramDelimeter));
                    String border2 = str.substring(str.indexOf(paramDelimeter) + 1);

                    if (Double.parseDouble(border1) > Double.parseDouble(border2)) {
                        bool = false;
                    }

                } else if (color.matcher(oven.toString()).matches()) {
                    if (!word.matcher(str.trim()).matches()) {
                        System.out.println("color");
                        bool = false;
                    }
                }
            }
        }
        return bool;
    }

}

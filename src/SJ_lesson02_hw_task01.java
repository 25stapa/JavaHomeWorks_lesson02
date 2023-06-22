/*
1) Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

 */
public class SJ_lesson02_hw_task01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String[] jsStr = {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"};
        int len = jsStr.length;
        for (int i = 0; i < len; i++)
            if (jsStr[i].indexOf("null") == (-1)) {
                sb.append(jsStr[i].replace(":", "="));
                if (i != len - 2) {
                    sb.append(" AND ");
                }
            }
        System.out.println("Часть Where вашего запроса имеет вид: " + sb);
    }
}
package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {


    }

    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567
    }


    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }

    public static class IncomeDataAdapter implements Customer, Contact {

        private IncomeData data;

        public IncomeDataAdapter(IncomeData incomeData) {
            this.data = incomeData;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            String countryName = data.getCountryCode();

            for (Map.Entry<String, String> s : countries.entrySet()) {
                if (countryName.equals(s.getKey())) {
                    countryName = s.getValue();
                }
            }
            return countryName;
        }

        @Override
        public String getName() {
            return String.format("%s, %s", data.getContactLastName(), data.getContactFirstName());
        }

        @Override
        public String getPhoneNumber() {
            /*
            int getCountryPhoneCode();      //For example: 38
            int getPhoneNumber();           //For example: 501234567
            String getPhoneNumber();        //For example: +38(050)123-45-67
            */

            String num = String.valueOf(data.getPhoneNumber());
            StringBuilder sb = new StringBuilder();
            for (int i = num.length(); i < 10; i++) {
                sb.append("0");
            }
            sb.append(num);
            System.out.println(sb);
            num = sb.toString();

            return String.format("+%d(%s)%s-%s-%s", data.getCountryPhoneCode(), num.substring(0, 3), num.substring(3, 6), num.substring(6, 8), num.substring(8));
        }
    }
}
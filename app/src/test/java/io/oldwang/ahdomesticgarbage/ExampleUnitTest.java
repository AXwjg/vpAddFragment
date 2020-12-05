package io.oldwang.ahdomesticgarbage;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import io.oldwang.pda.bean.RecyclingDetailsBean;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testIsPhone() {
        Pattern phone_pattern = Pattern.compile("^(13|15|18)\\d{9}$");
        System.out.println(phone_pattern.matcher("").matches());

    }

    @Test
    public void testStringS() {
        String date = "0000=0120000=0120000=0120000=0120000=012";
        if (date.length() > 0) {
            String[] split = date.split("=");
            if (split.length > 2) {
                String splitString = split[1];
                System.out.println("第一个数据 ：" + splitString);
                String splitEnd = cuttingInversion(splitString);
                System.out.println("切割完后部的数据 ：" + splitEnd);
            }
        }
    }

    private String cuttingInversion(String date) {
        String splitEndString = "";
        if (date.endsWith("0")) {
            splitEndString = date.substring(0, date.length() - 1);
            if (splitEndString.endsWith("0")) {
                return cuttingInversion(splitEndString);
            }
        }
        StringBuilder reverse = new StringBuilder();
        int length = splitEndString.length();
        for (int i = 0; i < length; i++) {
            reverse.insert(0, splitEndString.charAt(i));
        }
        System.out.println("每次切割的数据" + splitEndString);
        System.out.println("反转的数据" + reverse);
        return reverse.toString();
    }

    @Test
    public void toJsonString() {
        List<RecyclingDetailsBean> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            RecyclingDetailsBean recyclingDetailsBean = new RecyclingDetailsBean(i, 2.2, 2 + i);
            list.add(recyclingDetailsBean);
        }

        System.out.println(list.toString());
    }
}
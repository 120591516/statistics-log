package com.jinpaihushi.util;

import java.util.List;

public class CommonUtil {
    public static boolean checkUrl(List<String> goodsUrl, String urlAddress) {
        for (String string : goodsUrl) {
            if (urlAddress.contains(string)) {
                return true;
            }
        }
        return false;
    }
}

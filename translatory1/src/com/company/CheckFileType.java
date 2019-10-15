package com.company;

public class CheckFileType {
    public void showType(String content){

        String JSONPattern = "(\\[(\\{(\"[\\w|\\d|\\s|ąęćżźółńĄĘĆŻŹÓŁŃ@'\\/.,-]+\":\"[\\w|\\d|\\s|ąęćżźółńĄĘĆŻŹÓŁŃ@'\\/.,-]+\",?)+}[,|\\]]\\s*)+)";
        if(content.matches(JSONPattern)) System.out.println("JSON file");
        String XMLPattern = "((<\\?[\\s\\d\\w\\S|='.]*\\?>)*\\s*<dataset>\\s*(<record>(<[\\w|\\d|\\s|ąęćżźółńĄĘĆŻŹÓŁŃ@'\\/.-]+>[\\w|\\d|\\s|ąęćżźółńĄĘĆŻŹÓŁŃ@'\\/.-]+<\\/[\\w|\\d|\\s|ąęćżźółńĄĘĆŻŹÓŁŃ@'\\/.-]+>)+<\\/record>)+(<\\/dataset>))";
        if(content.matches(XMLPattern)) System.out.println("XML file");

    }
}

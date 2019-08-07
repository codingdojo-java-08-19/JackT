public class StringManipulator{
    public String trimAndConcat(String str1, String str2){
        str1 = str1.trim();
        str2 = str2.trim();
        String newstr = str1.concat(str2);
        return newstr;
    }

    public Integer getIndexOrNull(String str, char chr){
        int num = str.indexOf(chr);
        if (num == -1){
            return null;
        }
                
        return num;
    }

    public Integer getIndexOrNull(String str1, String str2){
        int num = str1.indexOf(str2);
        if (num==-1){
            return null;
        }
        return num;
    }

    public String concatSubstring(String str1, int num1, int num2, String str2){
        str1 = str1.substring(num1, num2);
        String newstr = str1.concat(str2);        
        return newstr;
    }
}
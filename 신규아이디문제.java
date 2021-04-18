class fix {
    //2021 KAKAO BLIND RECRUITMENT 문제 - 신규아이디
    static String temp="";
    public static String fix1(String s) {
        temp=s.toLowerCase();
        temp=temp.replaceAll("[~!@#$%^&*()=+\\[\\{\\]\\}:?,<>//]","");//equal replaceAll("[^.-_0-9a-zA-Z]","")
        temp=temp.replaceAll("[.]{2,}",".");

        if (temp.startsWith(".") && temp.length()>=1) {
            temp=temp.substring(1,temp.length());
        }
        if (temp.endsWith(".")&&temp.length()>=1) {
            temp=temp.substring(0,temp.length()-1);
        }
        //equals temp=temp.replaceAll("^[.]|[.]$","")


        if (temp.length()==0) {
            temp+="a";
        }

        if (temp.length()>=16) {
            temp=temp.substring(0,15);
            if (temp.endsWith(".")) {
                temp=temp.substring(0,temp.length()-1);
            }
        }

        while (temp.length()<3) {
            temp+=temp.substring(temp.length()-1,temp.length());
        }


        return temp;

    }
}


public class Hello2 {
    public static void main(String[] args) {
        String[] question={"...!@BaT#*..y.abcdefghijklm","z-+.^.","=.=","123_.def","abcdefghijklmn.p","~!@#$%&*()=+[{]}:?,<>/"};

        for (String p:question) {
            System.out.println(fix.fix1(p));
        }
    }
    /* 결과
        bat.y.abcdefghi
        z--
        aaa
        123_.def
        abcdefghijklmn
        aaa
        */
}

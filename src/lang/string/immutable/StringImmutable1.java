package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = str.concat("java");
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);


        // 문자열이 특정 접두사, 접미사 포함
        if(str.startsWith("h") && str.endsWith("o")) {
            System.out.println("h로 시작, o로 끝남");
        }


    }
}

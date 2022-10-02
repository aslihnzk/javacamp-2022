public class Main {
    public static void main(String[] args) {
        String mesaj ="Bugün hava çok güzel.";
        System.out.println("Eleman sayısı :"+mesaj.length());
        System.out.println("5.eleman :"+mesaj.charAt(4));
        System.out.println(mesaj.contac("Yaşasın!"));
        System.out.println(mesaj.startsWith("B"));
        char[]karakterler =new char[5];
        mesaj.getChars(srcBegin:0,srcEnd 5,karakterler,dstBegin:0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf(str"a"));




    }
}

package HomeWorks;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.printf("%-23s%-9s%-2d%-5s%-7s%-1s%-4d%-13s%-2s%-31s%-3s%-5d%-3s%-3d%n", "Переменная типа byte",
                "занимает",
                Byte.BYTES, "Байт",
                "памяти", "(",Byte.SIZE,
                "бит памяти),", "и","принимает значения в диапазоне","от",Byte.MIN_VALUE,"до", Byte.MAX_VALUE);

        System.out.printf("%-23s%-9s%-2d%-5s%-7s%-1s%-4d%-13s%-2s%-31s%-3s%-7d%-3s%-3d%n", "Переменная типа short",
                "занимает",
                Short.BYTES, "Байт",
                "памяти", "(",Short.SIZE,
                "бит памяти),", "и","принимает значения в диапазоне","от",Short.MIN_VALUE,"до", Short.MAX_VALUE);

        System.out.printf("%-23s%-9s%-2d%-5s%-7s%-1s%-4d%-13s%-2s%-31s%-3s%-12d%-3s%-3d%n", "Переменная типа int",
                "занимает",
                Integer.BYTES, "Байт",
                "памяти", "(",Integer.SIZE,
                "бит памяти),", "и","принимает значения в диапазоне","от",Integer.MIN_VALUE,"до", Integer.MAX_VALUE);

        System.out.printf("%-23s%-9s%-2d%-5s%-7s%-1s%-4d%-13s%-2s%-31s%-3s%-21d%-3s%-3d%n%n", "Переменная типа long",
                "занимает",
                Long.BYTES, "Байт",
                "памяти", "(",Long.SIZE,
                "бит памяти),", "и","принимает значения в диапазоне","от",Long.MIN_VALUE,"до", Long.MAX_VALUE);

        System.out.printf("%-23s%-9s%-2d%-5s%-7s%-1s%-4d%-13s%-2s%-31s%-3s", "Переменная типа float",
                "занимает",
                Float.BYTES, "Байт",
                "памяти", "(",Float.SIZE,
                "бит памяти),", "и","принимает значения в диапазоне","от");
        System.out.print(Float.MIN_VALUE);
        System.out.printf("%-1s", "");
        System.out.printf("%-3s", "до");
        System.out.println(Float.MAX_VALUE);

        System.out.printf("%-23s%-9s%-2d%-5s%-7s%-1s%-4d%-13s%-2s%-31s%-3s", "Переменная типа double",
                "занимает",
                Double.BYTES, "Байт",
                "памяти", "(",Double.SIZE,
                "бит памяти),", "и","принимает значения в диапазоне","от");
        System.out.print(Double.MIN_VALUE);
        System.out.printf("%-1s", "");
        System.out.printf("%-3s", "до");
        System.out.println(Double.MAX_VALUE);
    }
}

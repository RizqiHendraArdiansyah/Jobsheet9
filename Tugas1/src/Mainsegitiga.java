public class Mainsegitiga {
    public static void main(String[] args){
        Segitiga sdt = new Segitiga();
        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("    MENGHITUNG SUDUT SEGITIGA   ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Total Hitung dari Sudut Pertama = " +sdt.totalSudut(20));
        System.out.println("Total Hitung dari Sudut Kedua = " +sdt.totalSudut(10, 20));
        System.out.println("Total Hitung dari Keliling Pertama = " +sdt.keliling(10, 20, 30));
        System.out.println("Total Hitung dari Keliling Kedua = " +sdt.keliling(6, 8));
        }
    }


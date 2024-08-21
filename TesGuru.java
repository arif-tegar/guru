import java.util.Scanner;
//Driver Class
public class TesGuru {

    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
      System.out.println("Nama");

      
      
      String nama = in.nextLine();
      System.out.println("Mapel :");
      String Mapel = in.nextLine();     
      System.out.println("Alamat:");
      String Alamat = in.nextLine();  
      System.out.println("ID :");

      //membuat obyek
      Guru aulia = new Guru (1, "aulia", "malang", "rpl");
      Guru pasha = new Guru(2, "Bu Phasa", "Malang","Rpl");
      Guru feni = new Guru(3, "feni", "malang", "mtk");
      Guru munif = new Guru(4, "munif", "malang", "agama");
      Guru bidin = new Guru(5, "bidin", "malang", "mtk");
        
    aulia.id =1;
    aulia.nama ="Bu aul";
    aulia.mapel ="Rpl";
    aulia.alamat ="Malang";
    
    pasha.id =2;
    pasha.nama ="Bu Pasha";
    pasha.mapel ="Rpl";
    pasha.alamat ="Malang";
    
    feni.id =3;
    feni.nama ="Bu feni";
    feni.mapel ="Mtk";
    feni.alamat ="Malang";
    
    munif.id =4;
    munif.nama ="Pak munif";
    munif.mapel ="Agama";
    munif.alamat ="Malang";

    bidin.id =5;
    bidin.nama ="Pak bidin";
    bidin.mapel ="Mtk";
    bidin.alamat ="Malang";
    
    System.out.println("Ini Data Bu Aulia");
    System.out.println(aulia.id);
    System.out.println(aulia.nama);
    System.out.println(aulia.alamat);
    
    System.out.println("Ini Data Bu Pasha");
    System.out.println(pasha.id);
    System.out.println(pasha.nama);
    System.out.println(pasha.alamat);

    System.out.println("Ini Data Bu feni");
    System.out.println(feni.id);
    System.out.println(feni.nama);
    System.out.println(feni.alamat);

    System.out.println("Ini Data Pak Munif");
    System.out.println(munif.id);
    System.out.println(munif.nama);
    System.out.println(munif.alamat);

    System.out.println("Ini Data Pak bidin");
    System.out.println(bidin.id);
    System.out.println(bidin.nama);
    System.out.println(bidin.alamat);

    aulia.print();
    pasha.print();
    feni.print();
    munif.print();
    bidin.print();
    }
}

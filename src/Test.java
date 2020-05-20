
import java.util.Scanner;


public class Test {
    private static Filmler filmler = new Filmler();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void islemleri_bastir() {
        
        System.out.println("\t 0-Islemleri Goruntule");
        System.out.println("\t 1-Filmleri goruntule");
        System.out.println("\t 2-Film Ekle");
        System.out.println("\t 3-Film Güncelle");
        System.out.println("\t 4-Film sil Sil");
        System.out.println("\t 5-Film Ara");
        System.out.println("\t 6-Uygulamadan Cık");
        
    }
    public static void filmGoruntule() {
        filmler.filmleriBastir();
        
    }
    public static void filmEkle(){
        
        System.out.println("Eklemek istediginiz filmin ismi:");
        
        String isim = scanner.nextLine();
        filmler.filmEkle(isim);
        
    }
    public static void filmGuncelle() {
        
        System.out.println("Guncellemek istediginiz pozisyon(1,2,3...)");
        
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        
        String yeni_isim = scanner.nextLine();
        
        filmler.filmGuncelle(yeni_isim, pozisyon - 1);
        
    }
    public static void sil() {
        
        System.out.println("Silmek istediginiz pozisyon (1,2,3....)");
        
        int pozisyon = scanner.nextInt();
        
        filmler.filmSil(pozisyon-1);
        
        
    }
    public static void ara() {
        
        System.out.println("Aramak istediğiniz Film:");
        
        String isim = scanner.nextLine();
        
        filmler.filmAra(isim);
        
        
    }
    
    
    public static void main(String[] args) {
        
        System.out.println("\t Film projesine hosgeldiniz...");
        
        islemleri_bastir();
        
        boolean cikis = false;
        
        int islem;
        
        while(!cikis) {
            System.out.println("Bir islem seciniz:");
            
            islem = scanner.nextInt();
            
            scanner.nextLine();
            
            switch(islem) {
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    filmGoruntule();
                    break;
                case 2:
                    filmEkle();
                    break;
                case 3:
                    filmGuncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Projeden Cıkılıyor...");
                    break;
           
                
                
            }
            
            
        }
        
        
    }
    
}

        
    

    


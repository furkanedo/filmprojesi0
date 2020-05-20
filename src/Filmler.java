
import java.util.ArrayList;


public class Filmler {
    private ArrayList<String> filmListesi = new ArrayList<String>();
    
    public void filmleriBastir() {
        
        System.out.println("Film Listesinde " + filmListesi.size() + " kadar film var");
        
        for (int i = 0; i < filmListesi.size();i++) {
            
            System.out.println((i+1) + ".film :" + filmListesi.get(i));
            
        }
    }
    public void filmEkle(String isim) {
        filmListesi.add(isim);
        
        System.out.println("Film Listesi Guncellendi...");
    }
    public void filmGuncelle(String yeni_isim,int pozisyon) {
        
        filmListesi.set(pozisyon, yeni_isim);
        
        System.out.println("Film Listesi Guncellendi...");
    }
    
    public void filmSil(int pozisyon) {
        
        String isim = filmListesi.get(pozisyon);
        
        filmListesi.remove(pozisyon);
        
        System.out.println(isim + " isimli film listeden silindi...");
       
    }
    public void filmAra(String filmIsmi) {
        
        int pozisyon = filmListesi.indexOf(filmIsmi);
        
        if (pozisyon >= 0) {
            System.out.println("Film Bulundu.");
            System.out.println(filmIsmi + " isimli Film " + (pozisyon+1) + ". pozisyonda");
            
        }
        else {
            System.out.println("Film Bulunamadi...");

        }
    }
}

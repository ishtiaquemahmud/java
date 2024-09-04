package Get_set;
import java.util.Scanner;

public class Anime {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("insert the season number");
        String a=sc.nextLine();



        Get_set anime=new Get_set("jujustsu_kaisen","2" , "zoro");
        Get_set cartoon=new Get_set("naruto", "2", "zoro");

        anime.setseason(a);
        anime.setsite("crunchyroll");


       System.out.println( anime.getseason());
       System.out.println(anime.getsite());
    }
    
}

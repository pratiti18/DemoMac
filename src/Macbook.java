import java.util.Date;
//Example of dependency injection
public class Macbook {
   private final Keyboard kb;
   private final Mouse m;

   public Macbook(Keyboard kb,Mouse m){
       this.kb=kb;
       this.m=m;

   }

}

package decorator2;

public class DecorateurAgLuminosite extends DecorateurFenetre
{
public DecorateurAgLuminosite (Fenetre  decorateurFenetre)
   {
super(decorateurFenetre);
   }
public void dessiner()
   {
	 decorateurAugLuminosite();
	 decorateurFenetre.dessiner();
 }
 private void decorateurAugLuminosite()
 {
 }
 public String decrire()
 {
     return decorateurFenetre.decrire() + ", avec une luminosité augmentée";
 }
}
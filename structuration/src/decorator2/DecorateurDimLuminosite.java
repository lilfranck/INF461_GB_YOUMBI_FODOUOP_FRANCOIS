package decorator2;

public class DecorateurDimLuminosite extends DecorateurFenetre
{
public DecorateurDimLuminosite (Fenetre  decorateurFenetre)
   {
super(decorateurFenetre);
   }
public void dessiner()
   {
	 decorateurDimLuminosite();
	 decorateurFenetre.dessiner();
 }
 private void decorateurDimLuminosite()
 {
 }
 public String decrire()
 {
     return decorateurFenetre.decrire() + ", avec une luminosité diminuée";
 }
}
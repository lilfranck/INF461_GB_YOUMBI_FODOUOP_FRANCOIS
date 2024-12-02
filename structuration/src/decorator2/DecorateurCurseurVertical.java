package decorator2;

public class DecorateurCurseurVertical extends DecorateurFenetre
{
public DecorateurCurseurVertical (Fenetre  decorateurFenetre)
   {
super(decorateurFenetre);
   }
public void dessiner()
   {
	 decorateurCurseurVertical();
	 decorateurFenetre.dessiner();
 }
 private void decorateurCurseurVertical()
 {
 }
 public String decrire()
 {
     return decorateurFenetre.decrire() + ", avec une barre verticale de défilement";
 }
}

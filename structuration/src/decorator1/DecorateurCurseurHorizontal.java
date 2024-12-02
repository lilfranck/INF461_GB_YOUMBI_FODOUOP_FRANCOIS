package decorator1;

public class DecorateurCurseurHorizontal extends DecorateurFenetre
{
public DecorateurCurseurHorizontal (Fenetre  decorateurFenetre)
   {
super(decorateurFenetre);
   }
public void dessiner()
   {
	 decorateurCurseurHorizontal();
	 decorateurFenetre.dessiner();
 }
 private void decorateurCurseurHorizontal()
 {
 }
 public String decrire()
 {
     return decorateurFenetre.decrire() + ", avec une barre horizontale de défilement";
 }
}

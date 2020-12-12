package exercice1H;

public class ArticleEnSolde extends Article{

    private int reduction;
   

    public ArticleEnSolde(String nom, int prix, int r�duction) {
        super(nom, prix);
        this.reduction = r�duction;
    }

    @Override
    public int afficher() {
        int percent = super.afficher()*reduction/100;
        return super.afficher() - percent;
    }
}



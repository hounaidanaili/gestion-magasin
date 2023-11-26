public class vendeur  extends employe{


    public  double tauxdev;
    public vendeur(int ident, String nom, String adrs, double nbhm, double tauxdev) {
        super(ident, nom, adrs, nbhm);
        this.tauxdev = tauxdev;
    }

    public void afficheemploye(){

        super.afficheemploye();
        System.out.println("le taux de vente: "+tauxdev);
    }

    public double salairvend()
    {
        double sal=450*tauxdev;

        return sal;

    }




















}

public class employe {
    protected int ident;
    protected  String nom;
    protected  String adrs;
    protected double nbhm;


    protected employe(int ident, String nom, String adrs, double nbhm) {
        this.ident = ident;
        this.nom = nom;
        this.adrs = adrs;
        this.nbhm = nbhm;
    }
    protected  void afficheemploye(){
        System.out.println("identifient : "+ident+" nom: "+nom+" adresse :"+adrs+" nombre d haure par mois"+nbhm);





    }



}

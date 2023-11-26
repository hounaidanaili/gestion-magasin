public class caisse  extends employe{
    public int numc;

    public caisse(int ident, String nom, String adrs, double nbhm, int numc) {
        super(ident, nom, adrs, nbhm);
        this.numc = numc;
    }

    public void afficheemploye(){

        super.afficheemploye();
        System.out.println("le le numero de caisse"+numc);
    }

    public double salaircaiss()
    {
        double sal=nbhm*5;
        if(nbhm>180)
            sal+=(nbhm-180)*5+1.15;


        return sal;


    }







}

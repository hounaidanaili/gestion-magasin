
    public class produit {



        public int ident;
        public String libel;
        public String marque;
        public Double prix;

        public produit(int ident, String libel, String marque, Double prix) {
            this.ident = ident;
            this.libel = libel;
            this.marque = marque;
            this.prix = prix;
        }

        public void affichep() {
            System.out.println("Prosuit=[" + ident + "/" + libel + "/" + marque + "/" + prix + "]");

        }

        public int getIdent() {
            return ident;
        }

        public void setIdent(int ident) {
            this.ident = ident;
        }

        public String getLibel() {
            return libel;
        }

        public void setLibel(String libel) {
            this.libel = libel;
        }

        public String getMarque() {
            return marque;
        }

        public void setMarque(String marque) {
            this.marque = marque;
        }

        public Double getPrix() {
            return prix;
        }

        public void setPrix(Double prix) {
            this.prix = prix;
        }

        public boolean comparer(produit pdt) {

            if((this.ident == pdt.ident) && (this.libel==pdt.libel) && (this.prix== pdt.prix))
                return true;
            else
                return  false;


        }
        public boolean comparer1(produit pdt1,produit pdt2) {

            if((pdt1.ident == pdt2.ident) && (pdt1.libel == pdt2.libel) && (pdt1.prix== pdt2.prix))


                return true;
            else

                return  false;


        }








    }

public class testmagasin {

    public static void main(String[] args) {

        produit p1=new produit(1021,"lait","delice",1.200);
        produit pp=new produit(1021,"lait","delice",1.200);
        produit p2=new produit(2510,"yaourt","vitalait",1.600);
        produit p3=new produit(3250,"tomate","sicam",1.200);
        magasin mgs=new magasin(12,"sidibouzid",20);
        mgs.ajouter(p1);
        mgs.ajouter(p2);
        mgs.ajouter(p3);
        mgs.affiche();


        if(p1.comparer(p2))
        {

            System.out.println("le deux produit identique");
        }
        else{

            System.out.println("les deux produit different");
        };


        if(p1.comparer(p1))

            System.out.println("le deux produit identique");

        else

            System.out.println("les deux produit different");




        System.out.println("le magasin numero  "+ mgs.numero+" comporte "+mgs.nbrproduit+" produits ");
         magasin mgs1=new magasin(1,"aziza","centre ville");
        magasin mgs2=new magasin(2,"monprix","csidibouzid");
        caisse caisaziza1=new caisse(1,"cisa ziza1","tunis",12,3);
        caisse caisaziza2=new caisse(2,"caiss aziza2","sousse",10,4);
        vendeur vendeuraziza=new vendeur(1,"vendeuraziza","sisibouzid",10,16);
        respensable respensableaziza=new respensable(1,"responsable aziza","sidibouzid",16,18.6);
        caisse caismonprix=new caisse(1,"caismon prix1","tunis",12,3);
        respensable respensablemonprix=new respensable(1,"responsable mon prix","sidibouzid",16,18.6);
        vendeur vendeurmonprix1=new vendeur(1,"vendeur mon prix 1 ","sisibouzid",10,16);
        vendeur vendeurmonprix2=new vendeur(2,"vendeur mon prix 2 ","sisibouzid",10,16);
        vendeur vendeurmonprix3=new vendeur(3,"vendeur mon prix3","sisibouzid",10,16);


        mgs1.ajoutempl(caisaziza1);
        mgs1.ajoutempl(caisaziza2);
        mgs1.ajoutempl(vendeuraziza);
        mgs1.ajoutempl(respensableaziza);
        mgs2.ajoutempl(caismonprix);
        mgs2.ajoutempl(respensablemonprix);
        mgs2.ajoutempl(vendeurmonprix1);
        mgs2.ajoutempl(vendeurmonprix2);
        mgs2.ajoutempl(vendeurmonprix3);
        caisaziza1.afficheemploye();
        caisaziza2.afficheemploye();
        vendeuraziza.afficheemploye();
        respensableaziza.afficheemploye();
        mgs1.ajouter(p1);
        mgs1.ajouter(p2);
        System.out.println("affichage toutale de magasin 1");
        mgs1.affichetout();

        System.out.println("calcul");
        System.out.println("salaire caissier "+caisaziza1.salaircaiss());
        respensableaziza.salaireresp();
        vendeuraziza.salairvend();

















    }
}

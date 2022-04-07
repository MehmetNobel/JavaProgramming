package replit4;

public class TreeSize {

    public static void main(String[] args) {

        int i;

        int growth=1;

        int treeSize=0;

        for (i=1; i<=3; i++) {


            System.out.println("year "+i+ " - growth "+growth+ " cm"+"\n"+

                    "tree size: "+treeSize+"cm");

            treeSize +=growth;
        }

        for (i=4; i<=10; i++) {

            growth=2;

            treeSize =treeSize+growth;

            System.out.println("year "+i+ " - growth "+growth+ " cm"+"\n"+

                    "tree size: "+treeSize+"cm");
        }



    }
}
package corejavaexamples;

public class Ex11_7 {

	public static void main(String[] args) {
		int [] nInPack = {5,10,10};
		 QTwoCapsule [][] pack = new QTwoCapsule[3][];
		 for(int i=0;i<pack.length;i++){
		 pack[i] = new QTwoCapsule[nInPack[i]];
		 for(int j=0;j<pack[i].length;j++){
		 pack[i][j] = new QTwoCapsule(0.5,"Formular"+i+j);
		 }
		 }
		 System.out.println(QTwoCapsule.nCapsules);

	}

}

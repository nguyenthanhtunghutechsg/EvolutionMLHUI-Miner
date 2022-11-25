package MLHUI_Miner2;

import java.io.IOException;

// TEST DRIVE FOR ML-HUI-MINER MC
// Coded by Trinh D.D. Nguyen
public class Main {

	public static void main(String[] args) throws IOException {

		String dataset = "T10I4D100K";
		String trans = dataset + ".txt";
		String taxonomy = dataset + "Taxonomy.txt";
		double minutil = 100000;
		for (int i = 0; i < 1; i++) {
			AlgoMLHUIMinerMC mlhuiminer = new AlgoMLHUIMinerMC();
			mlhuiminer.runAlgorithm(trans, taxonomy, null, minutil);
			mlhuiminer.printStats();
			//minutil-=10000;
		}
	}

}
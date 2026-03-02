package controller;

public class InverterVetorController {
	public InverterVetorController() {
		super();
	}
	
	public void inverter(int[] vet, int i, int j) {
		if (i >= j) {
            return;
        }

        int aux = vet[i];
        vet[i] = vet[j];
        vet[j] = aux;
    
        inverter(vet, i + 1, j - 1);
    }

}

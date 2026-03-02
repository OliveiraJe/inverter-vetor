package view;

import java.util.Arrays;
import java.util.Random;

import controller.InverterVetorController;

public class Principal {

	public static void main(String[] args) {
		InverterVetorController invertVet = new InverterVetorController();
		Random random = new Random();

        // Teste 1: Vetor de 10 posições
        int[] vet10 = new int[10];
        for (int i = 0; i < 10; i++) vet10[i] = random.nextInt(100) + 1; 

        System.out.println("Vetor de 10 posições (Original):  " + Arrays.toString(vet10));
        invertVet.inverter(vet10, 0, 9);
        System.out.println("Vetor de 10 posições (Invertido): " + Arrays.toString(vet10));

        System.out.println("\n------------------------------------------------------------------------------\n");

        // Teste 2: Vetor de 11 posições
        int[] vet11 = new int[11];
        for (int i = 0; i < 11; i++) vet11[i] = random.nextInt(100) + 1;

        System.out.println("Vetor de 11 posições (Original):  " + Arrays.toString(vet11));
        invertVet.inverter(vet11, 0, 10);
        System.out.println("Vetor de 11 posições (Invertido): " + Arrays.toString(vet11));
	}
}

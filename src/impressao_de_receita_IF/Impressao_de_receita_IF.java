package impressao_de_receita_IF;

import java.util.Scanner;

public class Impressao_de_receita_IF {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double peso;
		int dosagem, idade;
		
		System.out.println("Digite a idade do paciente.");
		idade = input.nextInt();
		
		System.out.println("Digite o peso do paciente.");
		peso = input.nextDouble();
		
		if (idade >= 12 && peso >=60) {
			dosagem = 1000 / 25;
			System.out.println("o paciente deve tomar por dose " + dosagem + " gotas do medicamento ");
		}else if (idade >= 12 && peso <60) {
			dosagem = 875 / 25;
			System.out.println("o paciente deve tomar por dose " + dosagem + " gotas do medicamento ");
		}else if (idade < 12 && peso >=5 && peso <=9 ) {
			dosagem = 125 / 25;
			System.out.println("o paciente deve tomar por dose " + dosagem + " gotas do medicamento ");
		}else if (idade < 12 && peso >=9.1 && peso <=16 ) {
			dosagem = 250 / 25;
			System.out.println("o paciente deve tomar por dose " + dosagem + " gotas do medicamento ");
		}else if (idade < 12 && peso >=16.1 && peso <=24 ) {
			dosagem = 375 / 25;
			System.out.println("o paciente deve tomar por dose " + dosagem + " gotas do medicamento ");
		}else if (idade < 12 && peso >=24.1 && peso <=30 ) {
			dosagem = 375 / 25;
			System.out.println("o paciente deve tomar por dose " + dosagem + " gotas do medicamento ");
		}else if (idade < 12 && peso >30 ) {
			dosagem = 500 / 25;
			System.out.println("o paciente deve tomar por dose " + dosagem + " gotas do medicamento ");
		}else {
			System.out.println("o paciente não deve tomar o medicamento ");
		}
		
		
		input.close();
	}

}


public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();		

	}
	
	private void start() {
		int idade;
		
		idade = 15;
		
		System.out.println(idade);
		
		idade = (idade + 5);
		idade = idade *2;
		System.out.println("Result 1" + idade);
		
		idade = idade -5;
		System.out.println("Result 2" + idade);

		if (idade < 20) {
			System.out.println("A idade é maior 20");
			
		}else {
			System.out.println("A Idade é menor que 20");
		}
		
		
	}

}

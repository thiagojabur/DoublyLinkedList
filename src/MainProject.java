import java.util.Random;

public class MainProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Criando pilha");
		Stack pilha = new Stack();
		for (int i = 1; i <4; i++) 
		 pilha.push(new DoublyNode(i));
		
		System.out.println(pilha);
		System.out.println("Retirou da pilha: " + pilha.pop());
		System.out.println(pilha);
		System.out.println("Retirou da pilha: " + pilha.pop());
		System.out.println(pilha);
		System.out.println("Retirou da pilha: " + pilha.pop());
		System.out.println(pilha);
		System.out.println("Retirou da pilha: " + pilha.pop());

		
		System.out.println("Criando fila");
		Queue fila = new Queue();
		for (int i = 1; i <5; i++) 
		 fila.enQueue(new DoublyNode(i));
		
		System.out.println(fila);
		System.out.println("Retirou da fila: " + fila.deQueue());
		System.out.println(fila);
		System.out.println("Retirou da fila: " + fila.deQueue());
		System.out.println(fila);
		System.out.println("Retirou da fila: " + fila.deQueue());
		System.out.println(fila);
		System.out.println("Retirou da fila: " + fila.deQueue());
		System.out.println(fila);
		
		/*
		System.out.println("Comparando listas");
		DoublyLinkedList listaDuplamenteEncadeada = new DoublyLinkedList();
		SimpleLinkedList listaSimples = new SimpleLinkedList();
		
		int tamanho_vetor = 3000000;
		int numeroAleatorio;
		int vetorNumeroAleatorio[] = new int [tamanho_vetor];
		
		Random random = new Random();
		
		for (int i = 0; i <= tamanho_vetor-1; i++) {
			numeroAleatorio = random.nextInt(100000);
		    vetorNumeroAleatorio[i] = numeroAleatorio;
		}
		
		 long tempoInicial = System.currentTimeMillis();
		//inserindo os numeros na lista simples
			for (int i = 0; i <= tamanho_vetor-1; i++) {
				listaSimples.addLast(new SimpleNode(vetorNumeroAleatorio[i]));
			}  
		 long tempoFinal = System.currentTimeMillis();

		 System.out.println("Lista simplesmente encadeada");
	     //System.out.println(listaSimples);
		 System.out.printf("%.3f ms%n", (tempoFinal - tempoInicial) / 1000d);
		
		tempoInicial = System.currentTimeMillis();
		for (int i = 0; i <= tamanho_vetor-1; i++) {
			listaDuplamenteEncadeada.addLast(new DoublyNode(vetorNumeroAleatorio[i]));
		}
		tempoFinal = System.currentTimeMillis();

		System.out.println("Lista duplamente encadeada");
		//System.out.println(listaDuplamenteEncadeada);
		System.out.printf("%.3f ms%n", (tempoFinal - tempoInicial) / 1000d);

		//apagando último elemento
		tempoInicial = System.currentTimeMillis();
		listaDuplamenteEncadeada.removeLast();
		tempoFinal = System.currentTimeMillis();
		System.out.printf("tempo remoção último na lista dupla");
		System.out.printf("%.3f ms%n", (tempoFinal - tempoInicial) / 1000d);

		System.out.printf("tempo remoção último na lista simples");
		tempoInicial = System.currentTimeMillis();
		listaSimples.removeLast();
		tempoFinal = System.currentTimeMillis();
		System.out.printf("%.3f ms%n", (tempoFinal - tempoInicial) / 1000d);
	    */
	}

}

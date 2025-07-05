public class Teste {
	public static void main(String[] args){
		
		Data dataNascimentop = new Data(11, 9, 2001);
		Data dataNascimentos = new Data(19, 3, 2003);
		Data dataNascimentot = new Data(5, 6, 2002);
		Data dataNascimentoq = new Data(11, 12, 2004);
		
		Aluno primeiro = new Aluno(1, "Hans", 'm', "12.345.678-9", "123.456.789-01", dataNascimentop);
		Aluno segundo = new Aluno(2, "Marcos", 'M', "98.765.432-1", "987.654.321-00", dataNascimentos);
	    	Aluno terceiro = new Aluno(3, "Laura", 'F', "56.789.123-4", "456.789.123-99", dataNascimentot);
	    	Aluno quarto = new Aluno(4, "Sofia", 'F', "34.567.890-2", "321.654.987-77", dataNascimentoq);
		
		primeiro.imprimir();
		System.out.println(' ');
		segundo.imprimir();
		System.out.println(' ');
		terceiro.imprimir();
		System.out.println(' ');
		quarto.imprimir();	
	}
	
}


public class TesteReferencias {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("André");
		String nome = gerente.getNome();
		gerente.setSalario(5000.0);
		
//		Funcionario funcionario = new Funcionario();
//		funcionario.setSalario(2000.0);
		
		EditorVideo editorVideo = new EditorVideo();
		editorVideo.setSalario(2500.0);
		
		Designer designer = new Designer();
		designer.setSalario(3000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
//		controle.registra(funcionario);
		controle.registra(editorVideo);
		controle.registra(designer);
		
		System.out.println(nome);
		System.out.println(controle.getSoma());
		
	}
}

import java.util.ArrayList;
import java.util.Scanner;

public class Contato extends Endereco{

	private int id;
	
	private String nome;
	
	private String profissao;
	
	private String numero;
	
	private String email;
 
	public Contato() {
		
	}

	public Contato(int id, String cidade, String estado, String bairro, String rua, String nome, String profissao,
			String numero, String email) {
		super(cidade, estado, bairro, rua);
		this.id=id;
		this.nome = nome;
		this.profissao = profissao;
		this.numero = numero;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	} 

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void crudCont() {
		
		Scanner sc = new Scanner(System.in);
		String cidade,estado,bairro,rua,nome,profissao,numero,email;
		int op = 1,i = 0,id = 0, opc = 0;
		ArrayList<Contato> coL = new ArrayList<Contato>();		
		while(op == 1) {
			System.out.println("Menu: ");
			System.out.println("\tDigite 0 para sair do programa!");
			System.out.println("\tDigite 1 para adicionar um contato!");
			System.out.println("\tDigite 2 para listar todos os contato!");
			System.out.println("\tDigite 3 para procurar um contato!");
			System.out.println("\tDigite 4 para deletar um contato!");	
			System.out.println("\tDigite 5 para editar um contato!");
			opc = sc.nextInt();
					
			switch (opc) {
				case 1 : 
					
			System.out.println("Nome do contado: ");
			nome = sc.next();
			System.out.println("Numero do contado: ");
			numero = sc.next();
			System.out.println("Estado do contado: ");
			estado = sc.next();
			System.out.println("Cidade do contado: ");
			cidade = sc.next();
			System.out.println("Rua do contado: ");
			rua = sc.next();
			System.out.println("Bairro do contado: ");
			bairro = sc.next();
			System.out.println("Email do contado: ");
			email = sc.next();
			System.out.println("Profissão do contado: ");
			profissao = sc.next();
			
			Contato c = new Contato(id, nome, numero, estado, cidade, rua, bairro, email, profissao);
			i++;	;
			
			id += 1;
			coL.add(c);
			break;
			
				case 2 :
					
					for(Contato c1 : coL) {
						System.out.println(c1);	
						if(coL.isEmpty()) {
							System.out.println("Vazio!");
						}
					}	
					
					break;
					
				case 3 :
					
					int search = 999;
					
					for(Contato cl : coL) {
											
						System.out.println("Digite o id que vocÃª deseja localizar: ");
						search = sc.nextInt();
						
						if(search == cl.getId()){
						System.out.println(cl);		
						}
						else
							System.out.println("NÃ£o encontrado!");
						}
					break;
					
				case 4 :
					
					int searchDl = 999;
					
					for(Contato cl : coL) {
											
						System.out.println("Digite o id que vocÃª deseja deletar: ");
						searchDl = sc.nextInt();
						
						if(searchDl == cl.getId()){
						coL.remove(cl.getId());
						System.out.println("Deletado!");
						break;
						}
						else
							System.out.println("Não encontrado!");
						}
					break;
					
				case 5 :
					
						int searchDl2 = 999, opEdt = 999, opWl = 1;
					
						for(Contato cl : coL) {
											
						System.out.println("Digite o id que você deseja Editar: ");
						searchDl2 = sc.nextInt();
						
						
						
						if(searchDl2 == cl.getId()){
						
						
						while(opWl ==1) {
							
							System.out.println("1 = Editar Bairro do contado: ");
							System.out.println("2 = Editar Cidade do contado: ");
							System.out.println("3 = Editar Estado do contado: ");
							System.out.println("4 = Editar Nome do contado: ");	
							System.out.println("5 = Editar Profissão do contado: ");
							System.out.println("6 = Editar Rua do contado: ");		
							System.out.println("7 = Editar Numero do contado: ");										
							System.out.println("8 = Editar Email do contado: ");
							
							opEdt = sc.nextInt();
							
							
						switch(opEdt) {
							case 1:
								System.out.println("1 = Editar Bairro do contado: ");
								cl.setBairro(bairro = sc.next());
								break;
							case 2:
								System.out.println("2 = Editar Cidade do contado: ");
								cl.setCidade(cidade = sc.next());
								break;
							case 3:
								System.out.println("3 = Editar Estado do contado: ");
								cl.setEstado(estado = sc.next());
								break;
							case 4:
								System.out.println("4 = Editar Nome do contado: ");
								cl.setNome(nome = sc.next());
								break;
							case 5:	
								System.out.println("5 = Editar Profissão do contado: ");
								cl.setProfissao(profissao = sc.next());
								break;
							case 6:
								System.out.println("6 = Editar Rua do contado: ");
								cl.setRua(rua = sc.next());
								break;
							case 7 :
								System.out.println("7 = Editar Numero do contado: ");	
								cl.setNumero(numero = sc.next());
								break;
							case 8:
								System.out.println("8 = Editar Email do contado: ");
								cl.setEmail(email = sc.next());
								break;
						}	

						System.out.println("Deseja Editar mais alguma informação ? [1] SIM - [2]NÃO");
						opWl = sc.nextInt();
						if(opWl == 1) {
							System.out.println("Voltando para o menu de edição! \n");
						}						
						else {
							System.out.println("Voltando para o menu principal! \n");
						}
						}
							}
						
						else {
							System.out.println("Não encontrado!");
							opWl = 000;
							op = 1;
						break;
						}
						
								}				
					
				case 0 : 
					op = 0;
					break;
			}
			
			if(op!=0) {
					System.out.println("\nCaso deseje voltar ao menu digite '1'!");
					op = sc.nextInt();
					}
			System.out.println("\nCaso deseje voltar ao menu digite '1'!");
			op = sc.nextInt();
				}
			}

	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", profissao=" + profissao + ", numero=" + numero + ", email="
				+ email + ", estado=" + this.getEstado() + ", Cidade=" + this.getCidade() + ", Rua="+ this.getRua() +
				", Bairro="+ this.getBairro() + "]";
	}
}

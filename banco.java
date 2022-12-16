import java.util.Scanner;
public class banco {

    public static void main (String []args) {

    	Scanner dados = new Scanner (System.in);

    	String nome;
    	int contaC, contaP, opcao, subOpcao;
    	double saldoContaCorrente=0, saldoPoupanca=0, creditar, debitar, transferencia, saldo=0;

    	System.out.println("Bem vindo ao Banco: ");
    	System.out.println("------------- // -------------");
    	System.out.println("Digite o seu nome: ");
    	nome=dados.nextLine();
    	System.out.println("------------- // -------------");
    	System.out.println("Digite o numero da conta corrente: ");
    	contaC=dados.nextInt();
    	System.out.println("------------- // -------------");
    	System.out.println("Digite o saldo da sua conta Corrente: ");
    	saldoContaCorrente=dados.nextDouble();
    	System.out.println("------------- // -------------");
    	System.out.println("Digite o numero da conta Poupan�a: ");
    	contaP=dados.nextInt();
    	System.out.println("------------- // -------------");
    	System.out.println("Saldo o saldo da sua conta Poupan�a");
    	saldoPoupanca=dados.nextDouble();
    	System.out.println("------------- // -------------");
    	System.out.println("Qual a opera��o deseja realizar:");
    	do {
    		System.out.println("1 - Creditar");
    		System.out.println("2 - Debitar");
    		System.out.println("3 - Transferir");
    		System.out.println("4 - Saldo");
    		System.out.println("5 - Sair");
    		opcao=dados.nextInt();
    		System.out.println("------------- // -------------");

			// COMANDO PARA A OP��O DE CREDITAR VALOR NAS CONTAS
    		if (opcao==1){
    			System.out.println("Voc� Escolheu Creditar");
    			System.out.println("------------- // -------------");
    			System.out.println("Em qual conta deseja Creditar ?");
    			System.out.println("1 - Corrente");
    			System.out.println("2 - Poupan�a");
    			System.out.println("------------- // -------------");
    			subOpcao=dados.nextInt();
    			if (subOpcao==1){
    				System.out.println("Qual o valor a creditar na conta corrente " +contaC );
    				creditar=dados.nextDouble();
    				saldoContaCorrente+=creditar;
    				System.out.printf("Saldo atual na Conta Corrente -> " + contaC + " R$ %.2f\n " , saldoContaCorrente);
    				System.out.println("------------- // -------------");
    			}
    			else if (subOpcao==2){
    				System.out.println("Qual o valor a creditar na conta Poupan�a " +contaP );
    				creditar=dados.nextDouble();
    				saldoPoupanca+=creditar;
    				System.out.printf("Saldo atual na Conta Corrente -> " + contaP + " R$ %.2f\n " , saldoPoupanca);
    				System.out.println("------------- // -------------");
    			}
    			else
    				System.out.println("OP��O INV�LIDA, TENTE NOVAMENTE");
    		}


    			//COMANDO PARA A OP��O DEBITAR VALOR NAS CONTAS
    		else if (opcao==2){
    			System.out.println("Voc� Escolheu Debitar");
    			System.out.println("------------- // -------------");
    			System.out.println("Em qual conta deseja Debitar ?");
    			System.out.println("1 - Corrente");
    			System.out.println("2 - Poupan�a");
    			System.out.println("------------- // -------------");
    			subOpcao=dados.nextInt();
    			if (subOpcao==1){
    				System.out.println("Qual o valor a debitar na conta corrente " +contaC );
    				debitar=dados.nextDouble();
    				saldoContaCorrente-=debitar;
    				System.out.printf("Saldo atual na Conta Corrente -> " + contaC + " R$ %.2f\n " , saldoContaCorrente);
    				System.out.println("------------- // -------------");
    			}
    			else if (subOpcao==2){
    				System.out.println("Qual o valor a debitar na conta Poupan�a " +contaP );
    				debitar=dados.nextDouble();
    				if (debitar>saldoPoupanca){
    				System.out.println("SALDO INSUFICIENTE");
    				System.out.printf("Saldo atual na Conta Corrente -> " + contaP + " R$ %.2f\n " , saldoPoupanca);
    				System.out.println("------------- // -------------");
    				}
    				else{
    					saldoPoupanca-=debitar;
    					System.out.printf("Saldo atual na Conta Corrente -> " + contaP + " R$ %.2f\n " , saldoPoupanca);
    				System.out.println("------------- // -------------");
    				}
    			}
    			else
    				System.out.println("OP��O INV�LIDA, TENTE NOVAMENTE");

    		}

    			//COMANDO PARA A OP��O DE TRANSFERIR VALOR NAS CONTAS
    		else if (opcao==3){
    			System.out.println("Voc� Escolheu Transferir");
    			System.out.println("------------- // -------------");
    			System.out.println("1 - Corrente para poupan�a");
    			System.out.println("2 - Poupan�a para conta corrente");
    			System.out.println("------------- // -------------");
    			subOpcao=dados.nextInt();
    			if (subOpcao==1){
    				System.out.println("Qual o valor a transferir da CC " +contaC+ " para CP " +contaP);
    				transferencia=dados.nextDouble();
    				saldoPoupanca+=transferencia;
    				saldoContaCorrente-=transferencia;
    				System.out.printf("Saldo atual na Conta Corrente -> " + contaC + " R$ %.2f\n " , saldoContaCorrente);
    				System.out.printf("Saldo atual na Conta Corrente -> " + contaP + " R$ %.2f\n " , saldoPoupanca);
    				System.out.println("------------- // -------------");
    			}
    			else if (subOpcao==2){
    				System.out.println("Qual o valor a transferir da CP " +contaP+ " para CC " +contaC);
    				transferencia=dados.nextDouble();
    				if (transferencia<=saldoPoupanca){
    					saldoContaCorrente+=transferencia;
    					saldoPoupanca-=transferencia;
    					System.out.printf("Saldo atual na Conta Corrente -> " + contaC + " R$ %.2f\n " , saldoContaCorrente);
    					System.out.printf("Saldo atual na Conta Corrente -> " + contaP + " R$ %.2f\n " , saldoPoupanca);
    				System.out.println("------------- // -------------");
    					}
    					else{

    					System.out.println();
    					System.out.println("SALDO INSUFICIENTE");
    					System.out.printf("Saldo atual na Conta Corrente -> " + contaC + " R$ %.2f\n " , saldoContaCorrente);
    					System.out.printf("Saldo atual na Conta Corrente -> " + contaP + " R$ %.2f\n " , saldoPoupanca);
    					System.out.println("------------- // -------------");
    					}
    			}

    		}

    			//COMANDO PARA OP��O DE VER O SALDO DAS CONTAS
    		else if (opcao==4){
    			System.out.println("Voc� Escolheu Saldo");
    			System.out.println("------------- // -------------");
    			System.out.println("Senhor "+nome);
    			System.out.printf("Saldo atual na Conta Corrente " + contaC + " R$ %.2f\n", saldoContaCorrente);
    			System.out.printf("Saldo atual na Conta Corrente " + contaP + " R$ %.2f\n", saldoPoupanca);
    			System.out.println("------------- // -------------");
    		}

    		//ENCERRAR O PROGRAMA
    		if (opcao==5){
    			System.out.println("Obrigado por trabalhar com o nosso banco!!!");
    		}
    	} while(opcao!=5);

    }



}
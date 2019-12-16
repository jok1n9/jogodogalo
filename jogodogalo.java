import java.util.Scanner;

	public class jogodogalo {
		public static void main(String[] args){
			Scanner notas= new Scanner(System.in);
			int g=0;
			char[] galo=new char[]{'1','2','3','4','5','6','7','8','9','i'};
			String player1, player2; 
			
			System.out.print("JOGO DO GALO\n\n");
			
			System.out.print("Nome do player 1: ");//nome dos jogadores 
			player1=notas.nextLine();
			System.out.print("Nome do player 2: ");
			player2=notas.nextLine();


			System.out.printf("%s  |  %s  |  %s\n", galo[0], galo[1], galo[2]);
			System.out.print("_____________\n");
			System.out.printf("\n%s  |  %s  |  %s\n", galo[3], galo[4], galo[5]);
			System.out.print("______________\n");
			System.out.printf("\n%s  |  %s  |  %s\n", galo[6], galo[7], galo[8]);
			
			System.out.printf("\nPrimeiro as bolas, depois as cruzes, escolha uma posição %s(número de 1 a 9):  ", player1);
			
			int op= notas.nextInt();
			
			while(victory(galo)==0){
			
				switch(op){
					case 1:
						if(galo[0] != '1'){
							System.out.print("Já jogou nesta posição escolha outro sítio, idiota");
							break;}
						else if((g%2)==0){galo[0]= '0';
						}else{galo[0]= 'x';}
						System.out.printf("%s  |  %s  |  %s\n", galo[0], galo[1], galo[2]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[3], galo[4], galo[5]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[6], galo[7], galo[8]);
						g++;
						break;
					case 2:
						if(galo[1] != '2'){
							System.out.print("Já jogou nesta posição escolha outro sítio, idiota");
							
							break;}
						else if((g%2)==0){galo[1]= '0';
						}else{galo[1]= 'x';}
						System.out.printf("%s  |  %s  |  %s\n", galo[0], galo[1], galo[2]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[3], galo[4], galo[5]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[6], galo[7], galo[8]);
						g++;
						
					break;
					case 3:
						if(galo[2]!= '3'){
							System.out.print("Já jogou nesta posição escolha outro sítio, idiota");
							break;}
						else if((g%2)==0){galo[2]= '0';
						}else{galo[2]= 'x';}
						System.out.printf("%s  |  %s  |  %s\n", galo[0], galo[1], galo[2]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[3], galo[4], galo[5]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[6], galo[7], galo[8]);
						g++;
					break;
					case 4:
						if(galo[3]!= '4'){
							System.out.print("Já jogou nesta posição escolha outro sítio, idiota");
							break;}
						else if((g%2)==0){galo[3]= '0';
						}else{galo[3]= 'x';}
						System.out.printf("%s  |  %s  |  %s\n", galo[0], galo[1], galo[2]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[3], galo[4], galo[5]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[6], galo[7], galo[8]);
						g++;
					break;
					case 5:
						if(galo[4]!= '5'){
							System.out.print("Já jogou nesta posição escolha outro sítio, idiota");
							break;}
						else if((g%2)==0){galo[4]= '0';
						}else{galo[4]= 'x';}
						System.out.printf("%s  |  %s  |  %s\n", galo[0], galo[1], galo[2]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[3], galo[4], galo[5]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[6], galo[7], galo[8]);
						g++;
					break;
					case 6:
						if(galo[5]!= '6'){
							System.out.print("Já jogou nesta posição escolha outro sítio, idiota");
							break;}
						else if((g%2)==0){galo[5]= '0';
						}else{galo[5]= 'x';}
						System.out.printf("%s  |  %s  |  %s\n", galo[0], galo[1], galo[2]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[3], galo[4], galo[5]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[6], galo[7], galo[8]);
						g++;
					break;
					case 7:
						if(galo[6]!= '7'){
							System.out.print("Já jogou nesta posição escolha outro sítio, idiota");
							break;}
						else if((g%2)==0){galo[6]= '0';
						}else{galo[6]= 'x';}
						System.out.printf("%s  |  %s  |  %s\n", galo[0], galo[1], galo[2]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[3], galo[4], galo[5]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[6], galo[7], galo[8]);
						g++;
					break;
					case 8:
						if(galo[7]!= '8'){
							System.out.print("Já jogou nesta posição escolha outro sítio, idiota");
							break;}
						else if((g%2)==0){galo[7]= '0';
						}else{galo[7]= 'x';}
						System.out.printf("%s  |  %s  |  %s\n", galo[0], galo[1], galo[2]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[3], galo[4], galo[5]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[6], galo[7], galo[8]);
						g++;
					break;
					case 9:
						if(galo[8]!= '9'){
							System.out.print("Já jogou nesta posição escolha outro sítio, idiota");
							break;}
						else if((g%2)==0){galo[8]= '0';
						}else{galo[8]= 'x';}
						System.out.printf("%s  |  %s  |  %s\n", galo[0], galo[1], galo[2]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[3], galo[4], galo[5]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[6], galo[7], galo[8]);
						g++;
					break;
					
					default:
						System.out.printf("%s  |  %s  |  %s\n", galo[0], galo[1], galo[2]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[3], galo[4], galo[5]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[6], galo[7], galo[8]);
						System.out.print("Joga direito idiota. -_-");
					break;}
					if(victory(galo)==1)break;
					if(op>0&& op<=9 && g%2==1){ System.out.printf("\nÉ a tua vez %s:  ", player2);
					}else{System.out.printf("\nÉ a tua vez %s:  ", player1);}
					op=notas.nextInt();
			}
			if(g%2==1){System.out.printf("Parabéns %s", player1);}
			else{System.out.printf("Parabéns %s", player2);}
		}
		public static int victory(char[] galo){
			int a=0;
			if((galo[0]==galo[1]&& galo[1]==galo[2]) || (galo[3]== galo[4]&& galo[4] == galo[5]) ||  (galo[6]== galo[7]&& galo[7]==galo[8]) ||(galo[0]== galo[4] && galo[4]== galo[8]) ||(galo[2]== galo[4] && galo[4]== galo[6] )||( galo[0]== galo[3]&& galo[3] == galo[6]) ||(galo[1]== galo[4]&& galo[4]== galo[7]) ||(galo[2]== galo[5]&& galo[5]== galo[8])){
				a=1;}
			return a;
		}
	
}


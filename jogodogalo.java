import java.util.Scanner;

	public class jogodogalo {
		public static void main(String[] args){
			Scanner notas= new Scanner(System.in);
			int g=0;
			char[] galo=new char[]{'0','1','2','3','4','5','6','7','8','i'};
			
			System.out.print("JOGO DO GALO\n\n");
			System.out.printf("%s  |  %s  |  %s\n", galo[0], galo[1], galo[2]);
			System.out.print("______________\n");
			System.out.printf("\n%s  |  %s  |  %s\n", galo[3], galo[4], galo[5]);
			System.out.print("______________\n");
			System.out.printf("\n%s  |  %s  |  %s\n", galo[6], galo[7], galo[8]);
			System.out.print("\nPrimeiro as bolas, depois as cruzes, escolha uma posição\n");
			int op= notas.nextInt();
			while(g<9){
				switch(op){
					case 0:
						if(galo[0] != '0'){
							System.out.print("Já jogou nesta posição escolha outro sítio:");
							break;}
						else if((g%2)==0){galo[0]= 'o';
						}else{galo[0]= 'x';}
						System.out.printf("%s  |  %s  |  %s\n", galo[0], galo[1], galo[2]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[3], galo[4], galo[5]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[6], galo[7], galo[8]);
						g++;
						break;
					case 1:
						if(galo[1] != '1'){
							System.out.print("Já jogou nesta posição escolha outro sítio:");
							
							break;}
						else if((g%2)==0){galo[1]= 'o';
						}else{galo[1]= 'x';}
						System.out.printf("%s  |  %s  |  %s\n", galo[0], galo[1], galo[2]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[3], galo[4], galo[5]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[6], galo[7], galo[8]);
						g++;
						
					break;
					case 2:
						if(galo[2]!= '2'){
							System.out.print("Já jogou nesta posição escolha outro sítio:");
							break;}
						else if((g%2)==0){galo[2]= 'o';
						}else{galo[2]= 'x';}
						System.out.printf("%s  |  %s  |  %s\n", galo[0], galo[1], galo[2]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[3], galo[4], galo[5]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[6], galo[7], galo[8]);
						g++;
					break;
					case 3:
						if(galo[3]!= '3'){
							System.out.print("Já jogou nesta posição escolha outro sítio:");
							break;}
						else if((g%2)==0){galo[3]= 'o';
						}else{galo[3]= 'x';}
						System.out.printf("%s  |  %s  |  %s\n", galo[0], galo[1], galo[2]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[3], galo[4], galo[5]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[6], galo[7], galo[8]);
						g++;
					break;
					case 4:
						if(galo[4]!= '4'){
							System.out.print("Já jogou nesta posição escolha outro sítio:");
							break;}
						else if((g%2)==0){galo[4]= 'o';
						}else{galo[4]= 'x';}
						System.out.printf("%s  |  %s  |  %s\n", galo[0], galo[1], galo[2]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[3], galo[4], galo[5]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[6], galo[7], galo[8]);
						g++;
					break;
					case 5:
						if(galo[5]!= '5'){
							System.out.print("Já jogou nesta posição escolha outro sítio:");
							break;}
						else if((g%2)==0){galo[5]= 'o';
						}else{galo[5]= 'x';}
						System.out.printf("%s  |  %s  |  %s\n", galo[0], galo[1], galo[2]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[3], galo[4], galo[5]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[6], galo[7], galo[8]);
						g++;
					break;
					case 6:
						if(galo[6]!= '6'){
							System.out.print("Já jogou nesta posição escolha outro sítio:");
							break;}
						else if((op%2)==0){galo[6]= 'o';
						}else{galo[6]= 'x';}
						System.out.printf("%s  |  %s  |  %s\n", galo[0], galo[1], galo[2]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[3], galo[4], galo[5]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[6], galo[7], galo[8]);
						g++;
					break;
					case 7:
						if(galo[7]!= '7'){
							System.out.print("Já jogou nesta posição escolha outro sítio:");
							break;}
						else if((g%2)==0){galo[7]= 'o';
						}else{galo[7]= 'x';}
						System.out.printf("%s  |  %s  |  %s\n", galo[0], galo[1], galo[2]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[3], galo[4], galo[5]);
						System.out.print("______________\n");
						System.out.printf("\n%s  |  %s  |  %s\n", galo[6], galo[7], galo[8]);
						g++;
					break;
					case 8:
						if(galo[8]!= '8'){
							System.out.print("Já jogou nesta posição escolha outro sítio:");
							break;}
						else if((g%2)==0){galo[8]= 'o';
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
					break;}
					System.out.print("\nAgora o adversário:  ");
					op=notas.nextInt();
			}
		}
		//public int victory(char[] galo){
			//int a=0;
			//if(galo[0]==galo[1]==galo[2] || galo[3]== galo[4]== galo[5] ||  galo[6]== galo[7]==galo[8] ||galo[0]== galo[4]== galo[8] ||galo[2]== galo[4]== galo[6] || galo[0]== galo[3]== galo[6] ||galo[1]== galo[4]== galo[7] ||galo[2]== galo[5]== galo[8]){
				//a=1;}
			//return a;
		//}
	
}


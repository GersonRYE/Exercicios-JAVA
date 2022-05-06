package ExercicioRevelo;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static boolean isValidPalindrome(String s) {
			  if(s == null || s.length() == 0) return false;
			  s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
			  for(int i = 0; i < s.length() ; i++) {
			    if(/*condi��o */) {
			      return false;
			    }
			  }
			  return true;
			
			  //2
//			  Marque a alternativa que melhor descreve a diferen�a entre Exception e Error
//			  no Java.
//
//			  Alternative
//			  Error define exce��es que n�o podem ser aceitas, enquanto que exception faz parte de uma biblioteca que estende o Error a novas possibilidades de estados;
//			  Ambas fazem parte da classe Throwable , onde a primeira trata condi��es espec�ficas que devem ser resgatadas, enquanto que a segunda define exce��es que n�o podem ser aceitas;
//			  Ambos fazem parte da mesma classe, onde o Error � um tipo de subclasse legada de Exception .
//			  Exception define uma exce��o que ser� gerada a partir de condi��es espec�ficas, j� o Error trata mensagens de runtime ;
//			  S�o classes diferentes e independentes que tratam respectivamente de exce��o � um erro esperado e outra que define o que deve ser considerado erro;
	

//			  Um applet � uma aplica��o que pode rodar dentro de uma outra aplica��o
//			  e/ou janela de aplica��o. No caso de um applet Java, ele pode ser enviado aos
//			  usu�rios em forma de bytecode Java e pode rodar em um navegador usando
//			  JVM. Sobre o ciclo de vida do applet podemos afirmar que cada pr�ximo
//			  est�gio de cada ciclo de vida � composto de:
//
//			  Alternative
//			  init(), paint() and destroy();
//			  init(), start(), paint(), stop() and destroy();
//			  start(), paint(), stop() and destroy();
//			  init(), start(), stop() and destroy();
//			  start(), paint() and stop();
//		
		
//			  O c�digo abaixo deve retornar o k-�simo maior elemento de uma lista de inteiros nums.
//			  Com qual linha o m�todo deve ser completado para que funcione corretamente?
//
//
//			  public int findKthLargest(int[] nums, int k) {
//
//			      Arrays.sort(nums);
//
//			      /* linha faltante */
//
//			  }
//
//			  Alternative
//			  return nums[nums.length-k];
//			  nums[k-nums.length]
//			  Eu n�o sei.
//			  return nums[k-nums.length];
//			  k = nums[nums.length-k]
			  
//			  O que ser� impresso e porque?
//
//					  class Example
//					  {
//					  public static void main(String args[]) {
//					  try{
//					  int dividend = 69;
//					  int divisor = 0;
//					  System.out.println(dividend/divisor);
//					  } catch(ArithmeticException e){
//					  System.out.println("Bug");
//					  }
//					  finally{
//					  System.out.println("Bag");
//					  }
//					  System.out.println("Big");
//					  }
//					  }
//					  Alternative
//					  �Big� O bloco catch{} e finally{} n�o ser�o executados apesar de haver exce��o.
//					  �Big Bug Bag� O bloco finally{} sempre ser� executado, independente de haver exce��o ou n�o e a sequ�ncia se d� pelo que est� fora do catch{
//					  �Bag Big� O bloco catch{} n�o ser� executado, pois n�o houve uma exce��o;
//					  �Bug Bag Big� O bloco finally{} sempre ser� executado, independente de haver exce��o ou n�o;
//					  �Bug Big� O bloco finally{} sempre ser� ignorado, pois houve uma exce��o;
		
		
//			  Considerando o seguinte c�digo, que retorna o menor n�mero de uma lista
//			  n�o vazia, qual linha est� faltando?
//
//
//			  public int getSmallest(int[] numbers) {
//
//			      int result = numbers[0];
//
//			      for(int i = 0; i < numbers.length;i++){
//
//			          for(int j = i + 1; j < numbers.length; j++){
//
//			              // line
//
//			          }
//
//			      }
//
//			      return result;
//
//			  }
//
//			  Alternative
//			  if (numbers[j] == result) { continue; }
//			  if (numbers[j] < result) { result = numbers[j]; }
//			  if (numbers[j] > result) { result = numbers[j]; }
//			  if (numbers[j] != result) { break; }
//			  Nenhuma das anteriores
		
		
//			  A seguinte classe Java � a �nica salva num arquivo sem nome, apenas com a
//			  extens�o �.java�, sobre ela � correto afirmar que:
//
//			  class classy{
//			  public static void main(String args[]){
//			  System.out.println("Coffee is the world");
//			  }
//			  }
//
//			  Alternative
//			  Pode ser compilado usando o comando �javac .java� e rodado usando o comando �java classy�;
//			  Pode ser compilada normalmente usando o comando �javac .java�, no entanto n�o ser� poss�vel rodar;
//			  N�o � poss�vel ser compilada, para isso o nome do arquivo n�o pode ser vazio;
//			  Por padr�o a classe principal, que no caso � a �nica classe, � tida como nome de refer�ncia para a compila��o e logo o comando �javac classy.java� deve funcionar normalmente;
//			  Pode ser referenciado para a compila��o, por�m a falta de uma classe main impede seja terminada.
		
//			  
//			  Considerando o seguinte m�todo em Java (que retorna o �ndice de um dado
//					  n�mero em uma lista, ou -1 se o elemento n�o est� presente) qual linha deve
//					  ser inserida no lugar do coment�rio �// line� para implement�-lo corretamente?
//
//
//					  public int findIndex(int[] numbers, int number) {
//
//					      for(int i = 0; i< numbers.length; i++) {
//
//					          //line
//
//					      }
//
//					      return -1;
//
//					  }
//
//					  Alternative
//					  Nenhuma das anteriores
//					  if (numbers == number[i]) { return i; }
//					  if (numbers[i] == number) { return i; }
//					  if (numbers[i] >= number) { return i; }
//					  if (numbers[i] == number) { return numbers[i]; }
		
		
	
			  
//			  Considerando o seguinte m�todo em Java, que mede a altura de uma
//			  BinaryTree, qual linha deve ser inserida no lugar do coment�rio �// line� para
//			  devolver corretamente a altura da �rvore?
//
//
//			  public int height(Node node) {
//
//			      if(node == null){
//
//			          return -1;
//
//			      } else {
//
//			          //line
//
//			      }
//
//			  }
//
//			  Alternative
//			  return 1 + height(node.left) + height(node.right);
//			  return -1 + Math.max(height(node.left), height(node.right));
//			  Nenhuma das anteriores
//			  return 1 + Math.min(height(node.left), height(node.right));
//			  return 1 + Math.max(height(node.left), height(node.right));  
//			  
	
		
//			  public boolean isAnagram(String s, String t) {
//
//				    if(s==null || t==null)
//
//				        return false; 
//
//				    if(/*Condi��o faltante */)
//
//				        return false;
//
//				    int[] arr = new int[26];
//
//				    for(int i=0; i < s.length(); i++){
//
//				        arr[s.charAt(i)-'a']++;
//
//				        arr[t.charAt(i)-'a']--;
//
//				    }
//
//				    for(int i: arr){
//
//				        if(i!=0)
//
//				            return false;
//
//				    }
//
//				    return true;
//
//				}
//
//				O m�todo acima deve verificar se uma palavra t � ou n�o um anagrama de outra palavra s, considerando apenas as 26 letras do alfabeto.
//				Contudo ele n�o verifica uma condi��o inicial.
//				Para que o c�digo funcione corretamente qual condi��o deve ser preenchida?
//
//				Alternative
//				Deve verificar se ambas strings s�o palavras v�lidas, ou seja, s�o palavras que fazem parte de algum idioma.
//				Eu n�o sei.
//				Deve verificar se ambas strings possuem n�mero de caracteres pares.
//				Deve verificar se ambas strings possuem a mesma l�ngua de origem.
//				Deve verificar se ambas strings possuem o mesmo tamanho, ou seja, s.length()!=t.length()
		}

}

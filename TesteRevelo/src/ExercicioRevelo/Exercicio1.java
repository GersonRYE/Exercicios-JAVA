package ExercicioRevelo;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static boolean isValidPalindrome(String s) {
			  if(s == null || s.length() == 0) return false;
			  s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
			  for(int i = 0; i < s.length() ; i++) {
			    if(/*condição */) {
			      return false;
			    }
			  }
			  return true;
			
			  //2
//			  Marque a alternativa que melhor descreve a diferença entre Exception e Error
//			  no Java.
//
//			  Alternative
//			  Error define exceções que não podem ser aceitas, enquanto que exception faz parte de uma biblioteca que estende o Error a novas possibilidades de estados;
//			  Ambas fazem parte da classe Throwable , onde a primeira trata condições específicas que devem ser resgatadas, enquanto que a segunda define exceções que não podem ser aceitas;
//			  Ambos fazem parte da mesma classe, onde o Error é um tipo de subclasse legada de Exception .
//			  Exception define uma exceção que será gerada a partir de condições específicas, já o Error trata mensagens de runtime ;
//			  São classes diferentes e independentes que tratam respectivamente de exceção á um erro esperado e outra que define o que deve ser considerado erro;
	

//			  Um applet é uma aplicação que pode rodar dentro de uma outra aplicação
//			  e/ou janela de aplicação. No caso de um applet Java, ele pode ser enviado aos
//			  usuários em forma de bytecode Java e pode rodar em um navegador usando
//			  JVM. Sobre o ciclo de vida do applet podemos afirmar que cada próximo
//			  estágio de cada ciclo de vida é composto de:
//
//			  Alternative
//			  init(), paint() and destroy();
//			  init(), start(), paint(), stop() and destroy();
//			  start(), paint(), stop() and destroy();
//			  init(), start(), stop() and destroy();
//			  start(), paint() and stop();
//		
		
//			  O código abaixo deve retornar o k-ésimo maior elemento de uma lista de inteiros nums.
//			  Com qual linha o método deve ser completado para que funcione corretamente?
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
//			  Eu não sei.
//			  return nums[k-nums.length];
//			  k = nums[nums.length-k]
			  
//			  O que será impresso e porque?
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
//					  “Big” O bloco catch{} e finally{} não serão executados apesar de haver exceção.
//					  “Big Bug Bag” O bloco finally{} sempre será executado, independente de haver exceção ou não e a sequência se dá pelo que está fora do catch{
//					  “Bag Big” O bloco catch{} não será executado, pois não houve uma exceção;
//					  “Bug Bag Big” O bloco finally{} sempre será executado, independente de haver exceção ou não;
//					  “Bug Big” O bloco finally{} sempre será ignorado, pois houve uma exceção;
		
		
//			  Considerando o seguinte código, que retorna o menor número de uma lista
//			  não vazia, qual linha está faltando?
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
		
		
//			  A seguinte classe Java é a única salva num arquivo sem nome, apenas com a
//			  extensão “.java”, sobre ela é correto afirmar que:
//
//			  class classy{
//			  public static void main(String args[]){
//			  System.out.println("Coffee is the world");
//			  }
//			  }
//
//			  Alternative
//			  Pode ser compilado usando o comando “javac .java” e rodado usando o comando “java classy”;
//			  Pode ser compilada normalmente usando o comando “javac .java”, no entanto não será possível rodar;
//			  Não é possível ser compilada, para isso o nome do arquivo não pode ser vazio;
//			  Por padrão a classe principal, que no caso é a única classe, é tida como nome de referência para a compilação e logo o comando “javac classy.java” deve funcionar normalmente;
//			  Pode ser referenciado para a compilação, porém a falta de uma classe main impede seja terminada.
		
//			  
//			  Considerando o seguinte método em Java (que retorna o índice de um dado
//					  número em uma lista, ou -1 se o elemento não está presente) qual linha deve
//					  ser inserida no lugar do comentário “// line” para implementá-lo corretamente?
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
		
		
	
			  
//			  Considerando o seguinte método em Java, que mede a altura de uma
//			  BinaryTree, qual linha deve ser inserida no lugar do comentário “// line” para
//			  devolver corretamente a altura da árvore?
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
//				    if(/*Condição faltante */)
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
//				O método acima deve verificar se uma palavra t é ou não um anagrama de outra palavra s, considerando apenas as 26 letras do alfabeto.
//				Contudo ele não verifica uma condição inicial.
//				Para que o código funcione corretamente qual condição deve ser preenchida?
//
//				Alternative
//				Deve verificar se ambas strings são palavras válidas, ou seja, são palavras que fazem parte de algum idioma.
//				Eu não sei.
//				Deve verificar se ambas strings possuem número de caracteres pares.
//				Deve verificar se ambas strings possuem a mesma língua de origem.
//				Deve verificar se ambas strings possuem o mesmo tamanho, ou seja, s.length()!=t.length()
		}

}

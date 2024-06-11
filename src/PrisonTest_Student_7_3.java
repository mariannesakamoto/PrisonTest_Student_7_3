// Classe PrisonTest
public class PrisonTest_Student_7_3 {
    public static void main(String[] args) {
        // Instanciando dois prisioneiros com nomes usando a palavra-chave 'new'
        String name1 = new String("Bubba");
        String name2 = new String("Bubba");

        // Testando a igualdade das Strings usando ==
        System.out.println("Usando a palavra-chave 'new':");
        System.out.println("name1 == name2: " + (name1 == name2)); // Deve imprimir "false"

        // Instanciando dois prisioneiros com nomes diretamente (sem a palavra-chave 'new')
        String name3 = "Bubba";
        String name4 = "Bubba";

        // Testando a igualdade das Strings sem usar ==
        System.out.println("\nSem usar a palavra-chave 'new':");
        System.out.println("name3 == name4: " + (name3 == name4)); // Pode imprimir "true" ou "false" dependendo da otimização do Java
    }
}
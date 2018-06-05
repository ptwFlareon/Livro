package projetolivro;

import javax.swing.JOptionPane;

public class ProjetoLivro {

    public static void main(String[] args) {

        LivroBiblioteca[] biblioteca = new LivroBiblioteca[3];
        LivroLivraria[] livraria = new LivroLivraria[3];
    
        
        for (int i=0; i < livraria.length; i++){
            
            LivroLivraria l1 = new LivroLivraria();
            l1.setAutor("Fulano");     
            l1.setEditora("Teste");
            l1.setISBN("132");
            l1.setNumpaginas(123);
            l1.setTitulo("Teste");
            l1.setValor(50);
            livraria[i] = l1;
            
            System.out.println(l1.getTitulo());
            System.out.println(l1.getValor());
        
        }
        
        for (int i=0; i < biblioteca.length; i++){
            
            LivroBiblioteca l1 = new LivroBiblioteca();
            l1.setAutor("Fulano");     
            l1.setEditora("Teste");
            l1.setNumpaginas(123);
            l1.setTitulo("Teste");
            l1.setQtdexemplares(55);
            biblioteca[i] = l1;
            
            System.out.println(l1.getTitulo());
            System.out.println(l1.getQtdexemplares());
        
        }
        
        
        
        

        }
    }
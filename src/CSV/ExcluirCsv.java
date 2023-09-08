package CSV;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExcluirCsv {
    public  void excluirConteudoProdutoCsv() {
        try {
            File arquivoCsv = new File("src/Banco de Dados/BD.csv");
            
            // Verifica se o arquivo existe
            if (arquivoCsv.exists()) {
                StringBuilder linhaCSV = new StringBuilder();
                FileWriter escritor = new FileWriter(arquivoCsv);
                linhaCSV.append("");
                escritor.write(linhaCSV.toString());
                escritor.close();
                System.out.println("Conteúdo do arquivo BD CSV excluído com sucesso.");
            } else {
                System.out.println("O arquivo BD CSV não existe.");
            }
        } catch (IOException e) {
            System.err.println("Erro ao excluir o conteúdo do arquivo BD CSV: " + e.getMessage());
        }
    }

    public  void excluirConteudoFuncionarioCsv() {
        try {
            File arquivoCsv = new File("src/Banco de Dados/Funcionarios.csv");
            
            // Verifica se o arquivo existe
            if (arquivoCsv.exists()) {
                StringBuilder linhaCSV = new StringBuilder();
                FileWriter escritor = new FileWriter(arquivoCsv);
                linhaCSV.append("");
                escritor.write(linhaCSV.toString());
                escritor.close();
                System.out.println("Conteúdo do arquivo Funcionarios CSV excluído com sucesso.");
            } else {
                System.out.println("O arquivo Funcionarios CSV não existe.");
            }
        } catch (IOException e) {
            System.err.println("Erro ao excluir o conteúdo do arquivo Funcionarios CSV: " + e.getMessage());
        }
    }
}



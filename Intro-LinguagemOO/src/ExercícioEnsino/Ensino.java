package ExercícioEnsino;

import java.util.Scanner;

public class Ensino {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Aluno A1 = new Aluno();
        String nome_disciplinas[] = new String[3];
        System.out.print("Digite o nome do Aluno: ");
        A1.setNome_aluno(dado.nextLine());
        System.out.print("Digite a Matrícula do Aluno: ");
        A1.setNum_matricula(dado.nextLine());
        System.out.print("Digite o nome do Curso do Aluno: ");
        A1.setNome_curso(dado.nextLine());
        for (int i = 0; i <= 2; i++) {
            int indice_nome = i + 1;
            System.out.print("Digite o nome da " + indice_nome + "ª disciplina do Aluno: ");
            A1.setNome_disciplinas(nome_disciplinas);
            nome_disciplinas[i] = dado.nextLine();

        }

        double notas1[] = new double[4];
        double notas2[] = new double[4];
        double notas3[] = new double[4];

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                int indice_nota = j + 1;
                System.out.print("Digite a " + indice_nota + "ª nota da disciplina " + nome_disciplinas[i] + ": ");
                double nota = dado.nextDouble();
                switch (j) {
                    case 0:
                        notas1[j] = nota;
                        
                        break;

                    case 1:
                        notas2[j] = nota;
                        break;

                    case 3:
                        notas3[j] = nota;
                        break;

                }
            }
        }
        A1.setNotas1(notas1);
        System.out.println(A1.getNotas1()[0]);
        A1.setNotas2(notas2);
        A1.setNotas3(notas3);
        for(int i = 0; i<3; i++) {
            System.out.println("A Média da Disciplina " + A1.getNome_disciplinas()[i] + ": " + A1.calcularMedia(0));
        }


        for(int i = 0; i < 3; i++) {
            if (A1.analisarMedia(i) == true) {
            System.out.println("Aprovado na disciplina " + A1.getNome_disciplinas()[i]);
            } else {
            System.out.println("Reprovado na disciplina");
            }
        }
            
    }
}

